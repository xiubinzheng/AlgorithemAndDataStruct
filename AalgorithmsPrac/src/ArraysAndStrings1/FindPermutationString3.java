package ArraysAndStrings1;

import java.util.Arrays;

public class FindPermutationString3 {

	static boolean checkIfPermutationStrings(String s1,String s2) {
		
		if(s1.length() != s2.length())
			return false;
		char[] chars1 = s1.toLowerCase().toCharArray();
		char[] chars2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		
		for ( int i = 0 ; i < chars1.length; i++ ) {
			if(chars1[i] != chars2[i] )
				return false;
		}
		return true;
	}
	
	
}
