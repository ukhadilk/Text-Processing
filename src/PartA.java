
public class PartA {
	public static void main(String[] args){
		
		//Long Start = System.currentTimeMillis();
		
		String inputfilepath = "E:/Urjit Data/Desktop/simpletest.txt";
		ToPartA partAobj = new ToPartA();
		partAobj.MakeTokensA(inputfilepath);
		
		//Long End = System.currentTimeMillis();
		//System.out.println(End-Start);
	}
}
