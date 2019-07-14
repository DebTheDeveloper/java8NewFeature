package Java8;

import Java8.Inteface.LambdaExpressionStringLength;

public class GetLengthTest {
	
	public static void main(String[] args) {
		
		LambdaExpressionStringLength l1 = S-> {return S.length();};
		LambdaExpressionStringLength l2 = S-> S.length();
		System.out.println("Length is: "+l1.getLength("Arka"));
		System.out.println(l2.getLength("Arka"));
		
	}
	

}
