public class Stackstart
{
    public static void main(String[] args)
    {
        EMail mail1 = new EMail("Schweiger","Informatik", "Queues sind stark!");
        EMail mail2 = new EMail("Feldmann","Englisch", "U2");
        EMail mail3 = new EMail("Lammers","BWR", "Rechnungen");                     //Emails erstellen

        Stack myStack=new Stack();                                                                        //Stack erstellen
        myStack.push(mail1);                                                                              //Methoden
        myStack.pop();
        myStack.push(mail2);
        myStack.push(mail3);
        myStack.pop();
        myStack.pop();

        System.out.print(myStack.top());










    }
}
