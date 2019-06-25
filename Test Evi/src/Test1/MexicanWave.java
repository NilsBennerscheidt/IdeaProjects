package Test1;

public class MexicanWave {
    public static String[] wave(String str) {

        int counter = 0;

        if (str.equals("") || nurLeerStellen(str)) {
            return new String[]{};
        }

        for (int i = 0; i < str.length(); i++) {    //Count the amount  of letters in the given String
            if (str.charAt(i) != (char) 32) {
                counter = counter + 1;
            }
        }

        String[] Wave = new String[counter];    // "Wave" is the string that'll be returned with the wave itsself

        boolean y = false;      //this boolean is the exit condition
        char[] temp = str.toCharArray();    //this array ist used to upper a specific letter
        int CharToUpper = 0;    //This Integers worth is the position in the Chararray with ist to be Uppered
        int UpperWavePoint = 0; //counter for the exit condition.

        while (!y) {
            if (temp[CharToUpper] == (char) 32) {   //check for whitespaces
                while (temp[CharToUpper] == (char) 32 && CharToUpper != str.length() - 1) {
                    CharToUpper = CharToUpper + 1;

                }
            }

            temp = str.toCharArray();   //Parse the Inputstring into a temporary Char Array
            temp[CharToUpper] = Character.toUpperCase(temp[CharToUpper]);   //Transform a certein character into Upper Case

            String temp2 = new String(temp);    //Parse the Char Array into a temporary String

            Wave[UpperWavePoint] = temp2;   //Put the temporary String into the Array

            UpperWavePoint = UpperWavePoint + 1;    //counter for the exit condition

            if (CharToUpper != str.length() - 1) {      //add 1 to the counter
                CharToUpper = CharToUpper + 1;
                if (temp[CharToUpper] == (char) 32) {   //check for whitespaces
                    while (temp[CharToUpper] == (char) 32 && CharToUpper != str.length() - 1) {
                        CharToUpper = CharToUpper + 1;

                    }
                }

            }
            if (UpperWavePoint != Wave.length) { //check the exitcondition. For that you compare the counter "UpperWavePoint" with length of "Wave".
                y = false;

            } else {
                y = true;
            }

        }
        return Wave;
    }

    private static boolean nurLeerStellen(String str) {

        /*
            This function is checking if the String does not only contain Whistespaces.
            If so it returns false so that it dose  not activate the If from where it is called
        */

        char[] temp = str.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != (char) 32) {
                return false;
            }
        }
        return true;
    }


}
