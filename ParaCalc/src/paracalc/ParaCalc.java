/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paracalc;

/**
 *
 * @author vladb
 */
public class ParaCalc {

        /**
	 * <p>
	 * Make a group of {@link SThread} that sums values... Than... Make a
	 * {@link PThread} that make power of a sequential-generated array of values.
	 * 
	 * </p>
	 * <p>
	 * The join part is needed because the way of this stores the results. If thread
	 * exit before the actual calculation, it can't add data. Also, sometimes, it
	 * throws a {@link ConcurrentModificationException}.
	 * </p>
	 * 
	 * @param args (unused in this exercise, btw) command line arguments
	 */
	public static void main(String[] args) {
		Result r = new Result();
		int j = 1;
		for (int i = 0; i < 10; i++) {
			new Thread(new SThread(r, j)).start();
			j++;
		}
		System.out.println(r.getValue());
		Result pResult = new Result();
		Thread t = new Thread(new PThread(pResult));
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(pResult.getValues());
	}

    
}
