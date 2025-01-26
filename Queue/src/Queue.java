public class Queue<T> {
  private class Node {
    private T value;
    private Node next;

    public Node(T value) {
      this.value = value;
      this.next = null;
    }

    public T getValue() { return this.value; }
    public Node getNext() { return this.next; }
    
    public void setValue(T value) { this.value = value; }
    public void setNext(Node next) { this.next = next; }
  }

  private Node front;
  private Node rear;
  private int size;

  public Queue() {
    this.front = null;
    this.rear = null;
    this.size = 0;
  }

  public void enqueue(T value) {
    Node newNode = new Node(value);
    
    if (this.isEmpty()) {
      this.front = newNode;
      this.rear = newNode;
    } else {
      this.rear.setNext(newNode);
      this.rear = newNode;
    }

    this.size++;
  }

  public T dequeue() throws IllegalStateException {
    if (isEmpty()) {
      throw new IllegalStateException("The Queue is empty.");
    }
    T value = this.front.getValue();

    if (this.front == this.rear) {
      this.front = null;
      this.rear = null;
    } else {
      this.front = this.front.getNext();
    }

    this.size--;
    return value;
  }

  public T peek() throws IllegalStateException {
    if (this.isEmpty()) {
      throw new IllegalStateException("The Queue is empty.");
    }

    return this.front.getValue();
  }

  
  public int getSize() { return this.size; }

  public boolean isEmpty() { return this.size == 0; }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    Node current = this.front;

    while (current != null) {
      stringBuilder.append(current.getValue()).append(" -> ");
      current = current.getNext();
    }

    stringBuilder.append("null");
    return stringBuilder.toString();
  }

}