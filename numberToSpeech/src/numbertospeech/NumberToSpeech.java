package numbertospeech;

import java.util.Scanner;

public class NumberToSpeech {

    String unitArray[] = new String[]{"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};

    String tensArray[] = new String[]{"TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"};

    String decimalsArray[] = new String[]{"TWENTY", "THIRTY", "FOURTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"};

    public static void main(String[] args) {

        NumberToSpeech numbertospeech = new NumberToSpeech();

        Scanner scan = new Scanner(System.in);

        String input;

        System.out.println("Enter A Number");

        input = scan.next();

        //System.out.println(input.substring(input.length() - 2).substring(0,1));
        System.out.println(input.substring(1, 3));

        switch (input.length()) {

            case 1:

                numbertospeech.returnUnits(input);

                break;

            case 2:
                //Enter Decimals Switch
                switch (input.substring(0, 1)) {

                    case "1":

                        numbertospeech.returnTens(input);

                        break;

                    default:

                        System.out.println(numbertospeech.returnDecimals(input) + " " + numbertospeech.returnUnits(input));

                        break;

//                    
                }

                break;

            case 3:

                System.out.println(numbertospeech.returnHundreds(input) + " HUNDRED AND " + numbertospeech.returnDecimals(input) + " " + numbertospeech.returnUnits(input));

                break;

            case 4:

                if (input.substring(1, 3).equals("00")) {

                    System.out.println(numbertospeech.returnHundreds(input) + " THOUSAND AND " + numbertospeech.returnUnits(input));

                } else {

                    System.out.println(numbertospeech.returnHundreds(input) + " THOUSAND " + numbertospeech.returnHundreds(input) + " HUNDRED AND " + numbertospeech.returnDecimals(input) + " " + numbertospeech.returnUnits(input));

                }

                break;

        }

    }

    public String returnUnits(String input) {

        switch (input.substring(input.length() - 1)) {

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

    public String returnTens(String input) {

        switch (input.substring(input.length() - 2)) {

            case "10":

                input = tensArray[0];

                System.out.println(input);

                break;

            case "11":

                input = tensArray[1];

                System.out.println(input);

                break;

            case "12":

                input = tensArray[2];

                System.out.println(input);

                break;
            case "13":

                input = tensArray[3];

                System.out.println(input);

                break;
            case "14":

                input = tensArray[4];

                System.out.println(input);

                break;
            case "15":

                input = tensArray[5];

                System.out.println(input);

                break;
            case "16":

                input = tensArray[6];

                System.out.println(input);

                break;
            case "17":

                input = tensArray[7];

                System.out.println(input);

                break;
            case "18":

                input = tensArray[8];

                System.out.println(input);

                break;
            case "19":

                input = tensArray[9];

                System.out.println(input);

                break;

        }

        return input;
    }

    public String returnDecimals(String input) {

        switch (input.substring(input.length() - 2).substring(0, 1)) {

            case "2":

                input = decimalsArray[0];

                System.out.println(input);

                break;

            case "3":

                input = decimalsArray[1];

                System.out.println(input);

                break;

            case "4":

                input = decimalsArray[2];

                System.out.println(input);

                break;
            case "5":

                input = decimalsArray[3];

                System.out.println(input);

                break;
            case "6":

                input = decimalsArray[4];

                System.out.println(input);

                break;
            case "7":

                input = decimalsArray[5];

                System.out.println(input);

                break;
            case "8":

                input = decimalsArray[6];

                System.out.println(input);

                break;
            case "9":

                input = decimalsArray[7];

                System.out.println(input);

                break;

        }

        return input;

    }

    public String returnHundreds(String input) {

        switch (input.substring(0, 1)) {

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
