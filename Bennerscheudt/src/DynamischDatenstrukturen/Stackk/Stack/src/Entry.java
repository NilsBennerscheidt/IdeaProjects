public class Entry
{
    private  Entry next;
    private  Object data;

    public Entry(Object data,Entry next)
    {
        this.next=next;
        this.data=data;
    }

    public void setNext(Entry next) {
        this.next = next;
    }

    public Entry getNext() {
        return next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}