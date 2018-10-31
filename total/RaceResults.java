package br.com.gym.total;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import br.com.gym.entity.Driver;
import br.com.gym.read.ReadCsv;

public class RaceResults {

	public static Map<Integer, Long> bestFullTime() {
		long x = 0;
		LinkedList<Driver> values = ReadCsv.csv("/home/vinicius/Desktop/kart.csv");
		Map<Integer, Long> mapBestTime = new HashMap<Integer, Long>();
		for (Driver Values : values) {
			if (mapBestTime.containsKey(Values.getIdPiloto())) {
				x = mapBestTime.get(Values.getIdPiloto()) + Values.getTempoVolta();
				mapBestTime.put(Values.getIdPiloto(), x);
			} else {
				x = Values.getTempoVolta();
				mapBestTime.put(Values.getIdPiloto(), x);
			}
		}
		return mapBestTime;
	}

	public static Map<Integer, Long> bestLap() {
		LinkedList<Driver> values = ReadCsv.csv("/home/vinicius/Desktop/kart.csv");
		Map<Integer, Long> mapBestLap = new HashMap<Integer, Long>();
		for (Driver Values : values) {
			if (mapBestLap.containsKey(Values.getIdPiloto())) {
				if (Values.getTempoVolta() < mapBestLap.get(Values.getIdPiloto())) {
					mapBestLap.put(Values.getIdPiloto(), Values.getTempoVolta());
				}
			} else {
				mapBestLap.put(Values.getIdPiloto(), Values.getTempoVolta());
			}
		}
		
		return mapBestLap;
	}
	

	public static Map<Integer, Integer> lapsTotal() {
		LinkedList<Driver> values = ReadCsv.csv("/home/vinicius/Desktop/kart.csv");
		Map<Integer, Integer> mapEndlessLaps = new HashMap<Integer, Integer>();
		for (Driver Values : values) {
			if (mapEndlessLaps.containsKey(Values.getIdPiloto())) {
				int y = mapEndlessLaps.get(Values.getIdPiloto());
				mapEndlessLaps.put(Values.getIdPiloto(), y + 1);
			} else {
				mapEndlessLaps.put(Values.getIdPiloto(), 1);
			}
		}
		return mapEndlessLaps;
	}

	public static Map<Integer, Double> speedTotal() {
		double x = 0;
		LinkedList<Driver> values = ReadCsv.csv("/home/vinicius/Desktop/kart.csv");
		Map<Integer, Double> mapspeedTotal = new HashMap<Integer, Double>();
		for (Driver Values : values) {
			if (mapspeedTotal.containsKey(Values.getIdPiloto())) {
				x = mapspeedTotal.get(Values.getIdPiloto()) + Values.getVelMediaVolta();
				mapspeedTotal.put(Values.getIdPiloto(), x);
			} else {
				x = Values.getVelMediaVolta();
				mapspeedTotal.put(Values.getIdPiloto(), x);
			}
		}
		return mapspeedTotal;
	}

	public static Map<Integer, String> names() {
		LinkedList<Driver> values = ReadCsv.csv("/home/vinicius/Desktop/kart.csv");
		Map<Integer, String> mapNames = new HashMap<Integer, String>();
		for (Driver Values : values) {
			mapNames.put(Values.getIdPiloto(), Values.getPiloto());
		}
		return mapNames;
	}

	public static Map<Integer, Integer> idDriver() {
		LinkedList<Driver> values = ReadCsv.csv("/home/vinicius/Desktop/kart.csv");
		Map<Integer, Integer> mapIds = new HashMap<Integer, Integer>();
		for (Driver Values : values) {
			mapIds.put(Values.getIdPiloto(),Values.getIdPiloto());
		}
		return mapIds;
	}
	
	}

