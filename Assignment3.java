package Lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) throws FileNotFoundException {
		int countwords=0,countlines=0,countchar=0,array1=0;
		File file= new File("C:\\Users\\vijsimha\\Desktop\\vijaya.txt");
		Scanner scanner=new Scanner(file);
		
		while(scanner.hasNextLine())
		{
			String line=scanner.nextLine();
			String []words=line.split(" ");
			countwords +=words.length;
			countlines+=1;
			countchar+=countwords;
			
		}
		
		System.out.println("number of words:" +countwords);
		System.out.println(" number of lines: "+countlines);
		System.out.println(" number of characters:" +countchar);
		

	}

}
