package DynamischDatenstrukturen.Liste.DieListe.src;

public class Liste
{
    private ListenElement fuss;
    private ListenElement kopf;
    private ListenElement currentElement;

    public Liste()
    {
        this.kopf=null;
        this.fuss=null;
        this.currentElement=null;
    }

    public boolean isEmpty()
    {
        return(this.kopf == null);          // wenn Liste leer ist der Kopf auch leer
    }
    public void toFirst()
    {
        if(!this.isEmpty())
        {
            this.currentElement=kopf;               //current element auf Anfang gesetzt
        }
    }
    public void next()
    {
        if(!this.isEmpty())                         //wenn die Liste nicht leer ist
        {
            if(this.currentElement != fuss)         //wenn current nicht gleich den fuss ist
            {
                this.currentElement = (this.currentElement).getNext();          //dann setzt er current auf das nächste Element
            }
            else
                {
                    this.toFirst();                                 //anderen Falls gibt es keinen weiteren, also ist es das erste
                }
        }
    }

    public EMail getItem()                                  //Daten ausgabe
    {
        if(!this.isEmpty())
        {
            return currentElement.getContent();
        }
        else
            {
                return null;
            }
    }

    public void insertBehind(EMail mail)
    {ListenElement insert=new ListenElement(mail,null);                 //Leeres Listenelement wird erstellt
        {if(this.isEmpty())                                                   //wenn die Liste leer ist
        { this.kopf=insert;
            this.fuss=insert;
            this.currentElement=insert;                                       //dann werden alle Zeiger auf dass neue gesetzt
        }
        else{if(currentElement==this.fuss) {                                //wenn das currentelement gleich den Fuß ist
            this.fuss.setNext(insert);                                      //neue Element wird eingefügt
            fuss=fuss.getNext();                                            //Fuss wird auf insert gesetzt

        }
        else
            {
                insert.setNext(this.currentElement.getNext());              //
            this.currentElement.setNext(insert);                            //
            }
        }
        }
    }


    private ListenElement getElementBefore(ListenElement elem )
    {
        if(isEmpty())                                               //wenn Liste leer
        {

            System.out.println("Liste ist leer!");
            return null;
        }

        else                                                            //wenn Liste belegt
        {
            ListenElement current = elem;                               //Zeiger elem wird gleich current gesetzt
            while(this.currentElement.getNext() != elem)                //
            {
                this.next();                                            //wird aufs nächste gesetzt
            }
            ListenElement before = this.currentElement;                 //before wird gleich gesuchtes Element
            this.next();
            return before;
        }
    }

    public void delete()
    {

        if(!this.isEmpty())                                                     //wenn Liste nicht leer
        {
            if(this.kopf==this.fuss)                                            //wenn Kopf und fuss gleich sind
            {
                this.kopf=null;                                                 //beide Zeiger werden null, da kein Element mehr da ist
                this.fuss=null;
            }
            else if(this.currentElement==this.kopf)                             //wenn es das erste Element ist, was zu löschen ist
            {
                this.kopf=this.currentElement.getNext();                        //Kopf wird auf das nächste gesetzt
                this.currentElement=this.kopf;                                  //current ist gleich Kopf
            }
            else if(this.currentElement==this.fuss)                             //wenn dass zu löschende gleich fuss ist
            {
                toFirst();                                                      // auf Anfang
                while(this.currentElement.getNext()!= this.fuss)                // bis zum Fuss
                {
                    this.next();
                }
                this.fuss=this.currentElement;                          //Fuss ist gleich current
                this.currentElement.setNext(null);                      //current zeiger wird auf null gesetzt
            }
            else                                                                //wenn es zwischen Kopf und fuss ist
                {
                    ListenElement del = this.currentElement;                    //del ist gleich current
                    ListenElement newNext = this.currentElement.getNext();      //neuer Next
                 toFirst();                                                     //auf Anfang
                    while(this.currentElement.getNext() != del)                 //bis zu del
                    {
                        this.next();
                    }
                    this.currentElement.setNext(newNext);                       //Zeiger next wird neu gesetzt
                }


        }


    }

}
