import java.util.*;

public class Palindrome {

	String reverse;
	public boolean b;
	public int count;
	public String str1;
	public String phrase;
	public String normalisedphrase;

	public HashMap<String, Integer> CountPalindrome(List<String> listoftokensD,
			HashMap<String, Integer> PalindromeMap) {

		phrase = "";
		for (ListIterator<String> iter = listoftokensD.listIterator(); iter
				.hasNext();) {

			phrase = phrase.concat(iter.next());

			normalisedphrase = phrase.replaceAll("\\s", "");

			reverse = new StringBuilder(normalisedphrase).reverse().toString();

			if (b = normalisedphrase.equals(reverse)) {

				if (!PalindromeMap.containsKey(phrase)) {

					PalindromeMap.put(phrase, 1);
				}

				else {
					PalindromeMap.put(phrase, (PalindromeMap.get(phrase) + 1));
				}

			}

			phrase = phrase.concat(" ");

		}
		return PalindromeMap;
	}

}