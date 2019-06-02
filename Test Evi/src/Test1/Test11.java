package Test1;

import sun.awt.SunHints;

import java.util.Arrays;

public class Test11 {

    public static void main(String[] args) {
        int[][] InputArray={{1, 3, 5} ,{100}, {2, 4, 6}};
        System.out.println(Arrays.toString(        flattenAndSort(InputArray)));
    }
    public static int[] flattenAndSort(int[][] array) {

        String count =new String();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                count = count + array[i][j]+" ";

            }
        }

        if(count.equals(" ")){
            return new int[0];
        }

        String strArray[] = count. split(" ");

        int[] StrArray =new int[strArray.length];
        for (int i = 0; i<strArray.length;i++){
            if(strArray[i].equals("")==false){
                StrArray[i]=Integer.parseInt(strArray[i]);

            }
        }


        StrArray=bubblesort(StrArray);

        return  StrArray;
    }

    public static int[] bubblesort(int[] zusortieren) {
        int temp;
        for(int i=1; i<zusortieren.length; i++) {
            for(int j=0; j<zusortieren.length-i; j++) {
                if(zusortieren[j]>zusortieren[j+1]) {
                    temp=zusortieren[j];
                    zusortieren[j]=zusortieren[j+1];
                    zusortieren[j+1]=temp;
                }

            }
        }
        return zusortieren;
    }



}
