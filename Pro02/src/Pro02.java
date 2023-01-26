/* P101
cm로 표현된 키를 입력하여 피트와 인치로 변환하는 프로그램을 작성하시오. 
1피트는 12인치이고 1인치는 2.54cm이다.

키를입력하시오: 163
163cm는 5피트 4.173228346456691인치입니다.
 */

import java.util.Scanner;
public class Pro02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int cm, fit;
		double inch;
		
		System.out.print("키를 입력하시오 : ");
		cm = input.nextInt();
		fit = (int)(cm / 2.54 / 12);
		inch = (cm - (fit * 2.54 * 12)) / 2.54;
		
		System.out.println(cm + "cm는 " + fit + "피트 " + inch + "인치입니다.");
	}
}