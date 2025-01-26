public class LinkedList<T> {
  private class Node {
    private T value;
    private Node next;

    public Node(T value) {
      this.value = value;
      this.next = null;
    }

    public T getValue() { return this.value; }
    public void setValue(T value) { this.value = value; }

    public Node getNext() { return this.next; }
    public void setNext(Node next) { this.next = next; }
  }

  private Node head;
  private Node tail;
  private int size;

  public LinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public void addAtHead(T value) {
    Node newNode = new Node(value);
    if (this.isEmpty()) {
      this.head = newNode;
      this.tail = this.head;
    } else {
      newNode.setNext(this.head);
      this.head = newNode;
    }
    this.size++;
  }

  public void addAtIndex(int index, T value) throws IndexOutOfBoundsException {
    if (index < 0 || index > this.size) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    if (index == 0) {
      addAtHead(value);
    } else if (index == this.size) {
      addAtTail(value);
    } else {
      Node newNode = new Node(value);
      Node current = this.head;
      for (int i = 0; i < index - 1; i++) {
        current = current.getNext();
      }
      newNode.setNext(current.getNext());
      current.setNext(newNode);
      this.size++;
    }
  }

  public void addAtTail(T value) {
    Node newNode = new Node(value);
    if (this.isEmpty()) {
      this.head = newNode;
      this.tail = this.head;
    } else {
      this.tail.setNext(newNode);
      this.tail = newNode;
    }
    this.size++;
  }

  public T getElementAt(int index) throws IndexOutOfBoundsException {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    Node current = this.head;
    for (int i = 0; i < index; i++) {
      current = current.getNext();
    }
    return current.getValue();
  }

  public void removeAt(int index) throws IndexOutOfBoundsException {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    if (index == 0) {
      this.head = this.head.getNext();
      if (this.head == null) {
        this.tail = null;
      }
    } else {
      Node current = this.head;
      for (int i = 0; i < index - 1; i++) {
        current = current.getNext();
      }
      Node toRemove = current.getNext();
      current.setNext(toRemove.getNext());
      if (toRemove == this.tail) {
        this.tail = current;
      }
    }
    this.size--;
  }

  public void clear() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public T pop() throws IllegalStateException {
    if (this.isEmpty()) {
      throw new IllegalStateException("The list is empty");
    }
    T value;
    if (this.head == this.tail) {
      value = this.head.getValue();
      this.head = null;
      this.tail = null;
    } else {
      Node current = this.head;
      while (current.getNext() != this.tail) {
        current = current.getNext();
      }
      value = this.tail.getValue();
      this.tail = current;
      this.tail.setNext(null);
    }
    this.size--;
    return value;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public int getSize() {
    return this.size;
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    Node current = this.head;
    while (current != null) {
      stringBuilder.append(current.getValue()).append(" -> ");
      current = current.getNext();
    }
    stringBuilder.append("null");
    return stringBuilder.toString();
  }
}
