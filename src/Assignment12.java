/*
   Author: Camila Arbaiza

   Professor: Tanes Kanchanawanchai

   Problem 12.3

   (ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:
  ■ Creates an array with 100 randomly chosen integers.
  ■ Prompts the user to enter the index of the array, then displays the corresponding
    element value. If the specified index is out of bounds, display the message Out of Bounds.

 */

import java.util.Scanner;

    public class Assignment12 {

       public static void main (String [] args){

           // Create a Scanner
           Scanner input = new Scanner(System.in);

           // Invoke getRandomArray method
           int[] array = getRandomArray();

           // Prompt the user to enter the index of the array
            System.out.print("Enter index of the array: ");

            try {

            System.out.println("The corresponding element value is " +
                    array[input.nextInt()]);
            }
            catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
        }
    }// end main

    /**
     *
     * @return  Array with random integer values
     */
    public static int[] getRandomArray() {

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) + 1;
            }
        return array;
        }

    }//end Assignment12 class
