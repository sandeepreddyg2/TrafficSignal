package com.usa.traffic;


/**
 * @author Sandeep Reddy
 * @since 04/29/2018
 */
public class TrafficSignal {

	/**
	 * 
	 * *********** INSTRUCTIONS TO RUN FROM COMMAND LINE ***********
	 * 
	 * Run Maven Package/Install and generate TrafficSignal-1.0.jar.
	 * 
	 * Run command -
	 * java -cp TrafficSignal-1.0.jar com.usa.traffic.TrafficSignal 3 1 20
	 * 
	 * First parameter 3 -> Green Signal Duration (Either Side of roads) in seconds
	 * 
	 * Second parameter 1 -> Red Signal Duration (Either Side of roads) in seconds
	 * 
	 * Second parameter 20 -> Duration of running the traffic signal algorithm in seconds
	 * 
	 * This program supports only if green and red signal durations are equal on both roads 
	 * and the time taken for the first car to move takes 2 seconds when signal is turned 
	 * from Red to Green
	 * 
	 * Main. Runs the Traffic Signaling from Command line.
	 * 
	 * @param args
	 *            the arguments to traffic signal
	 * 
	 * 
	 */
	public static void main(String[] args) {

		int greenSignalDuration = 3;
		int redSignalDuration = 1;
		int numOfSeconds = 20;

		if (args != null && args.length == 3) {
			try {
				greenSignalDuration = Integer.parseInt(args[0]);
				redSignalDuration = Integer.parseInt(args[1]);
				numOfSeconds = Integer.parseInt(args[2]);
			} catch (NumberFormatException e) {
				System.out.println("Incorrect Arguments Passed, Proceeding with default arguments");
				e.printStackTrace();
			}
		}

		TrafficSignalService trafficSignalService = new TrafficSignalService();
		trafficSignalService.startSignaling(greenSignalDuration, redSignalDuration, numOfSeconds);

	}

}
