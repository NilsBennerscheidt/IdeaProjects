package DieLieste;

public class Liste {
    private ListenElement foot;
    private  ListenElement head;
    private ListenElement current;

    public boolean isEmpty(){


        return(this.head == null);
    }

    public void toFirst(){
        if(!this.isEmpty()){
            this.current = head;
        }
    }

    public void delete(){
        if(this.isEmpty()){
            System.out.println("Liste ist leer!");
        } else if(this.head == this.foot){
            this.current = null;
            this.foot = null;
            this.head = null;
        } else if(this.current == this.head){                //currentElement ist der Kopf
            this.head = null;                                       //kopf wird gelöscht
            this.head = this.current.getNext();              //Element nach currentelement wird zum kopf
        } else {                                                    //currentelement ist der fuss
            this.foot = null;                                       //fuss wird gelöscht
            this.foot = this.getElementBefore(this.current);  //element vor currentelement wird zum fuss
        }
    }

    public void insertBehind(Email mail){
        ListenElement insert = new ListenElement(mail, null);
        if(this.isEmpty()){
            this.head= insert;
            this.foot = insert;
            this.current = insert;
        }else {
            if(current == this.foot){
                this.foot.setNext(insert);
                foot = foot.getNext();
            }else {
                insert.setNext(this.current.getNext());
            }
        }


    }

    public void next(){
        if(!this.isEmpty()){
            if(this.current != foot){
                this.current = (this.current).getNext();
            }else{
                this.toFirst();
            }
        }
    }

    protected Email getItem(){
        if(!this.isEmpty()){
            return  current.getContent();
        }else{
            return null;
        }
    }

    public Liste() {
        this.foot = null;
        this.head = null;
        this.current = null;
    }
    private ListenElement getElementBefore(ListenElement elem){
        if(this.isEmpty() || elem == this.head){
            return null;
        } else {
            while(this.current.getNext() != elem){
                return null;
            }
            return elem;
        }
    }

}
/*
How to kill yourself:
Wähle Informatik
ENDE

Wobei man sich hier die Frage stellen muss inwiefern Informatik einen Einfluss auf die Suizidrate der Schüler hat.
Die Theroie, dass Informatik depressionsfördernd wirkt wurde in den letzen Jahren von vielen renomierten Wissenschaftlern untersucht.
Die Ergebnisse der Studien waren schockierend - 49,3934543 Prozent der Schüler die Informatik gewählt haben wurden demnach depressiv.
Die Frage dahinter: Lag es an dem Unterricht, an dem aus der Informatik resultierenden Gaming-Verhalten oder an dem sehr intensiven
Unterrichtsdruck vor Klasuren. Dazu werden wir in den kommenden Jahren weitreichende Untersuchungen durchführen - Sie können uns mit nur 49,99€ im
Jahr unterstützen mind. 10.000 traurige, einsame, hoffnungslose, schlechte, verbitterte informatiker singels, sozial zu retten.

KOMM IN DIE GRUPPE UND SPENDE 49,99 € Im Jahr ^^
*/
