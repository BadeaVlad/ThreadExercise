/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd;

/**
 *
 * @author vladb
 */
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
	 * <p>
	 * This is the main of the program.
	 * </p>
	 * <p>
	 * It gets the number from the command line arguments array and tries to convert
	 * from a string into an integer value.
	 * </p>
	 * <p>
	 * If it succeed, it starts 2 threads, one count the even numbers and the other
	 * the odd one, from 1 to the inserted number. Then it waits for the threads to
	 * end. ({@link Thread#join()})
	 * </p>
	 * <p>
	 * If it fail, it enter in the catch block, usually for an
	 * {@link NumberFormatException} and simple exit the program.
	 * </p>
	 * 
	 * @param args in this case, an integer number
	 */
	if (args.length != 1) {
            System.err.println("Or add a value to the Debug/Run configuration in your IDE.");
            return;
	}
            int number = Integer.parseInt(args[0]);
            Thread even = new EOThread(number + 1, true);
            Thread odd = new EOThread(number + 1, false);
            even.start();
            odd.start();
            try {
                even.join();
                odd.join();
	} catch (Exception e) {
            System.err.println("The inserted value is wrong: " + args[0]);
            return;
	}
    }
    
}
