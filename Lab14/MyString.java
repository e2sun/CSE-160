//Evelyn Sun
//115417946

import java.util.Arrays;

public class MyString {
	private char[]chars;
	public MyString(char[]chars) {
		this.chars=chars;
		}
	public char charAt(int index) {
		return chars[index];
	}
	public int length() {
		return chars.length;
	}
	public MyString substring(int begin,int end) {
		char[]sub=new char[end-begin];
		int k=0;
		while (k<sub.length) {
			for (int i=begin;i<end;i++) {
				sub[k]=chars[i];
				k++;
			}
			//return new MyString(sub);
		}
		return new MyString(sub);
	}
	public MyString toLowerCase() {
		char[]lower=new char[chars.length];
		for (int i=0;i<chars.length;i++) {
			lower[i]=Character.toLowerCase(chars[i]);
		}
		return new MyString(lower);
	}
	public boolean equals(MyString s) {
		boolean equal=true;
		if (this.length()!=s.length()) {
			equal=false;
		}
		else {
			for (int i=0;i<s.length();i++) {
				if (chars[i]!=charAt(i)) {
					equal=false;
				}
			}
			
		}
		return equal;
	}

	public static MyString valueOf(int i) {
	    if (i == 0) {
	        return new MyString(new char[]{'0'});
	    }
	    int length = 0;
	    int temp = i;
	    while (temp != 0) {
	        temp /= 10;
	        length++;
	    }
	    boolean negative = (i < 0);
	    int[] digits = new int[length];
	    int digitIndex = 0;
	    i = Math.abs(i);
	    while (i > 0) {
	        digits[length - digitIndex - 1] = i % 10;
	        digitIndex++;
	        i = i / 10;
	    }
	    int digitChar_length = (negative) ? length + 1 : length;
	    char[] digitChar = new char[digitChar_length];
	    int digitChar_index = 0;
	    if (negative) {
	        digitChar[0] = '-';
	        digitChar_index++;
	    }
	    for (int j = 0; j < length; j++) {
	        digitChar[digitChar_index + j] = (char) (digits[j] + '0');
	    }
	    return new MyString(digitChar);
	}

	public MyString[] split(MyString s) {
	    
	    int count = 0;
	    int start = 0;
	    int end;
	    while ((end = indexOf(s, start)) != -1) {
	        count++;
	        start = end + s.length();
	    }
	    count++;
	    MyString[] result = new MyString[count];
	    start = 0;
	    int index = 0;
	    while ((end = indexOf(s, start)) != -1) {
	        result[index++] = substring(start, end);
	        start = end + s.length();
	    }
	    
	    result[index] = substring(start, length());
	    for (int i = index + 1; i < count; i++) {
	        result[i] = substring(start, length());
	    }

	    return result;
	}

	// Helper method to find the index of 's' in the string
	private int indexOf(MyString s, int fromIndex) {
	    char[] sChars = s.chars;
	    for (int i = fromIndex; i <= chars.length - sChars.length; i++) {
	        boolean found = true;
	        for (int j = 0; j < sChars.length; j++) {
	            if (chars[i + j] != sChars[j]) {
	                found = false;
	                break;
	            }
	        }
	        if (found) {
	            return i;
	        }
	    }
	    return -1;
	}

	// Helper method to create a substring
	private MyString substring(int start, int end) {
	    char[] sub = new char[end - start];
	    for (int i = start; i < end; i++) {
	        sub[i - start] = chars[i];
	    }
	    return new MyString(sub);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]test = {'h','e','l','l','o'};
		char[]test2 = {'g','o','o','d','b','y','e'};
		
		MyString one = new MyString(test);
		MyString two= new MyString(test2);
			    // Test charAt() and length()
		    System.out.println("Testing charAt() and length():");
		    System.out.println("Character at index 1 in 'hello': " + one.charAt(1));
		    System.out.println("Length of 'hello': " + one.length());
		    System.out.println();

		    // Test substring()
		    System.out.println("Testing substring():");
		    MyString subString = one.substring(1, 4);
		    System.out.println("Substring from index 1 to 3 in 'hello': " + Arrays.toString(subString.chars));
		    System.out.println();

		    // Test toLowerCase()
		    System.out.println("Testing toLowerCase():");
		    MyString lowerCaseString = one.toLowerCase();
		    System.out.println("Lowercase of 'hello': " + Arrays.toString(lowerCaseString.chars));
		    System.out.println();

		    // Test equals()
		    System.out.println("Testing equals():");
		    System.out.println("Are 'hello' and 'goodbye' equal? " + one.equals(two));
		    System.out.println();

		    // Test valueOf()
		    System.out.println("Testing valueOf():");
		    MyString valueString = MyString.valueOf(12345);
		    System.out.println("String value of 12345: " + Arrays.toString(valueString.chars));
		    System.out.println();

		    // Test split()
		    System.out.println("Testing split():");
		    MyString testString = new MyString(new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'});
		    MyString[] splits = testString.split(new MyString(new char[]{'c', 'd'}));
		    System.out.println("Splitting 'abcdefghijk' by 'cd':");
		    for (MyString str : splits) {
		        System.out.println(Arrays.toString(str.chars));
		    }
	}
		
	

		
		
		
		
	}


