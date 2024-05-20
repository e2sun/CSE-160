//Evelyn Sun
//115417946


public class RemoveDuplicates {
	public static String removeDuplicates(String str) {
		if (str.length()<=1) {
			return str;
		}
		char firstLetter=str.charAt(0);
		String restOfString =  remove(firstLetter, str.substring(1));
		return firstLetter + removeDuplicates(restOfString);
	}
	public static String remove(char c, String str) {
		if (str.length()==0) {
			return str;
		}
		if (c==str.charAt(0)) {
			return remove(c,str.substring(1));
		}
		else {
			return str.charAt(0)+remove(c,str.substring(1));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aafadfdsafsdfsdfsdfasdfasdf";
		System.out.println(removeDuplicates(str));
		String str2="abcaabcbabc";
		System.out.println(removeDuplicates(str2));
				
				

	}

}
