package com.usa.traffic;


public class TrafficSignalService {

	public void startSignaling(int greenSignalDuration, int redSignalDuration, int numOfSeconds) {
		int snellRdVehiclesCount = 0; //Snell Road Vehicles count either side
		int weaverRdVehiclesCount = 0; //Weaver Road Vehicles count either side
		int redSignalHalfCycle = greenSignalDuration + redSignalDuration;
		int redSignalFullCycle = 2 * redSignalHalfCycle;
		for (int i = 0; i <= numOfSeconds; i++) {
			if (i > 0 && i % redSignalFullCycle == 0)
				redSignalHalfCycle = redSignalHalfCycle + redSignalFullCycle;
			else if ((i > redSignalHalfCycle - redSignalDuration - greenSignalDuration + 1 && i < redSignalHalfCycle - redSignalDuration + 1) || (i > 0 && i <= redSignalDuration))
				snellRdVehiclesCount--;
			else if (i > redSignalHalfCycle + 1 && i < redSignalHalfCycle + greenSignalDuration + 1)
				weaverRdVehiclesCount--;
			System.out.println(i + ": N = " + snellRdVehiclesCount + "; S = " + snellRdVehiclesCount + "; E = " + weaverRdVehiclesCount + "; W = " + weaverRdVehiclesCount);
			snellRdVehiclesCount++;
			weaverRdVehiclesCount++;
		}
	}
}
