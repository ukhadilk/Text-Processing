import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ToPartA {
	
	String lineA = "";
	Tokenizer tokenizerobjectA = new Tokenizer();
	ArrayList<String> listoftokensA = new ArrayList<String>();

	public void MakeTokensA(String inputforpartA) {

		try {

			BufferedReader inputbuffer = new BufferedReader(new FileReader(inputforpartA));

			while ((lineA = inputbuffer.readLine()) != null) {
				tokenizerobjectA.MakeTokens(lineA);
				listoftokensA.addAll(tokenizerobjectA.returntokenlist());

				for (String tok : listoftokensA) {
					System.out.println(tok);
				}

			}
			inputbuffer.close();
		} catch (Exception e) {
			System.out.println("Error in linking the file to the reader");
		}
	}
}
