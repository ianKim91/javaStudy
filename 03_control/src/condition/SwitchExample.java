package condition;

import java.util.Scanner;

public class SwitchExample {
	/* switch문
	 * - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
	 * -> 식의 결과로 얻은 값과 같은 case 구문이 수행된다.
	 * 
	 * [작성법]
	 * switch(식){
	 * 
	 * case 결과값1 : 수행코드1; break;
	 * case 결과값2 : 수행코드2; break;
	 * case 결과값3 : 수행코드3; break;
	 * ...
	 * default : case를 모두 만족하지 않을 경우 수행하는 코드;
	 * }
	 * */

	public void ex1() {

		// 키보드로 정수를 입력 받아
		// 1 이면 "빨강색"
		// 2 이면 "주황색"
		// 3 이면 "노란색"
		// 4 이면 "초록색"
		// 1~4 사이 숫자가 아니면 "흰색" 출력

		//		Scanner sc = new Scanner(System.in);
		//		
		//		System.out.println("숫자 입력 : ");
		//		int input = sc.nextInt();
		//		
		//		switch(input) {
		//		case 1 : System.out.println("빨강색") ; break;
		//		case 2 : System.out.println("주황색") ; break;
		//		case 3 : System.out.println("노란색") ; break;
		//		case 4 : System.out.println("초록색") ; break;
		//		
		//		}

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 입력 : ");
		int input = sc.nextInt();
		String color;

		switch(input) {
		case 1 : color = "초록색"; 
		case 2 : color = "주황색";
		case 3 : color = "노란색";
		case 4 : color = "초록색";

		default : color = "흰색";

		System.out.println(color);

		}
	}

	public void ex2() {

		// 정수를 입력 받아 4팀으로 나누기

		// 1이면 백팀
		// 2이면 홍팀
		// 3이면 청팀
		// 나머지는 흑팀

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int input = sc.nextInt();

		String team;

		switch(input) {
		case 1 : team = "백팀"; break;
		case 2 : team = "홍팀"; break;
		case 3 : team = "청팀"; break;

		default : team = "흑팀";  break;


		}
		System.out.println(team);
	}

	public void ex3() {

		// 달 입력 시 계절 판별(switch 버전)

		//		Scanner sc = new Scanner(System.in);
		//
		//		System.out.println("달 입력");
		//		int month = sc.nextInt();
		//
		//		String Season;
		//
		//		switch(month) {
		//
		//		case 1 : Season = "겨울" ; break;
		//		case 2 : Season = "겨울"; break;
		//		case 3 : Season = "봄"; break;
		//		case 4 : Season = "봄"; break;
		//		case 5 : Season = "봄"; break;
		//		case 6 : Season = "여름"; break;
		//		case 7 : Season = "여름"; break;
		//		case 8 : Season = "여름"; break;
		//		case 9 : Season = "가을"; break;
		//		case 10 : Season = "가을"; break;
		//		case 11 : Season = "가을"; break;
		//		case 12 : Season = "겨울"; break;
		//
		//		default : Season = "잘못입력하셨습니다"; break;
		//		}
		//		System.out.println(Season);

		Scanner sc = new Scanner(System.in);

		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		String season;

		switch (month) {
		case 1 : case 2 : case 12 : season = "겨울"; break;
		case 3 : case 4 : case 5 : season = "여름"; break;
		case 6 : case 7 : case 8 : season = "가을"; break;
		case 9 : case 10 : case 11 : season = "가을"; break;
		default : season = "잘못 입력 하셨습니다" ; break;
		}

		System.out.println(season);


	}
	public void ex4() {
		// 정수 2개와 연산자(+ - * / %) 1를 입력 받아서 결과 출력

		// ex)
		// 정수 1 입력 : 4
		// 연산자 입력 : *
		// 정수 2 입력 : 3

		// 계산 결과 : 4 * 3 = 12

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt();

		System.out.print("연산자 입력 : ");
		String op = sc.next();

		System.out.print("정수 2 입력 : ");
		int input3 = sc.nextInt();

		switch(op) {

		case "+" : System.out.printf("%d + %d = %d\n", input1, input3, input1+input3); break;
		case "-" : System.out.printf("%d - %d = %d\n", input1, input3, input1-input3); break;
		case "*" : System.out.printf("%d * %d = %d\n", input1, input3, input1*input3); break;
		case "/" : 

			if(input3 == 0) {
				System.out.println("0을 나눌 수 없습니다");

			}else {
				System.out.printf("%d / %d = %d\n", input1, input3, input1/input3 ); 

			}
			break;
		case "%" : System.out.printf("%d %% %d = %d\n", input1, input3, input1%input3); break;
		default : System.out.println("존재하지 않는 연산자입니다");
		}

	}
}



