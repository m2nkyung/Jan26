/* 사용자의 키와 몸무게를 입력 받아서 비만 여부를 판단하는 프로그램을 작성하여라.
표준  체중  = (키  – 100) * 0.9
키와  몸무게는  double형으로  입력  받는다.
*/

import java.util.Scanner;
public class Practice08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double height, weight, ideal;
		
		System.out.print("키를 입력하세요 : ");
		height = input.nextDouble();
		System.out.print("몸무게를 입력하세요 : ");
		weight = input.nextDouble();
		
		ideal = (height - 100) * 0.9;
		System.out.println("표준체중은 " + ideal + "입니다.");
		
		if(ideal > weight) {
			System.out.println("저체중입니다.");
		} else if (weight > ideal) {
			System.out.println("과체중입니다.");
		} else {
			System.out.println("정상체중입니다.");
		}
	}
}