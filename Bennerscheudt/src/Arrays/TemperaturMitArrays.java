package Arrays;

import java.util.Arrays;

public class TemperaturMitArrays {
    public static void main(String[] args)  {
        int[] Temp =  {11, 14,  9, 12, 15, 16, 15, 15, 11,  8 ,13, 13, 15, 12};
        System.out.println(Arrays.toString(Temp));
        int[] Test = new int[14];
        double durstemp=0;



        for(int i = 0; i<Temp.length;i++){
            durstemp = durstemp + Temp[i];
        }
        durstemp = durstemp/Temp.length;
        double durs = Math.round(durstemp*Math.pow(10,1)) / Math.pow(10,1);
        System.out.println("Die Durschnittliche Temperatuer in den letzen 14 Tagen betrug "+durs);



        for(int i = 0; i<14;i++) {
            Test[i] = Temp[i];
        }
        Arrays.sort(Test);
        int MaxTemp = Test[13];
        int MinTemp = Test[0];

        System.out.println("Die höchste Temp.: "+MaxTemp+" die niedrigste Temp: "+ MinTemp);

        int j = 1;
        int dif2 = 0;
        int[] Tag= new int[2];
        for(int i = 0; i< 13;i++){
            int dif1 = 0;

            if(Temp[i]<Temp[j]){
                dif1 = Temp[j] - Temp[i];
            }else if(Temp[i]<Temp[j]){
                dif1 = Temp[i]-Temp[j];
            }
            if(dif1>dif2){
                dif2= dif1;
                Tag[0]= (j);
                Tag[1]= (j +1);
            }
            j++;
        }
        System.out.println("Die größte Temperatur Differenz war vom "+ Tag[0]+" auf Tag "+ Tag[1]+" mit "+dif2+ " Grad Celsius");
    }
}
