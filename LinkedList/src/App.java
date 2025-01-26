import java.util.Scanner;

public class App {
    public static void displayOptions() {
        System.out.println("[1] Add a contact");
        System.out.println("[2] Remove a contact");
        System.out.println("[3] Search for a contact");
        System.out.println("[4] Display all contacts");
        System.out.println("[5] Exit");
        System.out.print("\nEnter your choice: ");
    }

    public static void main(String[] args) throws Exception {
        LinkedList<Contact> phonebook = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n========================= PHONEBOOK =========================\n");

        int choice;
        do {
            displayOptions();
            choice = scanner.nextInt();
        
            switch (choice) {
                case 1:
                    scanner.nextLine();
                    System.out.print("Enter the contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the contact phone number: ");
                    String phoneNumber = scanner.nextLine();

                    phonebook.addAtTail(new Contact(name, phoneNumber));
                    System.out.println("Contact saved successfully.\n");
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.print("Enter the contact name to remove: ");
                    String nameToDelete = scanner.nextLine();

                    for (int i = 0; i < phonebook.getSize(); i++) {
                        Contact contact = phonebook.getElementAt(i);
                        if (contact.getName().equals(nameToDelete)) {
                            System.out.println(contact.toString());
                            System.out.print("Do you want to delete this contact? [y/n]");

                            if (scanner.next().trim().equalsIgnoreCase("y")) {
                                phonebook.removeAt(i);
                                System.out.println("Contact removed successfully.\n");
                            }
                            break;
                        }
                    }
                    break;

                case 3:
                    scanner.nextLine();
                    System.out.print("Enter the contact name to search: ");
                    String nameToSearch = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < phonebook.getSize(); i++) {
                        Contact contact = phonebook.getElementAt(i);
                        if (contact.getName().equals(nameToSearch)) {
                            System.out.println(contact.toString());
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found.\n");
                    }
                    break;

                case 4:
                    System.out.println();
                    for (int i = 0; i < phonebook.getSize(); i++) {
                        System.out.println(phonebook.getElementAt(i).toString());
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice!= 5);

        scanner.close();

    }
}
