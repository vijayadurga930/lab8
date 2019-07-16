package Lab8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Assessment6 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println(" enter year:");
		int year=scanner.nextInt();
		System.out.println(" enter month");
		int month=scanner.nextInt();
		System.out.println(" enter day");
		int day=scanner.nextInt();
		LocalDate localdate=LocalDate.of(year, month, day);
		LocalDate now=LocalDate.now();
		Period difference=Period.between(localdate,now);
		System.out.printf("\nDifference is %d years,%d months and %d days old\n\n",
		   difference.getYears(),difference.getMonths(),difference.getDays());
		
		
		 
		 
		

	}

}
