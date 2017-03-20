/*
 * Course: SE-1011-001
 * Term: Winter 2010-2011
 * Author: Mark Sebern
 * Date: 12/07/2010
 * 
 */
package kassd;

import java.util.Scanner;

/**
 * Class for lab 1 of SE-1011.
 * @author sebern
 */
public class Lab1 {
	
	// Define some "constants" for use in calculations.
	private static final double KWH_PER_WATTHOUR = 0.001;
	private static final double CENTS_PER_DOLLAR = 100.0;

	/**
	 * Program to calculate output from a photovoltaic solar array.
	 * @param args ignored
	 */
	public static void main(String[] args) {
		
		// Create a reference variable in order to access a library object
		// that can process user input for us.
		// Initialize the variable with a reference to a "scanner" object
		// that is connected to the system input stream 
		// (here, the user's keyboard input).
		Scanner inputScanner = new Scanner(System.in);
		
		// Get the input data from the user, prompting
		// for each input item.
		//Sun hours are the effective "direct noon" amount of sun per day.
		System.out.print("Enter the number of average \"sun hours\" per day: ");
		double sunHoursPerDay = inputScanner.nextDouble();
		
		System.out.print("Enter the number of days: ");
		int days = inputScanner.nextInt();
		
		System.out.print("Enter rated solar output (watts): ");
		double ratedPower = inputScanner.nextDouble();
			
		System.out.print("Enter electric rate (cents per KWH): ");
		double centsPerKwh = inputScanner.nextDouble();
		
		// Calculate solar output for specified number of hours.
		double totalEnergy = (sunHoursPerDay * days) * ratedPower * KWH_PER_WATTHOUR;
		
		// Calculate value of energy produced
		double value = totalEnergy * centsPerKwh / CENTS_PER_DOLLAR;
		
		System.out.println("Total energy for the period is " +
				totalEnergy +
				"KWH, with a value of $" +
				value);
	}

}