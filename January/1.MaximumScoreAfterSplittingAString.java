/* 1422. Maximum Score After Splitting a String :-

Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).
The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.

Example 1:
Input: s = "011101"
Output: 5 
Explanation: 
All possible ways of splitting s into two non-empty substrings are:
left = "0" and right = "11101", score = 1 + 4 = 5 
left = "01" and right = "1101", score = 1 + 3 = 4 
left = "011" and right = "101", score = 1 + 2 = 3 
left = "0111" and right = "01", score = 1 + 1 = 2 
left = "01110" and right = "1", score = 2 + 1 = 3

Example 2:
Input: s = "00111"
Output: 5
Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5

Example 3:
Input: s = "1111"
Output: 3
 
*/


package January;

public class MaximumScoreAfterSplittingAString {

	public static void main(String[] args) 
	{
		String s = "1111";
		System.out.println(maxScore(s));
	}
	
	static int maxScore(String s)
	{
		char[] ch = s.toCharArray();
		int zeros = 0;
		int maxScore = -1;
		
		for(int i=0;i<s.length()-1;i++)
		{
			int ones = 0;
			int count = 0;
			if(ch[i] == '0')
				zeros++;
			
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[j] == '1')
					ones++;
			}
			
			count = zeros + ones;
			
			if(count > maxScore)
				maxScore = count;
		}
		
		return maxScore;
	}

}
