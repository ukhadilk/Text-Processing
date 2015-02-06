import java.util.*;
import java.io.*;

public class ToPartD {

	public String lineD;
	Palindrome palindromeobj = new Palindrome();
	List<String> validstrings, linetokens, combined;
	public HashMap<String, Integer> PalindromeFinalMap = new HashMap<String, Integer>();

	public HashMap<String, Integer> checkandstore(String inputtopartD) {

		Tokenizer tokenizerDobj = new Tokenizer();

		try {
			BufferedReader inputbuffer = new BufferedReader(new FileReader(inputtopartD));

			combined = new ArrayList<String>();

			while ((lineD = inputbuffer.readLine()) != null) {

				tokenizerDobj.MakeTokens(lineD);

				combined.addAll(tokenizerDobj.returntokenlist());

			}

			for (int i = 0; i < combined.size(); i++) {

				linetokens = combined.subList(i, combined.size());

				ListIterator<String> subiter = linetokens.listIterator();

				validstrings = new ArrayList<String>();

				while (subiter.hasNext()) {

					validstrings.add(subiter.next());

				}

				PalindromeFinalMap = palindromeobj.CountPalindrome(
						validstrings, PalindromeFinalMap);

			}

			inputbuffer.close();
		}

		catch (Exception e) {
			System.out.println("Error!");
		}

		return PalindromeFinalMap;
	}

	void palindromeDecOrder() {
		System.out.println("\n\nSorted in Decreasing Order of Occurance:");
		List<String> sortedlist = new ArrayList<String>(
				PalindromeFinalMap.keySet());

		Comparator<String> cmp = new Comparator<String>() {

			// ??@Override

			public int compare(String a1, String a2) {
				Integer int1 = PalindromeFinalMap.get(a1);
				Integer int2 = PalindromeFinalMap.get(a2);
				return int1.compareTo(int2);
			}
		};
		Collections.sort(sortedlist, Collections.reverseOrder(cmp));

		for (String sortedtok : sortedlist) {

			System.out.println("Palindrome: " + sortedtok + "\t" + "Count: "
					+ PalindromeFinalMap.get(sortedtok));
		}
	}

}
