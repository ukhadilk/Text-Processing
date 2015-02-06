
public class PartD {
	public static void main(String[] args){
		
		//Long Start = System.currentTimeMillis();
		
		String inputfile = "E:/Urjit Data/Desktop/simpletest.txt";
		
		ToPartD partDobj = new ToPartD();
		partDobj.checkandstore(inputfile);
		partDobj.palindromeDecOrder();
		
		//Long End = System.currentTimeMillis();
		//System.out.println(End-Start);
	}
}
