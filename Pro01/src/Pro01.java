/* P101
두 개의 정수를 입력받아서，큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하라.
실행결과
정수를입력하시오: 10 
정수를입력하시오: 23
23을 10으로 나눈 몫은 2이고 나머지는 3입니다. */

import java.util.Scanner;
public class Pro01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("정수를 입력하시오 : ");
		n1 = input.nextInt();
		System.out.print("정수를 입력하시오 : ");
		n2 = input.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1 + "을 " + n2 + "로 나눈 몫은 " + (n1 / n2) + "이고 나머지는" + (n1 % n2) + "입니다.");
		} else {
			System.out.println(n2 + "을 " + n1 + "로 나눈 몫은 " + (n2 / n1) + "이고 나머지는" + (n2 % n1) + "입니다.");
		}

	}

}
