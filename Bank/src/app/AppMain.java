package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {

	private static Scanner scanner = new Scanner(System.in);
	private static List<Account> accounts = new ArrayList<>();

	public static void main(String[] args) {
		boolean exit = false;
		while (!exit) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			int current = scanner.nextInt();
			switch (current) {
				case 1:
					createAccount();
					break;
				case 2:
					listAccounts();
					break;
				case 3:
					depositAccount();
					break;
				case 4:
					withdrawAccount();
					break;
				case 5:
					System.out.println("종료합니다..");
					exit = true;
					break;
				default:
					System.out.println("잘못된 입력입니다.");
					break;
			}
		}
	}

	public static void createAccount() {
		System.out.println("-------------- 계좌생성 -------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		if (balance < 0) {
			System.out.println("결과: 0보다 작은 값은 입력할 수 없습니다.");
			return;
		}
		
		System.out.println("결과: 계좌가 생성되었습니다.");

		accounts.add(new Account(ano, owner, balance));
	}

	public static void listAccounts() {
		System.out.println("-------------- 계좌목록 -------------");
		String accountsInfo = String.join("\n",
				accounts
					.stream()
					.map(a -> String.join(
							" ", 
							a.getAno(), 
							a.getOwner(), 
							String.valueOf(a.getBalance())))
					.toArray(String[]::new));

		System.out.println(accountsInfo);
	}

	public static void depositAccount() {
		System.out.println("-------------- 예금 -------------");
		System.out.print("계좌번호: ");
		String current = scanner.next();
		System.out.print("예금액: ");
		int amount = scanner.nextInt();

		Account account = findAccount(current);

		if (account == null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		
		if (amount <= 0) {
			System.out.println("결과 : 0보다 큰 값만 입력할 수 있습니다.");
			return;
		}

		int total = account.getBalance() + amount;
		account.setBalance(total);
		
		System.out.println("결과 : 예금이 성공되었습니다.");
	}

	public static void withdrawAccount() {
		System.out.println("-------------- 출금 -------------");
		System.out.print("계좌번호: ");
		String current = scanner.next();
		System.out.print("출금액: ");
		int amount = scanner.nextInt();
		
		Account account = findAccount(current);
		
		if (account == null) {
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		
		if (amount <= 0) {
			System.out.println("결과 : 0보다 큰 값만 입력할 수 있습니다.");
			return;
		}
		
		int total = account.getBalance() - amount;
		if (total < 0) {
			System.out.println("결과 : 예금액보다 큰 금액은 출금할 수 없습니다.");
			return;
		}

		account.setBalance(total);
		System.out.println("결과: 출금이 성공되었습니다.");
	}

	public static Account findAccount(String id) {
		var targetAccount = accounts
				.stream()
				.filter(a -> a.getAno().equals(id))
				.findAny();

		return !targetAccount.isEmpty() ? targetAccount.get() : null;
	}
}
