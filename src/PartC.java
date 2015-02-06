
public class PartC {

	public static void main(String[] args){
		
		//Long Start = System.currentTimeMillis();
		
		String inputfilepath = "E:/Urjit Data/Desktop/test4.txt";	
		
		ToPartC partCobj = new ToPartC();
		partCobj.CountTwoGrams(inputfilepath);
		partCobj.PrintCinDecOrder();
		
		//Long End = System.currentTimeMillis();
		//System.out.println(End-Start);
	}
}
