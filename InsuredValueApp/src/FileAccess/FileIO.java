package FileAccess;
/*
 * This is our FileIO class that reads the given csv file and returns the data which is read. 
 * 
 * 
 * @author Harun Eren Mutlu 270201089
 *
 * */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {
	private String line;
	private int count;
	private String file;
	
	private int getCount(String file) {// method that counts the number of lines of the given file
		FileReader fr;
		try {// we wrote this part to catch errors while reading the files
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			int tempCount = 0;
			while ((line= br.readLine()) != null) {
				tempCount ++;
			}// need to close fileReader and buffer reader 
			br.close();
			fr.close();
			return tempCount;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
		
		
	}
		 // method that reads HW1_Items.csv file and convert the data to two-dimensional array

		public String[][] getInsuredValues(){
			file = "HW2_InsuredValues.csv";
			int tempCount=this.getCount(file);
			String[][] listInsuredValues = new String[tempCount][8];			
			//two dimensional items array
			
			try {// we wrote this part to catch errors while reading the files
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				this.count = 0;

				while ((line= br.readLine()) != null) {
					int count_second= 0; // it is the second index of two-dimensional array 
					
					String[] listOfData = line.split(",");	// it creates a list and store all the data from line				
					while(count_second < listOfData.length) {
						listInsuredValues[count][count_second] = listOfData[count_second];
						count_second++;}
					count++;
					} 
					//need to close fileReader and buffer reader 
					br.close();
					fr.close();	
			} catch(FileNotFoundException exception) {
				System.out.println("Cities file not found"); 
			} catch(IOException exception) {
				System.out.println(exception);
			}
			
			return listInsuredValues;
		}
}
