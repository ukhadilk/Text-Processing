import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class ToPartB {

	public String line1;
	public HashMap<String, Integer> TokenMapMain = new HashMap<String, Integer>();
	public int totalwords = 0;
	public int value;

	public void CountWordFrequenciesB(String inputtopartB) {

		Tokenizer tokenizerobject = new Tokenizer();
		CountTokens counttokensobj = new CountTokens();

		try {
			BufferedReader inputbuffer = new BufferedReader(new FileReader(inputtopartB));
			while ((line1 = inputbuffer.readLine()) != null) {
				tokenizerobject.MakeTokens(line1);

				TokenMapMain = counttokensobj.CountFrequency(
						tokenizerobject.returntokenlist(), TokenMapMain);

			}

			inputbuffer.close();

		}

		catch (Exception e) {
			System.out.println("Error in linking the file to the reader");
		}

	}

	void PrintBinDecOrder() {
		System.out.println("\n\nSorted in Decreasing Order of Occurance:");
		List<String> sortedlist = new ArrayList<String>(TokenMapMain.keySet());

		Comparator<String> cmp = new Comparator<String>() {

			// ??@Override

			public int compare(String a1, String a2) {
				Integer int1 = TokenMapMain.get(a1);
				Integer int2 = TokenMapMain.get(a2);
				return int1.compareTo(int2);
			}
		};
		Collections.sort(sortedlist, Collections.reverseOrder(cmp));

		for (String sortedtok : sortedlist) {
			value = TokenMapMain.get(sortedtok);
			System.out.println("Word: " + sortedtok + "\t" + "Count: " + value);
			totalwords = totalwords + value;

		}
		System.out.println(totalwords);
	}

}
