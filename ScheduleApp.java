import jxl.Workbook;
import jxl.write.*;
import jxl.write.Number;

import java.io.File;
import java.io.IOException;

Public class ScheduleApp {
	
	Public String[] tempSched;
	
	/*
	 * Takes care of reading in the excel file containing a schedule. It outputs the schedule in the form of a String array
	 * which will be parsed through later.
	 * 
	 * input: fileName of the excel file
	 * output: 2D String array of the schedule
	 */
	Public static String[] readExcelSched(String fileName){
		
	}
	
	/*
	 * Creates a schedule based on start date, number of weeks to schedule and what week in the master schedule we're in currently
	 * 
	 * input: Master schedule array, number of weeks to schedule, current week number in master schedule to start from
	 * output: 
	 */
	
	Public static String[] createCurrentSched(String[] master, int weeks, int currentWeek){
		
	}
	
	/*
	 * Takes the array and writes out an excel file with its details.
	 * 
	 * input: String Array
	 * output: excel file containing the schedule
	 */
	Public static WriteableWorkbook createArraySched(String[] Array){
		
	}
	
	
	/*
	 * Takes the requests for days off and applies them to the master schedule
	 * 
	 * output: excel file containing the schedule with changes
	 */
	Public static WriteableWorkbook mergeScheduling(String[] master String[] request){
		
	}
	
	Public static
	
	
	/*
	 * 
	 * 
	 * input: name of employee, integer array representation of days off: 
	 * 		  example: Monday june 6th and Tuesday June 7th = [10606,20607]
	 * output: 		  
	 * 
	 */
	Public static String[] requestForm(String name, Integer[] daysOff){
		
	}
	
	Public static Integer numWorkers(){
		
	}
	
	
	/*
	 * Returns all the stat days for the specified date region
	 * 
	 * input: start date and end date of the scheduling period: ie June 6th 2018, Sept 10th, 2018 = 060618 and 091018 respectively.
	 * output: An integer array containing all the statutory holidays for that period. (year not included)
	 */
	Public static Integer[] importStatDays(int startDate, int endDate){
		
	}
	
}