/*원기둥의  반지름: 10 
원기둥의  높이: 100 
원기둥의  부피는  31415.92*/

import java.util.Scanner;
public class Practice07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double PI = 3.141592;
		Scanner input = new Scanner(System.in);
		
		int radius, height;
		double vol;
		
		System.out.print("원기둥의 반지름 : ");
		radius = input.nextInt();
		System.out.print("원기둥의 높이 : ");
		height = input.nextInt();
		
		vol = PI * radius * radius * height;
		
		System.out.println("원기둥의 부피는 " + vol);
	}
}