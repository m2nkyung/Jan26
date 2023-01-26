/* 문자를  입력하세요: a / 모음입니다.
문자를  입력하세요: m / 자음입니다. */

import java.util.Scanner;
public class Practice11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		String s = input.next();
		
		switch(s) {
		
		case "a" :
		case "e" :
		case "i" :
		case "o" :
		case "u" :
			System.out.println("모음입니다.");
			break;
		default : 
			System.out.println("자음입니다.");
			break;
		}
	}
}