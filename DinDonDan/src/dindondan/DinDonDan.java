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
public class DinDonDan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable bell = new Bell("din", 5);
        Thread thr = new Thread(bell);
        thr.start();
        Thread thr2 = new Thread(new Bell("don", 5));
        thr2.start();
        new Thread(new Bell("dan", 5)).start();
    }
    
}
