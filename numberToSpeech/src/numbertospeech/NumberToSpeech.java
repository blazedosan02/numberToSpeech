package numbertospeech;

import java.util.Scanner;

public class NumberToSpeech {

    String unitArray[] = new String[]{"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};

    public static void main(String[] args) {
        
        NumberToSpeech numbertospeech = new NumberToSpeech();

        Scanner scan = new Scanner(System.in);

        String input;

        System.out.println("Enter A Number");
        
        input = scan.next();
        
        numbertospeech.returnUnits(input);

    }

    public String returnUnits(String input) {

        switch (input) {

            case "0":

                input = unitArray[0];

                System.out.println(input);

                break;

            case "1":

                input = unitArray[1];

                System.out.println(input);

                break;

            case "2":

                input = unitArray[2];

                System.out.println(input);

                break;
            case "3":

                input = unitArray[3];

                System.out.println(input);

                break;
            case "4":

                input = unitArray[4];

                System.out.println(input);

                break;
            case "5":

                input = unitArray[5];

                System.out.println(input);

                break;
            case "6":

                input = unitArray[6];

                System.out.println(input);

                break;
            case "7":

                input = unitArray[7];

                System.out.println(input);

                break;
            case "8":

                input = unitArray[8];

                System.out.println(input);

                break;
            case "9":

                input = unitArray[9];

                System.out.println(input);

                break;

        }

        return input;
    }

}
