package sub02;

import java.util.Scanner;

/**
 * 날짜 : 2026/05/01
 * 이름 : 남현호
 * 내용 : 프로그래머스 기출문제 2번 각도 합치기 
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = (angle1 + angle2) % 360;
        System.out.println(sum_angle);
    }
}
