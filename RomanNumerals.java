/*
 * Treasure Chandler
 * CS 16000-01 – 02/03, Fall Semester 2024
 * Lab 4
 * 
 */

import javax.swing.JDialog;     // needed for the JOptionPane class
import javax.swing.JOptionPane; // needed for the JOptionPane class

public class RomanNumerals {
    /**
     * 
     * @param args      entered values
     */
    public static void main(String[] args) {
        // variables declaration
        int yesNo, decimal;
        String roman;
        // sets the title of the dialog window
        String title = "Conversion of Roman Numerals";
        /*
         * due to the JOptionPane dialogue boxes sometimes appearing behind
         * all of your windows, you will need to declare a JDialog and
         * setAlwaysOnTop to true
         */
        final JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);

        /*
         * asks whether the process to input any more roman
         * numerals should be continued
         */
        do {
            // promts the user to input a roman numeral
            roman = JOptionPane.showInputDialog(dialog, "Enter any roman " + 
                                                "numeral between \"I\" " +
                                                "and \"XX\":", title, 
                                                JOptionPane.QUESTION_MESSAGE);

            /*
             * if the user pressed cancel, a new dialog window will appear
             * telling them the action has been canceled; after that, the
             * program will end and they will have to restart it. otherwise,
             * if the user pressed "OK" without entering anything, a new
             * dialog window will appear telling them they did not input
             * anything, and the program will end
             */
            if (roman == null) {
                JOptionPane.showMessageDialog(dialog, "Action has been canceled!",
                                              title, JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(dialog, "End of program!", title,
                                              JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else if (roman.equals("")) {
                JOptionPane.showMessageDialog(dialog, "You did not input anything...",
                                              title, JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(dialog, "End of program!", title,
                                              JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }

            // converts the user's input to ALL CAPS roman numerals
            roman = roman.toUpperCase();

            // converts the roman numeral value to an actual number value
            decimal = converter(roman);

            // if (decimal == 0) {
            //     JOptionPane.showMessageDialog(dialog, "", title,
            //                                   JOptionPane.ERROR_MESSAGE);
            // }

            yesNo = JOptionPane.showConfirmDialog(dialog, "Do you want to input " +
                                                  "any more roman numerals? \nYes or No", 
                                                  title,
                                                  JOptionPane.YES_NO_OPTION);

        } while (yesNo == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(dialog, "End of program!", title,
                                      JOptionPane.INFORMATION_MESSAGE);
        // needed for the JOptionPane class
        System.exit(0);

    } // end of main()

    /**
     * 
     * @param roman     the value to input as a roman numeral
     * @return          returns the converted roman numeral as a number
     */
    public static int converter(String roman) {
        int decimal = 0;
        /*
         * using if-else statements, the statement
         * checks if the input has an 'I' as its first
         * character. otherwise, it will check for a 'V'.
         * otherwise, it will check for an 'X'
         */
        if (roman.charAt(0) == 'I') {
            /*
             * here is where the actual conversion occurs
             * from 1-4
             */
            if (roman.equals("I")) {
                decimal = 1;
            } else if (roman.equals("II")) {
                decimal = 2;
            } else if (roman.equals("III")) {
                decimal = 3;
            } else if (roman.equals("IV") {
                decimal = 4;
            }
        } else if (roman.charAt(0) == 'V') {
            /*
             * here is where the actual conversion occurs
             * from 5-10
             */
        } else if (roman.charAt(0) == 'X') {

        } else {
            /*
             * if all else fails, it means the roman numeral input is
             * invalid
             */
            decimal = 0;
        }

        return decimal;

    } // end of converter()

} // end of RomanNumerals