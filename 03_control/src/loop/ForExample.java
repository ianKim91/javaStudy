package loop;

import java.util.Scanner;

public class ForExample {

	/* for문
	 * - 끝이 정해져 있는 (횟수가 지정되어 있는) 반복문
	 * 
	 * [작성법]
	 * for(초기식 ; 조건식 ; 증감식) {
	 * 
	 * 		반복 수행할 코드
	 * }
	 * 
	 * - 초기식 : for 문을 제어하는 용도의 변수 선언
	 * 
	 * - 조건식 : for문의 반복 여부를 지정하는 식
	 * 			보통 초기식에서 사용된 변수를 이용하여 조건식을 작성함
	 * 
	 * - 증감식 : 초기식에 사용된 변수를
	 * 			for 문이 끝날 때 마다 증가 또는 감소 시켜서
	 * 			조건식의 결과를 변하게 하는 식
	 * 
	 * */

	public void ex1() {
		// for문 기초 사용법1
		// 1~10 출력하기
		// --> 1부터 10까지 1씩 증가하여 출력

		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(i);
		}
	}

	public void ex2() {
		// for 기초 사용법2

		// 3에서 7까지 1씩 증가하며 출력
		//			-> i의 값이 7이하일때 true가 되는 조건식

		// 3 4 5 6 7

		for(int i = 3 ; i <= 7 ; i++) {
			System.out.print(i);
		}

	}
	public void ex3() {
		// 2부터 17까지 1씩 증가하며 출력

		for(int i = 2 ; i<17 ; i++) {
			System.out.println(i);
		}
	}

	public void ex4() {
		// 1부터 입력 받은 수가 2씩 증가하며 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자입력 : ");
		int input = sc.nextInt();

		for(int i=1 ; i<input ; i+=2) {
			System.out.println(i);
		}
	}
	public void ex5() {

		// 1부터 입력 받은 실수 까지 0.5씩 증가하며 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		double input = sc.nextDouble();

		for(double i = 1 ; i<input ; i+=0.5 ) {
			System.out.print(i + " ");
		}

	}
	public void ex6() {
		// 영어 알파벳 A 부터 Z까지 한 줄로 출력

		// * char 자료형은 문자형 이지만 실제로는 정수(문자표 번호)를 저장한다.

		for(int i='A' ; i<='Z' ; i++) {
			System.out.println((char)i);
		}
	}
	public void ex7() {

		// 10에서 1까지 1씩 감소하며 출력
		for(int i = 10 ; i>=1 ; i--) {
			System.out.println(i);
		}
	}
	public void ex8() {
		// for문 응용 1 : 반복문을 이용한 값의 누적

		// 1부터 10까지 모든 정수의 합 구하기
		int sum = 0;

		for(int i = 1 ; i<=10 ; i++) {
			sum += i;
			System.out.println(sum);
		}
	}
	public void ex9() {


		// for문 응용 2 : 정수 5개를 입력 받아서 합계 구하기

		// ex)
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 입력 4 : 40
		// 입력 5 : 50

		// 합계 : 150

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		for(int i = 1 ; i<=5 ; i++ ) {
			System.out.println("입력 " + i + " : ");
			int input = sc.nextInt();

			sum += input;
		}
		System.out.println(sum);
	}

	public void ex10() {

		// 정수를 몇 번 입력 받을지 먼저 입력 받고
		// 입력된 정수의 합계를 출력

		// ex)
		// 입력 받을 정수의 개수 : 3
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 합계 : 60

		// ex)
		// 입력 받을 정수의 개수 : 2
		// 입력 1 : 10
		// 입력 2 : 20
		// 합계 : 30

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받을 정수의 개수");
		int num = sc.nextInt();

		int sum = 0;

		for(int i = 1 ; i<=num; i++) {
			System.out.print("입력" +i + ":");
			int input = sc.nextInt();
			sum += input;
		}
		System.out.println("합계 : " + sum);
	}

	public void ex11() {
		// 1 부터 20 까지 1씩 증가하면서 출력
		// 단, 5의 배수에 () 를 붙여서 출력
		// ex) 1 2 3 4 (5) 6 7 8 9 (10) 11 ...

		for(int i = 1 ; i <= 20 ; i++) {
			if(i %5 == 0) {
				System.out.print("("+i+")");

			} else
				System.out.print(" "+i);
		}
	}

	public void ex12() {
		// 1 부터 20까지 1씩 증가하면서 출력
		// 단, 입력 받은 수의 배수는 () 표시

		// ex)
		// 괄호를 표시할 배수 : 3
		// 1 2 (3) 4 5 (6) ...

		// 괄호를 표시할 배수 : 4
		// 1 2 3 (4) 5 6 7 (8) 9 ...

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();

		for(int i = 1; i<=20 ; i++) {
			if(i % input==0) {
				System.out.println("("+i+")");
			}else
				System.out.println(i);
		}

	}
	public void ex13() {

		// [구구단 출력]
		// 2 ~ 9 사이 수를 하나 입력 받아
		// 해당 단을 출력
		// 단, 입력 받은 수가 2 ~ 9 사이 숫자가 아니면 "잘못 입력 하셨습니다" 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("단을 입력하세요 : ");
		int dan = sc.nextInt();

		if(dan >= 2 && dan <= 9) {
			for(int i = 1 ; i <= 9 ; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			} 
		} else {
			System.out.println("잘못 입력하셨습니다");


		}

	}

	public void ex14() {
		// [19단 출력기]
		// 2 ~ 19단 사이 단을 입력 받아서 x 1 ~ x 19 까지 출력
		// 단, 2 ~ 19 사이 단이 입력되지 않으면 "잘못 입력 하셨습니다." 출력

		Scanner sc = new Scanner(System.in);

		System.out.println("2~19 단 사이를 입력하세요 : ");
		int dan = sc.nextInt();

		if(dan>=2 && dan<=19) {
			for(int i = 1 ; i <= 9 ; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");

		}
	}

	public void ex15() {
		// 구구단 모두 출력하기
		for(int dan = 2 ; dan <= 9 ; dan++) {
			for(int num = 1 ; num <= 9 ; num ++) {
				System.out.printf("%d*%d=%d\n",dan,num,dan*num);
			} 
			System.out.println();

		}
	}
	public void ex16() {
		// 구구단 역순 출력

		// 9단 -> 2단 까지 역방향

		for(int dan = 9 ; dan >= 2 ; dan--) {
			for(int num = 9 ; num >= 1 ; num--) {
				System.out.printf("%d*%d=%d\n", dan,num,dan*num);
			}
			System.out.println();
		}
	}
	public void ex17() {

		// 2중 for문을 이용해서 다음 모양을 출력하시오.

		// 12345
		// 12345
		// 12345
		// 12345
		// 12345
		for(int i = 1 ; i <= 5 ; i++) {
			for(int i1 = 1 ; i1 <= 5 ; i1++ ) {
				System.out.print(i1);
			}
			System.out.println();
		}

		System.out.println("----------------------------------------");

		// 54321
		// 54321
		// 54321

		for(int i = 1 ; i<=3 ; i++) {
			for(int i1 = 5 ; i1>=1 ; i1--) {
				System.out.print(i1);
			}
			System.out.println();
		}
	}
	public void ex18() {

		// 2중 for문을 이용하여 다음 모양을 출력하시오.

		// 1
		// 12
		// 123
		// 1234

		for(int i = 1 ; i <= 4 ; i++) {

			for(int i1 = 1 ; i1 <= i ; i1++) {
				System.out.print(i1);
			}
			System.out.println();
		}

		System.out.println("----------------");

		for(int i=4 ; i>=1 ; i--) {
			for(int i1 = 1 ; i1<=i ; i1++) {
				System.out.print(i1);
			}
			System.out.println();
		}
	}
	public void ex19() {
		// count (숫자 세기)

		// 1부터 20까지 1씩 증가하면서
		// 3의 배수의 총 개수 출력

		// 3 6 9 12 15 18 : 6개

		int count = 0; // 3의 배수의 개수를 세기 위한 변수
		int sum = 0; // 3의 배수의 합계를 구하기 위한 변수

		for(int i=1; i<=20; i++) {

			if(i % 3 == 0) { // 3의 배수

				System.out.print(i + " ");
				count++; // if문이 동작할 때 마다 1씩 증가
				sum += i; // 3의 배수 누적
			}
		}
		System.out.println(": " + count + "개");
		System.out.println("3의 배수의 합계 : " + sum);
	}

	public void ex20() {
		// 2중 for문과 count를 이용해서 아래 모양 출력하기

		//  1  2  3  4
		//  5  6  7  8
		//  9 10 11 12
		
		int count=1;

		for(int i = 1 ; i <= 3 ; i++) {
			for(int i1 = 1 ; i1 <= 4 ; i1++) {
				System.out.printf("%3d" , count);
				count++;
			}
			System.out.println();
		}
	}
}