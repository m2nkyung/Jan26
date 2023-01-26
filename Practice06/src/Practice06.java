/*이름: 김동덕 
나이: 21
이름은  김동덕이고  나이는  21세입니다.*/

import java.util.Scanner;
public class Practice06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("이름 : ");
		name = input.next();
		System.out.print("나이 : ");
		age = input.nextInt();
		
		System.out.println("이름은 " + name + "이고 나이는 " + age + "세입니다.");
	}

}
