package sub4;

/*
 * 날짜 : 2026/04/28
 * 이름 : 남현호
 * 내용 : Java 반복문 while 실습  
 */
public class WhileTest {
	public static void main(String[] args) {
		
		// while 기본
		int i = 0;
		while (i < 10) {
			System.out.println("i : " + i);
			
			i++;
		}
		
		int sum = 0, k = 1;
		
		while (k <= 10) {
			System.out.printf("k : %d sum : %d\n", k, sum);
			
			sum += k;
			k++;
		}

		// do-while
		int total = 0, j = 1;
		
		do {
			if (j % 2 == 0) {
				total += j;
			}
			
			j++;
			
			System.out.printf("j : %d sum : %d\n", j, total);
		} while(j <= 10);
		
		int num = 1;
		
		while(true) {
			if (num % 5 == 0 && num % 7 == 0) break;
			
			num++;
		}
		
		System.out.println("5와 7의 최소공배수 : " + num);
		
		// continue
		int tot = 0, n = 1;
		while(n <= 10) {
			
			n++;
			
			if(n % 2 == 1) { 
				continue; // 반복문 상위(처음) 이동
			}
			
			tot += n;
		}
		
		System.out.println("1부터 10까지 짝수합 : " + tot);
	}
}
