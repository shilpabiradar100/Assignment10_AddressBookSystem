public class Node<T> {
    public T data;
    public Node<T> next;
    //constructor
    public Node(T data)
    {
        this.data = data;
    }
    //setters and getters
    public T getData()
    {
        return data;
    }
    public void setData(T data)
    {
        this.data = data;
    }
}
