import java.util.*;
import java.io.*;

public class ReformatCode {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File (args[0]);
		Scanner sc = new Scanner(file);
		ArrayList <String> str = new ArrayList<>();
		while (sc.hasNext()) {
			str.add(sc.nextLine());
		}
		sc.close();
		
		PrintWriter fw = new PrintWriter(file);
		String temp = "";
		for (int i=0;i<str.size()-1;i++) {
			if (str.get(i+1).trim().equals("{")) {
				temp = str.get(i)+str.get(i+1).trim();
				fw.println(temp);
				i++;

			}
			else {
				fw.println(str.get(i));
			}
		}
		if (!str.get(str.size()-1).equals("{")) {
			fw.print(str.get(str.size()-1));
		}
		
		
		fw.close();
		

	}

}
