package Lab8;

import java.util.Scanner;

public class Assessment7 {

	public static void main(String[] args) {
		System.out.println(" enter username:");
		Scanner scanner=new Scanner(System.in);
		String s1=scanner.next();
		String s2=s1.substring(8, s1.length()-4);
		if(s1.substring(8,s1.length()).equals("_job")&&s2.length()==8)
		{
			System.out.println(" true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
