package Sotiralgorythmen;

public class Telefonbuch {
    public static void main(String[] args) {
        int gesucht = 55;

        final long timeStart = System.nanoTime();

        int[] Array =new int[]{12, 17, 23,24,31,32,36,37,42,47,53,55,67,67,87,89,91,91,93} ;
        int w =one(Array, gesucht);

        final long timeEnd =System.nanoTime();

        System.out.println("binary Laufszeit: " + (timeEnd - timeStart) + " Nanosek.");
        System.out.println("Verusche "+ w);
        final long timeStart2 = System.nanoTime();

        int a = binary(Array, gesucht);

        final long timeEnd2 =System.nanoTime();

        System.out.println("Laufszeit: " + (timeEnd2 - timeStart2) + " Nanosek.");
        System.out.println("Position "+ a);
    }
    public static int one(int[] array, int ziel){
        int a=0;
        for(int i = 0;i<array.length;i++){
             a++;
            if(ziel==array[i]){

                break;
            }
        }
        return a;

//359254

    }
    public static int two(int[] array, int ges ) {
        int test;
        int w= 0 ;
        int li = 0;
        int re = array.length;
        while (li<=re) {
            w++;
            test = (li + re) / 2;
            if (array[test] == ges) {
                return w;
            } else if (array[test] > ges) {
                re = test;
            } else if (array[test] < ges) {
                li = test;
            }
        }

        return -1;
    }
    public static int binary(int[] array, int ges ) {
        int test;
        int w= 0 ;
        int li = 0;
        int re = array.length;
        while (li<=re) {
            w++;
            test = (li + re) / 2;
            if (array[test] == ges) {
                return w;
            } else if (array[test] > ges) {
                re = test -1;
            } else if (array[test] < ges) {
                li = test+1;
            }
        }

        return -1;
    }









    public static int max(int[] array){
        int a = array.length;
        int b=0;
        while(a>=1){
            a= a/2;
            b++;
        }
        b--;
        return b;
    }


}