package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Goods[] goods = new Goods[COUNT_GOODS];

		for (int i = 0; i < COUNT_GOODS; i++) {
			String line = scanner.nextLine();
			String[] tokens = line.split(" ");
			String name = tokens[0];
			int price = Integer.parseInt(tokens[1]);
			int count = Integer.parseInt(tokens[2]);
			
			Goods goodss = new Goods();
			goodss.setName( name );
			goodss.setPrice( price );
			goodss.setStock( count );
			
			goods[ i ] = goodss;
		}
		
		for( Goods goodss : goods ) {
			System.out.println( goodss.getName() + "(가격:" + goodss.getPrice() + "원)이 " + goodss.getStock() + "개 입고 되었습니다." );
		}
	}
}
