package DynamischDatenstrukturen.Liste.DieListe.src;

public class ListenElement
{
    private ListenElement next;                     //Zeiger auf das nächste Element
    private EMail Mail;

    public ListenElement(EMail Mail, ListenElement next)
    {
        this.next=next;
        this.Mail=Mail;
    }

    public void setNext(ListenElement next) {
        this.next = next;
    }

    public ListenElement getNext() {
        return next;
    }

    public EMail getContent() {                             //Daten der Emails
        return this.Mail;
    }
}
