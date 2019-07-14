package Java8;

import Java8.Inteface.LambdaExpressionAdd;

public class LambdaExpressionAddTest {
	
	public static void main(String[] args) {
		LambdaExpressionAdd l1 = (d,e) ->System.out.println(d+e+" is the Result");
		l1.add(2, 3);
	}

}
