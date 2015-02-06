import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class TwoGramNew {

	
	
	public String tempfortoken1 = null;
	public int i = 0;

	public HashMap<tokens, Integer> CalculateTwoGram(List<String> list,
			HashMap<tokens, Integer> twoGramMapNew) {

		for (ListIterator<String> iter = list.listIterator(); iter.hasNext();) {

			if (tempfortoken1 == null) {
				String first = iter.next();
				String second = iter.next();
				tempfortoken1 = second;

				tokens twograms = new tokens(first, second);

				if (!twoGramMapNew.containsKey(twograms)) {
					twoGramMapNew.put(twograms, 1);
				}

				else {
					twoGramMapNew.put(twograms,
							(twoGramMapNew.get(twograms) + 1));
				}

			}

			else {
				String second = iter.next();
				tokens twograms = new tokens(tempfortoken1, second);
				tempfortoken1 = second;

				if (!twoGramMapNew.containsKey(twograms)) {
					twoGramMapNew.put(twograms, 1);
				}

				else {
					twoGramMapNew.put(twograms,
							(twoGramMapNew.get(twograms) + 1));
				}

			}

		}
		return twoGramMapNew;
	}

}
