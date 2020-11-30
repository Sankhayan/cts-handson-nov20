package morning.prog2;

import java.util.*;

public class Bank {

	public static void main(String args[]) throws java.io.IOException {
		int choice, an = 1;
		List<AccountModel> list = new ArrayList<AccountModel>();
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				System.out.println("  1. Add account");
				System.out.println("  2. Remove account by account number");
				System.out.println("  3. Display account by account number");
				System.out.println("  4. Display all account by account number");
				System.out.println("  5. Display those account having the balance less than 1000");
				System.out.println("  6. Exit");
				System.out.println("Choose one:");
				choice = sc.nextInt();

				System.out.println("");

				switch (choice) {
				case 1:
					System.out.println("Enter Name: ");
					String name = sc.next();
					System.out.println("Enter Amount: ");
					double balance = sc.nextDouble();
					AccountModel account1 = new AccountModel(an, name, balance);
					list.add(account1);
					an++;
					System.out.println("Account added");
					System.out.println(account1.toString());
					break;
				case 2:
					System.out.println("enter Account No.: ");
					int accountNo1 = sc.nextInt();
					Iterator<AccountModel> itr = list.iterator(); 
			        while (itr.hasNext()) 
			        { 
			            AccountModel a = itr.next(); 
			            if (a.getAccountNo() == accountNo1) 
			                itr.remove(); 
			        } 
					System.out.println("Account removed");
					break;
				case 3:
					System.out.println("enter Account No.: ");
					int accountNo2 = sc.nextInt();
					AccountModel am = null;
					for(AccountModel a : list) {
						if(accountNo2 == a.getAccountNo())
							am = a;
					}
					System.out.println(am.toString());
					break;
				case 4:
					for(AccountModel a : list) {
						System.out.println(a.toString());
					}
					break;
				case 5:
					for(AccountModel a : list) {
						if(a.getBalance() < 1000)
							System.out.println(a.toString());
					}
					break;
				case 6:
					return;
				}
			}
		}
	}
}