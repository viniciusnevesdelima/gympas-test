package br.com.gym.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import br.com.gym.entity.Driver;
import br.com.gym.format.FormatValues;

public class ReadCsv {

	public static LinkedList<Driver> csv(String file) {
		FormatValues convert = new FormatValues();
		BufferedReader br = null;
		LinkedList<Driver> drivers = new LinkedList<>();
		String line = "";
		String cvsSplitBy = ",";
		try {
			br = new BufferedReader(new FileReader(file));
			while ((line = br.readLine()) != null) {
				String[] corrida = line.split(cvsSplitBy);
				drivers.add(new Driver(corrida[0], 
						convert.stringToInt(corrida[1]), 
						corrida[2],
						convert.stringToInt(corrida[3]), 
						convert.stringToTime(corrida[4]),
						convert.stringToDouble(corrida[5])));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return drivers;
	}
}
