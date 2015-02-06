import java.io.*;
import java.util.*;

public class Tokenizer {

	public String line = "";

	int i, j, tokennumber;
	char c;
	ArrayList<String> tokens;

	public void MakeTokens(String line) { // opens the file, reads one line at a
		// time and then puts it into one
		// big line for now
		tokens = new ArrayList<String>();

		line = line.toLowerCase(); // to covert the line to lower case

		String normalizedline = line.replaceAll("[^a-zA-Z0-9]", " "); // special

		StringTokenizer tokensOfLine = new StringTokenizer(normalizedline); // makes
		// tokens

		while (tokensOfLine.hasMoreTokens()) {

			tokens.add(tokensOfLine.nextToken());

		}

	}

	public ArrayList<String> returntokenlist() {

		return tokens;

	}

	public void printtokens() {
		for (String tok : tokens) {
			System.out.println(tok);
		}
	}

}
