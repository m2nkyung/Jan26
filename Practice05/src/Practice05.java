/* 실행예제 
받은  돈  : 10000 
상품의  총액  : 7500 
부가세  : 750 
잔돈  : 2500*/

import java.util.Scanner;
public class Practice05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int input_money, cost, tax, change;
		
		System.out.print("받은 돈 : ");
		input_money = input.nextInt();
		System.out.print("상품의 총액 : ");
		cost = input.nextInt();
		
		tax = cost / 10;
		change = input_money - cost;
		
		System.out.println("부가세 : " + tax);
		System.out.println("잔돈 : " + change);
		}
}