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
        //System.out.println(input.substring(input.length() - 1)); //outputs always last digit
        // System.out.println(input.substring(1)); // Takes first digit
        //System.out.println(input.substring(input.length() - 2,1)); //outputs always last two digits
        // System.out.println(input.substring(input.length() - 2, input.length() - 1)); //outputs always penultimate digit
        //System.out.println(input.substring(1, 2));
        //System.out.println(input.substring(0, 2));
        
       // System.out.println( input.substring(input.length() - 2) + " NUM");
        
        switch (input.length()) {

            case 1:

                System.out.println(numbertospeech.returnUnits(input));

                break;

            case 2:
                //Enter Decimals Switch
                switch (input.substring(0, 1)) {

                    case "1":

                        //returnTens method does logic of printing 10 to 19 
                        numbertospeech.returnTens(input);

                        break;

                    default:

                        if (input.substring(1).equals("0")) {

                            //Check if number contains zero to print if correctly
                            System.out.println(numbertospeech.returnDecimals(input));

                        } else {
                            System.out.println(numbertospeech.returnDecimals(input) + " " + numbertospeech.returnUnits(input));
                        }

                        break;

                }

                break;

            case 3:

                if (input.contains("0") || input.substring(1, 2).equals("1")) {

                    System.out.println(numbertospeech.checkForZeroInHundreds(input));

                } else {

                    System.out.println(numbertospeech.returnHundreds(input) + " HUNDRED AND " + numbertospeech.returnDecimals(input) + " " + numbertospeech.returnUnits(input));
                }

                break;

            case 4:

                if (input.contains("0") || input.substring(2, 3).equals("1")) {

                    System.out.println(numbertospeech.checkForZeroInThousands(input));

                } else {

                    System.out.println(numbertospeech.returnHundreds(input) + " THOUSAND " + numbertospeech.returnHundreds(input.substring(1)) + " HUNDRED AND " + numbertospeech.returnDecimals(input) + " " + numbertospeech.returnUnits(input));
                }

                break;

            case 5:
                
                 if (input.contains("0") || input.substring(1, 2).equals("1")) {

                    System.out.println(numbertospeech.printFirstTwoDigitsTenThousands(input, 0, 2)+ " THOUSAND "+ numbertospeech.checkForZeroInHundreds(input.substring(2)));

                } else {

                    System.out.println(numbertospeech.printFirstTwoDigitsTenThousands(input, 0, 2)+ " THOUSAND " + numbertospeech.returnHundreds(input.substring(2, 3)) + " HUNDRED " + numbertospeech.returnDecimals(input) + " " + numbertospeech.returnUnits(input));
                }

                

                //System.out.println(numbertospeech.returnTens(input.substring(0, 2)) + " THOUSAND " + numbertospeech.returnHundreds(input.substring(2, 3)) + " HUNDRED " + numbertospeech.returnDecimals(input) + " " + numbertospeech.returnUnits(input));
        }

    }

    public String returnUnits(String input) {

        switch (input.substring(input.length() - 1)) {

            case "0":

                input = unitArray[0];

                break;

            case "1":

                input = unitArray[1];

                break;

            case "2":

                input = unitArray[2];

                break;
            case "3":

                input = unitArray[3];

                break;
            case "4":

                input = unitArray[4];

                break;
            case "5":

                input = unitArray[5];

                break;
            case "6":

                input = unitArray[6];

                break;
            case "7":

                input = unitArray[7];

                break;
            case "8":

                input = unitArray[8];

                break;
            case "9":

                input = unitArray[9];

                break;

        }

        return input;
    }

    public String returnTens(String input) {

        switch (input.substring(input.length() - 2)) {

            case "10":

                input = tensArray[0];

                break;

            case "11":

                input = tensArray[1];

                break;

            case "12":

                input = tensArray[2];

                break;
            case "13":

                input = tensArray[3];

                break;
            case "14":

                input = tensArray[4];

                break;
            case "15":

                input = tensArray[5];

                break;
            case "16":

                input = tensArray[6];

                break;
            case "17":

                input = tensArray[7];

                break;
            case "18":

                input = tensArray[8];

                break;
            case "19":

                input = tensArray[9];

                break;

        }

        return input;
    }

    public String returnDecimals(String input) {

        switch (input.substring(input.length() - 2).substring(0, 1)) {

            case "2":

                input = decimalsArray[0];

                break;

            case "3":

                input = decimalsArray[1];

                break;

            case "4":

                input = decimalsArray[2];

                break;
            case "5":

                input = decimalsArray[3];

                break;
            case "6":

                input = decimalsArray[4];

                break;
            case "7":

                input = decimalsArray[5];

                break;
            case "8":

                input = decimalsArray[6];

                break;
            case "9":

                input = decimalsArray[7];

                break;

        }

        return input;

    }

    public String returnHundreds(String input) {

        switch (input.substring(0, 1)) {

            case "0":

                input = unitArray[0];

                break;

            case "1":

                input = unitArray[1];

                break;

            case "2":

                input = unitArray[2];

                break;
            case "3":

                input = unitArray[3];

                break;
            case "4":

                input = unitArray[4];

                break;
            case "5":

                input = unitArray[5];

                break;
            case "6":

                input = unitArray[6];

                break;
            case "7":

                input = unitArray[7];

                break;
            case "8":

                input = unitArray[8];

                break;
            case "9":

                input = unitArray[9];

                break;

        }

        return input;
    }

    public String checkForZeroInHundreds(String output) {

        NumberToSpeech numbertospeech = new NumberToSpeech();

        if (output.substring(output.length() - 2).equals("00")) {

            //Returns example FIVE HUNDRED
            output = numbertospeech.returnHundreds(output) + " HUNDRED";

        } else if (output.substring(output.length() - 2, output.length() - 1).equals("1")) {

            //Returns example FIVE HUNDRED AND ELEVEN
            output = numbertospeech.returnHundreds(output) + " HUNDRED AND " + numbertospeech.returnTens(output);

        } else if (output.substring(output.length() - 1).equals("0")) {

            //Returns example FIVE HUNDRED AND THIRTY
            output = numbertospeech.returnHundreds(output) + " HUNDRED " + numbertospeech.returnDecimals(output);

        } else if (output.substring(output.length() - 2, output.length() - 1).equals("0")) {

            //Returns example FIVE HUNDRED AND ONE
            output = numbertospeech.returnHundreds(output) + " HUNDRED AND " + numbertospeech.returnUnits(output);

        }

        return output;
    }

    public String checkForZeroInThousands(String output) {

        NumberToSpeech numbertospeech = new NumberToSpeech();

        if (output.substring(1).equals("000")) {

            //Return example FIVE THOUSAND
            output = numbertospeech.returnHundreds(output) + " THOUSAND";

        } else if (output.substring(2).equals("00")) {

            //Returns example FIVE THOUSAND FIVE HUNDRED
            output = numbertospeech.returnHundreds(output) + " THOUSAND " + numbertospeech.returnHundreds(output.substring(1)) + " HUNDRED";

        } else if (output.substring(1, 2).equals("0") && output.substring(2, 3).equals("1")) {

            //Returns example FIVE THOUSAND AND ELEVEN
            output = numbertospeech.returnHundreds(output) + " THOUSAND " + numbertospeech.returnTens(output);

        } else if (output.substring(output.length() - 2, output.length() - 1).equals("1")) {

            //Returns example FIVE THOUSAND FIVE HUNDRED AND ELEVEN
            output = numbertospeech.returnHundreds(output) + " THOUSAND " + numbertospeech.returnHundreds(output.substring(1)) + " HUNDRED AND " + numbertospeech.returnTens(output);

        } else if (output.substring(output.length() - 1).equals("0") && !output.substring(1, 2).equals("0")) {

            //Returns example FIVE THOUSAND ONE HUNDRED AND THIRTY
            output = numbertospeech.returnHundreds(output) + " THOUSAND " + numbertospeech.returnHundreds(output.substring(1)) + " HUNDRED AND " + numbertospeech.returnDecimals(output);

        } else if (output.substring(output.length() - 1).equals("0")) {

            //Returns example FIVE THOUSAND AND THIRTY
            output = numbertospeech.returnHundreds(output) + " THOUSAND AND " + numbertospeech.returnDecimals(output);

        } else if (output.substring(1, 3).equals("00")) {

            //Returns example FIVE THOUSAND AND ONE
            output = numbertospeech.returnHundreds(output) + " THOUSAND " + numbertospeech.returnUnits(output);

        } else if (output.substring(2, 3).equals("0")) {

            //Returns example ONE THOUSAND ONE HUNDRED AND ONE
            output = numbertospeech.returnHundreds(output) + " THOUSAND " + numbertospeech.returnHundreds(output) + " HUNDRED AND " + numbertospeech.returnUnits(output);

        } else if (output.substring(1, 2).equals("0")) {

            //Returns example FIVE THOUSAND THIRTY TWO
            output = numbertospeech.returnHundreds(output) + " THOUSAND " + numbertospeech.returnDecimals(output) + " " + numbertospeech.returnUnits(output);

        }

        return output;
    }

    public String printFirstTwoDigitsTenThousands(String output, int sub1, int sub2) {

        NumberToSpeech numbertospeech = new NumberToSpeech();
        
        output = output.substring(sub1, sub2); // Will cut the output String Example output = 12345 and cut will be 12

        switch (output.substring(0,1)) {

            case "1":

                //returnTens method does logic of printing 10 to 19 
                output = numbertospeech.returnTens(output);

                break;

            default:

                if (output.substring(1).equals("0")) {

                    //Check if number contains zero to print if correctly
                    output = numbertospeech.returnDecimals(output);

                } else {
                     output = numbertospeech.returnDecimals(output) + " " + numbertospeech.returnUnits(output);
                }

                break;

        }

        return output;
    }

}
