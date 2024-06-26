package loop;

import java.util.Scanner;

public class WhileExample {

	/*while 문
	 * - 별도의 초기식, 증감식이 존재하지 않고
	 * 반복 종료 조건을 자유롭게 설정하는 반복문
	 * 
	 * ** 확실히 언제 반복이 끝날지는 모르지만
	 * 언젠간 반복 조건이 false가 되는 경우 반복을 종료함
	 * 
	 * [작성법]
	 * while(조건식) {
	 * 			조건식이 true일때 반복 수행할 구문
	 * }
	 * */

	public void ex1() {

		Scanner sc = new Scanner(System.in);
		int input = 0;

		while(input != 9) {
			System.out.println("-------------------------------------");
			System.out.println("-------------- 메뉴 선택 --------------");
			System.out.println("1. 돈가스");
			System.out.println("2. 제육볶음");
			System.out.println("3. 떡볶이");
			System.out.println("9. 종료");

			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();

			// input 값에 따라서 case 선택
			switch(input) {
			case 1 : System.out.println("돈가스를 주문하였습니다"); break;
			case 2 : System.out.println("제육볶음 주문하였습니다"); break;
			case 3 : System.out.println("떡볶이를 주문하였습니다"); break;
			case 9 : System.out.println("메뉴 선택을 종료합니다"); break;

			default : System.out.println("잘못누르셨습니다"); break;
			}

		}
	}
	public void ex2() {
		// 입력되는 모든 정수의 합 구하기
		// 단, 0이 입력되면 반복 종료 후 결과 출력
		// -> 0이 입력되지 않으면 계속 반복

		Scanner sc = new Scanner(System.in);
		int input = -1;
		int sum = 0;

		while(input != 0) {

			System.out.print("정수 입력 : ");
			input = sc.nextInt();

			sum += input;
		}
		System.out.println("합 : "+sum);

	}
	public void ex3() {
		// 입력되는 모든 정수의 합 구하기
		// 단, 0이 입력되면 반복 종료 후 결과 출력
		// -> 0이 입력되지 않으면 계속 반복

		Scanner sc = new Scanner(System.in);
		int input = 0; // 입력 받은 값을 저장할 변수

		int sum = 0; // 모든 정수의 합을 저장하는 변수

		// 2) while문을 최소 한 번은 수행하는 반복문
		//  -> do ~ while

		do {

			System.out.print("정수 입력 : ");
			input = sc.nextInt();

			sum += input; // 입력 받은 값을 sum에 누적

		} while(input != 0);

		System.out.println("합계 : " + sum);

	}
}



