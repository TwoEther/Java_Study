package ch6;

import java.util.Scanner;

public class AccountExample {
    public static void main(String[] args){
        Account[] account = new Account[100];
        int idx = 0;

        while(true){
            System.out.println("---------------------------");
            System.out.println("1. 계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 | 5. 종료");
            System.out.println("---------------------------");
            Scanner sc = new Scanner(System.in);

            System.out.print("선택 > ");
            int choice = Integer.parseInt(sc.nextLine());


            if (choice == 1) {
                if (idx >= 100) {
                    break;
                }
                System.out.println("------------");
                System.out.println("계좌생성");
                System.out.println("------------");

                System.out.print("계좌번호 : ");
                String account_number = sc.nextLine();

                System.out.print("계좌주 : ");
                String person = sc.nextLine();

                System.out.print("초기입금액 : ");
                int money = Integer.parseInt(sc.nextLine());
                account[idx] = new Account(account_number, person, money);
                idx += 1;

                System.out.println("계좌가 생성되었습니다 : ");
            } else if (choice == 2) {
                System.out.println("------------");
                System.out.println("계좌목록");
                System.out.println("------------");

                for (int i = 0; i < idx; i++) {
                    account[i].getData();
                }

            } else if (choice == 3) {
                System.out.println("------------");
                System.out.println("예금");
                System.out.println("------------");

                System.out.println("계좌번호 : ");
                String number = sc.nextLine();

                System.out.println("예금액 : ");
                int money = Integer.parseInt(sc.nextLine());

                for (int i = 0; i < idx; i++) {
                    if (account[i].getPerson().equals(number)) account[idx].deposit(money);
                }
            } else if (choice == 4) {
                System.out.println("------------");
                System.out.println("출금");
                System.out.println("------------");

                System.out.println("계좌번호 : ");
                String number = sc.nextLine();

                System.out.println("출금액 : ");
                int money = Integer.parseInt(sc.nextLine());

                for (int i = 0; i < idx; i++) {
                    if (account[i].getPerson().equals(number)) account[idx].withdraw(money);
                }
            } else
                break;
        }
    }
}
