package br.com.gym.main;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.gym.total.RaceResults;

public class Go {
	public static void goRacer() {
		int top = 0;
		int dif =0;
		Set<Integer> result = RaceResults.bestFullTime().entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue, newValue) -> oldValue, LinkedHashMap::new)).keySet();
			for(Integer SET:result) {
				Long time = RaceResults.bestFullTime().get(SET);
				String names = RaceResults.names().get(SET);
				Integer laps = RaceResults.lapsTotal().get(SET);
				Long bestLap = RaceResults.bestLap().get(SET);
				double averageVel = RaceResults.speedTotal().get(SET)/laps;
				
				if(laps==4) {
					top+=1;
					System.out.println(top +"°");
					System.out.println("ID :" +SET);
					System.out.println("NAME :"+names);
					System.out.println("N° LAPS :"+laps);
					System.out.println("RACE TIME(seconds) :"+time);
					System.out.println("BEST LAP(minutes) :"+(double)bestLap/60);
					System.out.println("Average Vel. :"+averageVel);
					System.out.println("Diferença :"+dif);
					System.out.println("==============================\n");
				}
			}
	}

	public static void main(String[] args) {
		goRacer();
	}
}
