/*사용자로부터  3개의  정수를  읽어  들인  후에  if-else 문을  사용하여  가장  작은  값을 결정하는  프로그램을  작성하여라.
•      입력은  모두  정수로  받는다.
•      음수  입력도  가능한  것으로  한다.
*/

import java.util.Scanner;
public class Practice09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3, min;
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		n1 = input.nextInt();		
		System.out.print("두번째 숫자를 입력하세요 : ");
		n2 = input.nextInt();		
		System.out.print("세번째 숫자를 입력하세요 : ");
		n3 = input.nextInt();
		
		if(n1 > n2) {
			if(n3 > n2) {
				min = n2;
			} else {
				min = n3;
			}			
		} else {
			if(n3 > n1) {
				min = n1;
			} else {
				min = n3;
			}
		}
		
		System.out.println("가장 작은 숫자는 " + min + "입니다.");
	}
}