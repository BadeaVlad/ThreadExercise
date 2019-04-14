/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paracalc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vladb
 */
public class Result {
        /**
	 * Store the sum of {@link SThread} value.
	 */
	private int result;

	/**
	 * Stores a {@link List} of {@link Integer} values.
	 */
	private List<Integer> results = new ArrayList<>();

	/**
	 * Initialize this class.
	 */
	public Result() {
		this(0);
	}

	/**
	 * Initialize this class that starts from a specific value
	 * 
	 * @param initialValue the specified value
	 */
	public Result(int initialValue) {
		this.result = initialValue;
	}

	/**
	 * Add the specified value to this result instance
	 * 
	 * @param amount
	 */
	public void addValue(int amount) {
		this.result += amount;
	}

	/**
	 * @return an int value that represent the result value.
	 */
	public int getValue() {
		return this.result;
	}

	/**
	 * Add value to the result list
	 * 
	 * @param value the single value
	 */
	public void storeMultipleValue(int value) {
		results.add(value);
	}

	/**
	 * Add values to the result list
	 * 
	 * @param values a group of values
	 */
	public void storeMultipleValues(int... values) {
		for (int i = 0; i < values.length; i++) {
			results.add(values[i]);
		}
	}

	/**
	 * 
	 * @return the {@link List} of results.
	 */
	public List<Integer> getValues() {
		return results;
	}

}
