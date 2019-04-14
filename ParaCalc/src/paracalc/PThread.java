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
public class PThread implements Runnable {
        /**
	 * The {@link Result} instance. Used to store the result of an operation.
	 */
	private Result result;

	/**
	 * An array that stores the values of which the {@link #run()} method will make
	 * power operation.
	 */
	private int[] values;

	/**
	 * Initialize this class with 10 values.
	 * 
	 * @param result the {@link Result} instance.
	 */
	public PThread(Result result) {
		this(result, 10);
	}

	/**
	 * Constructor: initialize this class with the specified max value.
	 * 
	 * @param result  the {@link Result} instance.
	 * @param nValues quantity of incremental values to generate to.
	 */
	public PThread(Result result, int nValues) {
		this.result = result;
		values = new int[nValues];
		for (int i = 0; i < values.length; i++) {
			values[i] = i;
		}
	}

	/**
	 * Make power of the values stored in {@link #values} array and stores it into
	 * {@link Result} instance.
	 */
	@Override
	public void run() {
		for (int i = 0; i < values.length; i++) {
			values[i] = (values[i] * values[i]);
		}
		result.storeMultipleValues(values);
	}

}
