public class LinkedListService<T> {
    private Node<T> head;
    //Method to add nodes at front in the linked list
    public void add(T data)
    {
        Node<T> newNode = new Node<T>(data);
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    //Method to display linked list
    public void display()
    {
        Node<T> tempNode = head;
        while(tempNode != null)
        {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }

    }
}
