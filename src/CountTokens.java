import java.util.*;
import java.util.Map.Entry;

public class CountTokens {
	public int i;

	public HashMap<String, Integer> CountFrequency(List<String> list,
			HashMap<String, Integer> TokenMap) {
		i = 0;
		while (i < list.size()) {

			if (!TokenMap.containsKey(list.get(i))) {
				TokenMap.put(list.get(i), 1);

			}

			else {
				TokenMap.put(list.get(i), (TokenMap.get(list.get(i)) + 1));
			}

			i++;
		}

		return TokenMap;
	}
}
