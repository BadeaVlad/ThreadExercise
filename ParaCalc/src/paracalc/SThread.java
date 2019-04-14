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
public class SThread implements Runnable{
        /**
	 * Result instance
	 */
	private Result r;

	/**
	 * The value to add
	 */
	private int value;

	/**
	 * Constructor.
	 * 
	 * @param r     the {@link Result} instance
	 * @param value the value to add to the result
	 */
	public SThread(Result r, int value) {
		this.r = r;
		this.value = value;
	}

	/**
	 * Add {@link SThread#value} to the result.
	 */
	@Override
	public void run() {
		r.addValue(value);
	}
}
