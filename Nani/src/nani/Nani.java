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
public class Nani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NThread thr = new NThread();
        thr.start();
        System.out.println(Thread.currentThread().getName());
    }
    
}
