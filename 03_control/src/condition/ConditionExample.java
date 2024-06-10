package condition;

import java.util.Scanner;

public class ConditionExample {

	public void ex1() {

		// if문
		// - 조건식이 true 일때만 내부 코드 수행

		/* [작성법]
		 * if(조건식){
		 * 조건식이 true일 때 수행할 코드
		 * }
		 * */

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 : ");
		int input = sc.nextInt();

		// 입력된 정수가 양수인지 검사

		if(input > 0) {
			System.out.println("양수입니다");
		}

		if(input <= 0) {
			System.out.println("양수가 아닙니다");
		}
	}

	public void ex2() {

		// if - else문
		// - 조건식 결과가 true이면 if문,
		// false이면 else 구문 수행

		/* if(조건식) {
		 * 		조건식이 ture일 때 수행할 코드
		 * } else {
		 * 		조건식이 false일때 수행할 코드
		 * }
		 * */

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력");
		int input = sc.nextInt();

		if(input %2 != 0) {
			System.out.println("양수입니다");

		} else {

			if(input == 0) {
				System.out.println("0입니다");

			} else {
				System.out.println("음수입니다");
			}
		}
	}

	public void ex3() {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 입력 : ");
		int input = sc.nextInt();


		if(input > 0) {
			System.out.println("양수입니다");

		}else if(input < 0 ) {
			System.out.println("음수입니다");

		} else
			System.out.println("0입니다");
	}

	public void ex4() {

		// 달(month)을 입력받아 해당 달에 맞는 계절 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("달 입력 : ");
		int month = sc.nextInt();

		String season;

		if(month == 3 || month == 4 || month == 5) {
			season = "봄";
		}else if (month == 6 || month == 7 || month == 8) {
			season = "여름";
		}else if (month == 9 || month == 10 || month == 11) {
			season = "가을";
		}else if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else 
			season = "해당하는 계절 없음";

		System.out.println(season);

	}

	public void ex5() {

		// 나이를 입력 받아
		// 13세 이하면 "어린이 입니다."
		// 13세 초과 19세 이하면 "청소년 입니다."
		// 19세 초과 시 : "성인 입니다." 출력

		Scanner sc = new Scanner(System.in);

		System.out.println("나이 입력 : ");
		int age = sc.nextInt();



		if(age <= 13) {
			System.out.println("어린이 입니다");

		} else if(age > 19) {
			System.out.println("성인입니다");

		} else
			System.out.println("청소년입니다");
	}

	public void ex6() {

		// 점수(100점 만점)를 입력 받아
		// 90점 이상 : A
		// 80점 이상 90점 미만 : B
		// 70점 이상 80점 미만 : C
		// 60점 이상 70점 미만 : D
		// 60점 미만 : F
		// 0점 미만, 100 초과 : "잘못 입력하셨습니다."

		Scanner sc = new Scanner(System.in);

		System.out.println("점수 입력 : ");
		int input = sc.nextInt();

		if(input >= 90) {
			System.out.println("A");
		}else if(input >= 80) {
			System.out.println("B");
		}else if(input >= 70) {
			System.out.println("C");
		}else if(input >= 60) {
			System.out.println("D");
		}else if(input >= 0) {
			System.out.println("F");

		}else
			System.out.println("잘못 입력하셨습니다");
	}

	public void ex7() {

		// 놀이기구 탑승 제한 검사

		// 나이가 12세 이상, 키 140.0cm 이상 일 경우에만 "탑승 가능"
		// 나이가 12세 미만인 경우 : "적정 연령이 아닙니다."
		// 키가 140.0cm 미만인 경우 : "적정 키가 아닙니다."
		// 나이를 0세 미만, 100세 초과 시 : "잘못 입력 하셨습니다."


		Scanner sc = new Scanner(System.in);

		System.out.println("나이 입력 : ");
		int age = sc.nextInt();

		String result;

		if(age < 0 || age > 100) {
			result = "잘못입력하셨습니다";

		} else {
			System.out.println("키를 입력하세요 : ");
			double height = sc.nextDouble();

			if(age < 12) {
				result = "적정 연령이 아닙니다";

			}else if(height < 140.0) {
				result = "적정 키가 아닙니다";
			}else
				result = "탑승 가능";

		}

		System.out.println(result);
	}
	public void ex8() {
		// 놀이기구 탑승 제한 검사 프로그램
		// 조건 - 나이 : 12세 이상
		//     -  키 : 140.0cm 이상

		// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
		// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
		// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료

		// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
		// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
		// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
		// 나이 O , 키 O : "탑승 가능"

		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();

		String result;

		if(age < 0 || age > 100) {
			result = "나이를 잘못 입력 하셨습니다";

		} else {
			System.out.println("키 입력 : ");
			double height = sc.nextDouble(); 

			if (height <0 || height > 250.0){
				result = "키를 잘못 입력하셨습니다";
			} else {

				if (age > 12 && height < 140.0 ) {
					result = "나이는 적합하나, 키가 적절치 않음";

				} else if ( age < 12 && height > 140.0) {
					result = "키는 적절하나, 나이는 적절치 않음";

				} else if (age <=12 && height < 140.0 ) {
					result = "나이와 키 모두 적절치 않음";

				} else {
					result = "탑승 가능";
				}
			}
		}
		System.out.println(result);




	}
}

