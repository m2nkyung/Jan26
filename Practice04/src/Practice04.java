/* 마일을  킬로미터로  변환하는 프로그램을  작성하라.
1마일은  1.609킬로미터와  같다
사용자로부터  마일의  값을  읽어  들인다.
원하는 마일을 입력하세요: 10 
10.0마일은 16.09킬로입니다. */

import java.util.Scanner;
public class Practice04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double mile;
		
		System.out.print("원하는 마일을 입력하세요 : ");
		mile = input.nextDouble();
		
		System.out.println(mile + "마일은 " + (mile * 1.609) + "킬로입니다.");
	}
}