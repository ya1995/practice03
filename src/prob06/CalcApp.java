package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			/*  코드를 완성 합니다 */
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			int a = Integer.parseInt( tokens[0] );
			int b = Integer.parseInt( tokens[2] );
			
			switch( tokens[1] ) {
			case "+" : {
				Add add = new Add();
				add.setValue( a, b );
				int result = add.calc();
				
				break;
				}
			case "-" : {
				Sub sub = new Sub();
				sub.setValue( a, b );
				int result = sub.calc();
				
				break;
			}
			case "*" : {
				Mul mul = new Mul();
				mul.setValue( a, b );
				int result = mul.calc();
				
				break;
			}
			case "/" : {
				Div div = new Div();
				div.setValue( a, b );
				int result = div.calc();
				
				break;
			}
			
			}
			
			
			
		}
		
		scanner.close();

	}

}
