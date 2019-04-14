/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani;

/**
 *
 * @author vladb
 */
public class NThread extends Thread{
        /**
	 * Print numbers from 1 to 7 and the {@linkplain Thread#getName() thread name}.
	 */
    @Override
    public void run(){
        setName("Settenani");
        System.out.println(Thread.currentThread().getName());
        for (int i=0;i<7;i++){
            System.out.println((i + 1) + " ");
        }
    }
}
