package ex2;

import java.util.Scanner;

public class ScannerExample1 {
	
	public static void main(String[] args) {
		
		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게 하는 역할
		
		// Scanner 생성
		// -> 프로그램 안에 스캐너라는 기계를 만드는 것
		
		Scanner sc = new Scanner(System.in);
		// 오류 원인 -> 만들고 싶은데 설계도(class)가 없어서 못만들고 있음
		// -> import 구문 작성 시 오류 해결
		System.out.print("정수 1 입력");
		
		int input1 = sc.nextInt();
		// nextInt() : 다음 입력된 정수를 읽어옴 (키보드로 입력된 정수를 읽어옴)
		
		System.out.println("정수 2 입력 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n",input1, input2, input1+input2);
									// 계산이 들어가지 않는 값만 대입이면 ,(쉼표)로 구분한다
	}

}
