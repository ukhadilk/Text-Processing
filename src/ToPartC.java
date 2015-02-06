import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class ToPartC {
	public String line2;
	public HashMap<tokens, Integer> TokenMapTwoGram = new HashMap<tokens, Integer>();

	public void CountTwoGrams(String inputtopartC) {

		Tokenizer tokenizerobject = new Tokenizer();
		TwoGramNew twogramobj = new TwoGramNew();

		try {
			BufferedReader inputbuffer = new BufferedReader(new FileReader(inputtopartC));

			while ((line2 = inputbuffer.readLine()) != null) {
				tokenizerobject.MakeTokens(line2);
				TokenMapTwoGram = twogramobj.CalculateTwoGram(
						tokenizerobject.returntokenlist(), TokenMapTwoGram);

			}

			inputbuffer.close();

		}

		catch (Exception e) {
			System.out.println("Error in linking the file to the reader");
		}
	}

	void PrintCinDecOrder() {
		System.out.println("\n\nSorted in Decreasing Order of Occurance:");
		List<tokens> sortedlist = new ArrayList<tokens>(
				TokenMapTwoGram.keySet());

		Comparator<tokens> cmp = new Comparator<tokens>() {

			public int compare(tokens a1, tokens a2) {
				Integer int1 = TokenMapTwoGram.get(a1);
				Integer int2 = TokenMapTwoGram.get(a2);
				return int1.compareTo(int2);
			}
		};
		Collections.sort(sortedlist, Collections.reverseOrder(cmp));

		for (tokens tok1 : sortedlist) {
			System.out.println("Two Gram: " + tok1.token1 + " " + tok1.token2
					+ "\t" + "Count: " + TokenMapTwoGram.get(tok1));
		}
	}

}