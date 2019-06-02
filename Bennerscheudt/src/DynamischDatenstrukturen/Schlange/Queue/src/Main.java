public class Main
{
    public static void main(String[] args)
    {
        EMail mail1 = new EMail("Schweiger","Informatik", "Queues sind stark!");
        EMail mail2 = new EMail("Feldmann","Englisch", "U2");
        EMail mail3 = new EMail("Lammers","BWR", "Rechnungen");

        Queue myQueue = new Queue();
        myQueue.front();

        myQueue.enqueue(mail1);                 //1.Platz Mail1
        myQueue.enqueue(mail2);                 //2.Platz Mail2
        myQueue.enqueue(mail3);                 //3.Platz Mail3
        myQueue.dequeue();                      //1.Platz Mail2
        myQueue.dequeue();                      //1.Platz Mail3
        myQueue.front();                        //Mail 3 wird ausgegeben
        myQueue.dequeue();                      //Platz 1 ist null
        myQueue.front();                        //Liste leer
    }
}
