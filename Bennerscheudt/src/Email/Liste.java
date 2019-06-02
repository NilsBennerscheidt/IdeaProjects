package Email;

public class Liste {
    private ListenElement fuss;
    private ListenElement kopf;
    private ListenElement currentElement;

    public Liste() {
        this.kopf = null;
        this.fuss = null;
        this.currentElement = null;
    }

    public boolean isEmpty() {
        return (this.kopf == null);
    }

    public void toFirst() {
        if (!this.isEmpty()) {
            this.currentElement = kopf;
        }
    }

    public void next() {
        if (!this.isEmpty()) {
            if (this.currentElement != fuss) {
                this.currentElement = (this.currentElement).getNext();
            } else {
                this.toFirst();
            }
        }
    }

    public EMail getItem() {
        if (!this.isEmpty()) {
            return currentElement.getContent();
        } else {
            return null;
        }
    }

    public void insertBehind(EMail mail) {
        ListenElement insert = new ListenElement(mail, null);
        {
            if (this.isEmpty()) {
                this.kopf = insert;
                this.fuss = insert;
                this.currentElement = insert;
            } else {
                if (currentElement == this.fuss) {
                    this.fuss.setNext(insert);
                    fuss = fuss.getNext();

                } else {
                    insert.setNext(this.currentElement.getNext());
                    this.currentElement.setNext(insert);
                }
            }
        }
    }


    private ListenElement getElementBefore(ListenElement elem) {
        if (isEmpty()) {

            System.out.println("Liste ist leer!");
            return null;
        } else {
            ListenElement current = elem;
            while (this.currentElement.getNext() != elem) {
                this.next();
            }
            ListenElement before = this.currentElement;
            this.next();
            return before;
        }
    }

    public void delete() {

        if (!this.isEmpty()) {
            if (this.kopf == this.fuss) {
                this.kopf = null;
                this.fuss = null;
            } else if (this.currentElement == this.kopf) {
                this.kopf = this.currentElement.getNext();
                this.currentElement = this.kopf;
            } else if (this.currentElement == this.fuss) {
                toFirst();
                while (this.currentElement.getNext() != this.fuss) {
                    this.next();
                }
                this.fuss = this.currentElement;
                this.currentElement.setNext(null);
            } else {
                ListenElement del = this.currentElement;
                ListenElement newNext = this.currentElement.getNext();
                toFirst();
                while (this.currentElement.getNext() != del) {
                    this.next();
                }
                this.currentElement.setNext(newNext);
            }


        }


    }

}
