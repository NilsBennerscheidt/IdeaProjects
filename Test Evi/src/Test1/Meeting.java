package Test1;

import java.util.Arrays;

public class Meeting {
    public static String meeting(String s) {
        String[] S =s.split(";");
        System.out.println(Arrays.toString(S));

        String[][] ss= new String[S.length][2];

        for(int i = 0;i<S.length;i++){
            ss[i]=S[i].split(":");
            java.util.Collections.reverse(Arrays.asList(ss[i]));

        }


        ss = StringSotieren(ss);

        String lineSeparator = System.lineSeparator();
        StringBuilder sb = new StringBuilder();

        for (String[] row : ss) {
            sb.append(Arrays.toString(row));

        }

        String result = sb.toString();
        result = result.replace('[','(').replace(']',')').replace(' ',' ').toUpperCase();
        result = "("+ result+ ")";
        return result;
    }


    private static String[][] StringSotieren(String[][] InputArray) {
        String tempNachname;
        String tempVorname;
        for (int j = 0; j < InputArray.length; j++) {
            for (int i = j + 1; i < InputArray.length; i++) {
                // comparing strings
                if (Comparerererererererer(InputArray[i][0], InputArray[j][0])) {
                    tempNachname = InputArray[j][1];
                    tempVorname = InputArray[j][0];

                    InputArray[j][1] = InputArray[i][1];
                    InputArray[j][0] = InputArray[i][0];


                    InputArray[i][1] = tempNachname;
                    InputArray[i][0] = tempVorname;

                }
            }
        }
        return InputArray;

    }

    private static Boolean Comparerererererererer(String A, String B){
        if(A.equals(B)){
            return true;
        }

        for(int i = 0; i<A.length() && i<B.length();i++){
            if(A.charAt(i)<B.charAt(i)){
                return true;
            }else if (A.charAt(i)>B.charAt(i)){
                return false;
            }
        }
        return false;
    }
}
