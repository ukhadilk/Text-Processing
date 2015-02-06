
public class PartB {
	public static void main(String[] args){
	
	//Long Start = System.currentTimeMillis();	
		
	String inputfilepath = "E:/Urjit Data/Desktop/simpletest.txt";	
		
	ToPartB partBobj = new ToPartB();
	partBobj.CountWordFrequenciesB(inputfilepath);
	System.out.println("Now Printing");
	partBobj.PrintBinDecOrder();
	
	//Long End = System.currentTimeMillis();
	//System.out.println(End-Start);
	}
}
