package Lab8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assessment2 {

	public static void main(String[] args) throws IOException{
	BufferedReader bufferreader=new BufferedReader(new FileReader("C:\\Users\\vijsimha\\Desktop\\vijaya.txt"));
	int y=1;
	String s1=bufferreader.readLine();
	
	while(s1!=null) {
		System.out.println(y+", "+s1);
		try {
			s1=bufferreader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		y++;
	}

	}

}
