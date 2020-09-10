
public class Queue_example {
    
    int Queue[] =new int[5];
    int size;
    int front;
    int rear;
    public void enQueue(int data)
    {
        Queue[rear]=data;
        rear=rear+1;
        size=size-1;
    }
    public void show()
    {
        
    }
}
