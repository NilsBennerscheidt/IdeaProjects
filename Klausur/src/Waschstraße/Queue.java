package Waschstraße;

public class Queue {
    public int MaxLaenge= 3;
    public int queueuleange;
    private Entry first;                    //Zeiger auf das erste Element
    private Entry last;                     //Zeiger auf das letzte Element

    public Queue() {
        this.first=null;                    //
        this.last=null;                     //werden null gesetzt, da es kein Objekt geben muss
    }

    public void enqueue(Object pObject) {
System.out.print("heya");
            if (pObject != null) {                                    // Solang dass Object nicht leer ist
                Entry newEntry = new Entry(pObject, null);           //Neues Entry wird erstellt
                queueuleange++;
                if (this.isEmpty()) {                                  //wenn Queue leer ist, dann zeigen beide auf dass neue Element
                    first = newEntry;
                    last = newEntry;
                } else {                                                //wenn die ein Element vor dem neuen ist, dann wird nur der letzte Zeiger verschoben
                    last.setNext(newEntry);
                    last = newEntry;
                }
            }



    }
    public void dequeue() {
        if(!this.isEmpty()){                                     //solang die Queue voll ist
            queueuleange--;
            first = first.getNext();                            //dann nimmt er den ersten und schiebt den Zeiger first auf dass nächste
        }
    }
    public boolean isEmpty() {
        return(this.first ==null);                              //wenn Liste leer mit == Abfrage
    }

    public Object front(){                                       //front ist dazu da die Daten auszugeben
        if(this.isEmpty()){                                      //wenn die Liste leer ist
            System.out.println("Die Queue ist leer");
            return null;
        }else{
            System.out.println(first.getData());               //wenn sie voll ist gibt er die Daten vom ertsen aus!
            return(first.getData());
        }
    }

}