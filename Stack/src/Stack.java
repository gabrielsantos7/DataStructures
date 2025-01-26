public class Stack<T> {
  private class Node {
    private Node next;
    private T value;

    public Node(T value) {
      this.next = null;
      this.value = value;
    }

    public T getValue() {
      return this.value;
    }

    public Node getNext() {
      return this.next;
    }

    public void setNext(Node next) {
      this.next = next;
    }
  }

  private Node top;
  private int size;

  public Stack() {
    this.top = null;
    this.size = 0;
  }

  public int getSize() {
    return this.size;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public void push(T value) {
    Node newNode = new Node(value);
    newNode.setNext(this.top);
    this.top = newNode;
    this.size++;
  }

  public T pop() throws IllegalStateException {
    if (this.isEmpty()) {
      throw new IllegalStateException("Stack is empty");
    }

    T value = this.top.getValue();
    this.top = this.top.getNext();
    this.size--;
    return value;
  }

  public T peek() throws IllegalStateException {
    if (this.isEmpty()) {
      throw new IllegalStateException("Stack is empty");
    }
    return this.top.getValue();
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    Node current = this.top;
    
    while (current != null) {
      stringBuilder.append(current.getValue()).append(" -> ");
      current = current.getNext();
    }
    stringBuilder.append("null");
    return stringBuilder.toString();
  }


}