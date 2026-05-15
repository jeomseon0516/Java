package sub20;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc
    			.next()
    			.chars()
    			.map(c -> Character.isLowerCase(c) ? c - 32 : c + 32)
    			.collect(StringBuilder::new,
    					 StringBuilder::appendCodePoint,
    					 StringBuilder::append)
    			.toString();
    
    System.out.println(a);
	}
}
