/* 사용자로부터  실수  값  x를  입력  받아서  함수  값을  계산, 화면에  출력하는  프로그램을  작성하여라.
•      입력은  double형으로  받는다.
•        실행예제  (1)
•      x 값을  입력하세요: 10.0
•      f(x) = 72.0
•        실행예제  (2)
•      x 값을  입력하세요: -100.0
•      f(x) = -999098.0
*/

import java.util.Scanner;
public class Practice10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double d, result;
		
		System.out.print("x 값을 입력하세요 : ");
		d = input.nextDouble();
		
		if(d > 0) {
			result = (7 * d) + 2;
		} else {
			result = (d * d * d) - (9 * d) + 2; 
		}
		
		System.out.println("f(x) = " + result);
	}
}