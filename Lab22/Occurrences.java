//Evelyn Sun
//115417946


public class Occurrences {
	private static int n=0; 
	public static int count(char[]chars,char ch) {
		n=0;
		return count(chars,ch,0);
		
	}
	public static int count(char[]chars,char ch, int high) {
		if (high==chars.length) {
			return n;
		}
		
		else if (ch==chars[high]) {
			n++;
			return count(chars,ch,high+1);
		}
		else {
			return count(chars,ch,high+1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]chars= {'a','a','b','c','d','e','e','e','f'};
		char[]test= {'a','b','c','d','e','f','x'};
		for (char c:test) {
			System.out.println("# of times \"" + c + "\" numbers: " + count(chars,c));
			
		}
	}

}
