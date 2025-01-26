import java.util.Scanner;

public class App {

    public static int getStep() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n========================= JOSEPHUS PROBLEM =========================\n");
    
        int step;
        while (true) {
            System.out.print("Enter the step: ");
            if (scanner.hasNextInt()) {
                step = scanner.nextInt();
                if (step > 0) {
                    break;
                } else {
                    System.out.println("The step must be greater than 0.");
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // Limpa a entrada inválida
            }
        }

        scanner.close();
        return step;
    }

    public static void main(String[] args) throws Exception {
        Queue<String> queue = new Queue<>();
        String[] participants = {
                "Flavius Josephus",
                "Judas Macabeus",
                "Simão Macabeus",
                "João Hircano",
                "Alexandre Janeu",
                "Salomé Alexandra",
                "Aristóbulo II",
                "Hircano II",
                "Antígono II Matatias",
                "Herodes, o Grande",
                "Herodes Antipas",
                "Herodes Agripa I",
                "Herodes Agripa II",
                "Gamaliel",
                "Hillel",
                "Shammai"
        };

        // Enfileira os participantes
        for (String participant : participants) {
            queue.enqueue(participant);
        }

        int step = getStep();

        System.out.println("Initial Queue size: " + queue.getSize());
        System.out.println("Step: " + step + "\n");
        
        System.out.println("\n========================= START =========================\n");

        while (queue.getSize() > 1) {
            // Reorganiza os participantes simulando o movimento circular
            for (int i = 0; i < step - 1; i++) {
                queue.enqueue(queue.dequeue());
            }

            System.out.println("Removed: " + queue.dequeue());
        }

        System.out.println("\n========================= WINNER =========================\n");
        System.out.println("The winner is: " + queue.dequeue());

        System.out.println("\n========================= END =========================\n");
    }
}
