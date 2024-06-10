package practice;

import java.util.Scanner;

public class OpPractice {
	
	public void practice1() {
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		// 인원 수와 사탕 개수를 키보드로 입력 받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
		/*[실행화면]
		인원 수 : 29
		사탕 개수 : 100
		1인당 사탕 개수 : 3
		남는 사탕 개수 : 13
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원을 입력하시오 : ");
		int input = sc.nextInt();
		
		System.out.print("사탕 개수를 입력하시오 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + candy / input);
		System.out.println("남은 사탕 개수 : " + candy % input);
		
	
	}
	
	public void practice2() {

	// 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
	//세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
	//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
	//세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int mat = sc.nextInt();
		
		int sum = (kor + eng + mat);
		double avg = (sum / 3.0);
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f\n", avg);
		
		boolean result = ((kor >= 40) &&  (eng >= 40) && (mat >= 40) && (avg >= 60 ));
		System.out.println(result ? "합격" : "불합격" );

		
		
	}	

}
