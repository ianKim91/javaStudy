package ex2;

import java.util.Scanner;

public class ScannerExample4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("입력 1 : ");
		String input = sc.next() + " ";
			// 안녕_반가워~_
			
		System.out.print("입력 2 : ");
		input += sc.next() + " ";
		
		System.out.print("입력 3 : ");
		input += sc.next();
		
		System.out.println(input);
		
		//누적 효과 (변수의 재사용성)
	}

}
