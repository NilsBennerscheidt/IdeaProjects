package Test1;

import java.util.Arrays;


public class Arrayreverser {
    public static String[] reverse(String[] a){

        //Get the length of each String within the array at it's position
        int[] temp = new int[a.length];
        for(int i = 0;i<temp.length;i++){
            temp[i]=a[i].length();
        }

        String Arraycontents = new String();

        for (int i = 0; i<a.length; i++){
            Arraycontents = Arraycontents +a[i];
        }
        Arraycontents = umkehren(Arraycontents);
        int counter= 0;
        for(int i = 0; i<a.length;i++){
            String Temp = new String();
            for (int y = 0; y<a[i].length();y++){

                Temp = Temp +Character.toString( Arraycontents.charAt(counter));
                counter = counter +1;
            }
            a[i]= Temp;
        }
        String s = Arrays.toString(a);
        System.out.println(s+"  ||  "+Arraycontents);
        return null;
    }


    public static String umkehren( String str ) {
        String umgekehrt = new String();

        for ( int j = str.length()-1; j >= 0; j-- )
            umgekehrt += str.charAt(j);

        return umgekehrt;
    }



    public static String[] Reverse(String[] a) {
        String s = new StringBuilder(String.join("",a)).reverse().toString();
        String[] b = new String[a.length];
        int i = 0, x = 0;
        for (String ss: a) b[x++] = s.substring(i,i+=ss.length());
        return b;
    }
}
