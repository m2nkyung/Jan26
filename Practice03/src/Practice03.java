/*가로와 세로를 읽어서 넓이를 계산하여 출력하는 프로그램을 작성하라.
가로: 10
세로: 20
넓이는  200입니다.
*/

import java.util.Scanner;
public class Practice03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int width, height;
		
		System.out.print("가로 : ");
		width = input.nextInt();
		System.out.print("세로 : ");
		height = input.nextInt();
		
		System.out.println("넓이는 " + (width * height) + "입니다.");
	}
}