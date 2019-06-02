public class Stack
{
    private Entry top;


    public void Stack()                                                //Konstruktor
    {
        this.top=null;
    }

    public Entry getTop() {
        return top;
    }

    public void setTop(Entry top) {
        this.top = top;
    }

    public boolean isEmpty()
    {
        return top ==null;                                              //return null
    }

    public void push (Object pObject) {
        if(pObject != null)                                             //Überprüfung leeres Objekt
        {
            Entry newEntry = new Entry(pObject, null);             //Neuer Entry für dass Objekt
            if(this.isEmpty())                                          //Wenn der Stack leer ist
            {
                top=newEntry;
            }
            else                                                        //Wenn der Stack voll ist
            {
                newEntry.setNext(top);
                top = newEntry;}
        }


    }

    public void pop()
    {
       if(isEmpty()) return;                                            //wenn Stack leer ist
       if(top.getNext()==null) top=null;                                //wenn es kein weiteres Element gibt
       else top = top.getNext();                                        //wenn es eins gibt
    }

    public Object top()
    {
        if (this.isEmpty())                                             //wenn Stack leer ist
        {
            System.out.print("Stack leer");
            return null;
        }
        else                                                            //wenn er nicht leer ist
        {

            return top.getData();
        }
    }
}
