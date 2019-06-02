package Email;

public class ListenElement {
    private ListenElement next;
    private EMail Mail;

    public ListenElement(EMail Mail, ListenElement next) {
        this.next = next;
        this.Mail = Mail;
    }

    public void setNext(ListenElement next) {
        this.next = next;
    }

    public ListenElement getNext() {
        return next;
    }

    public EMail getContent() {
        return this.Mail;
    }
}
