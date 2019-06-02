package DieLieste;

public class ListenElement {
    private Email mail ;
    private ListenElement next;

    public Email getContent(){
        return mail;
    }


    public ListenElement(Email mail, ListenElement next) {
        this.mail = mail;
        this.next = next;
    }

    public Email getMail() {
        return mail;
    }

    public void setMail(Email mail) {
        this.mail = mail;
    }

    public ListenElement getNext() {
        return next;
    }

    public void setNext(ListenElement next) {
        this.next = next;
    }
}
