/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondan;

/**
 *
 * @author vladb
 */
public class Bell implements Runnable {
        /**
	* The bell's sound
	*/
    String sound;
        /**
	 * How many times the bell has to sound
	 */
    int times;
        /**
	 * Costructor.
	 * 
	 * @param sound the bell's sound
	 * @param times the number of the execution
	 */
    public Bell(String sound, int times){
        this.sound = sound;
        this.times = times;
    }
    @Override
    public void run(){
        for (int i = 0; i < times; i++) {
            System.out.println((i + 1) + sound + " ");
        }
    }
}
