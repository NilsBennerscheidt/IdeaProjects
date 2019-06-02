package Stack;

import java.util.Stack;


public class StackStart {
    public static void main(String[] args) {

        stack MyStack = new stack();
        EMail Mail1 = new EMail("Wießmann","Mathe ist toll","Mach mathe du kek");
        EMail Mail12 = new EMail("Schweiger","","Mach mathe du kek");

        MyStack.push(Mail1);
        //MyStack.push(Mail12);

        Mail12.drucke();
       System.out.print(MyStack.top.getData());
    }
}
