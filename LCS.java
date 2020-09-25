
public class LCS {
	public static void main(String[] args) {
		System.out.println(calculateLCS("ABCDGH", "AEDFHRS"));
		System.out.println(calculateLCS("GXTXAYB", "AGGTAB"));
	}
	
	public static String calculateLCS(String s1, String s2) {
		char s1Arr[] = s1.toCharArray();
		char s2Arr[] = s2.toCharArray();
		String lcs = "";
		for (int n1 = 0; n1 < s1.length(); ++n1) {
			for (int n2 = 0; n2 < s2.length(); ++n2) {
				if (s1Arr[n1] == s2Arr[n2]) {
					lcs += s1Arr[n1];
					s2Arr[n2] = 0;
					break;
				}
			}
		}
		return lcs;
	}
}
