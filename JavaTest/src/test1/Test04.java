package test1;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		char grade = 0;
		
		System.out.println("입력한 점수는 " + score + "입니다.");
		
		if(score / 25 >= 4) {
			grade = 'A';
		} else if(score / 25 == 3) {
			grade = 'B';
		} else if(score / 25 == 2) {
			grade = 'C';
		} else if(score / 25 == 1) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("등급은 %c입니다.", grade);
	}
}
