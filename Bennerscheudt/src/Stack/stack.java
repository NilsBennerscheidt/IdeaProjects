package Stack;

//import Queue.Test.Entry;

import Email.EMail;

import java.util.Stack;

public class stack {
    Entry top ;

    public void stack(){
        top=null;

    }
    public boolean isEmpty(){


        return top==null;

    }

    public void push(Object pObject){
        Entry entry = new Entry(pObject, null);
        if(!isEmpty())entry.setNext(top);
            top=entry;
    }
    public void pop(){
        if(isEmpty()) return;
        if(top.getNext()==null) top=null;
        else top =top.getNext();
    }
    public Entry getTop() {return top;}




}
