//Evelyn Sun
//115417946
import java.util.Scanner;

public class Emergency {

	public static String emergency(String call){
		int index1 = call.indexOf("is");
		//System.out.println(index1);
		int index2 = call.indexOf(".");
		//System.out.println(index2);
		String name = call.substring(index1+3,index2);
		//System.out.println(name);
		
		
		int index3 = call.indexOf("report");
		//System.out.println(index3);
		int index4 = call.indexOf("Please");
		//System.out.println(index4);
		
		String event = call.substring(index3+7, index4-2);
		//System.out.println(event);
		
		int index5 = call.indexOf("come");
		//System.out.println(index5);
		
		int index6 = call.length()-1;
		//System.out.println(index6);
		
		String where = call.substring(index5+8, index6);
		//System.out.println(where);
		
		String hi = (event + " at " +  where +  " reported by " + name);
		return hi;
	}
	
	public static void main (String args[]) {
		System.out.println(emergency("Hello, my name is John Smith. I need to report a fire. Please come to 100 Circle Road."));
		System.out.println(emergency("Hello, my name is Mary Swith. I need to report a car accident. Please come to 2635 Main Street."));
		System.out.println(emergency("Hello, my name is Joe Bell. I need to report a robbery. Please come to 3595 Oakwood Avenue."));
	}

	
}
