public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("12345", "Majed", 300);
        Account account2 = new Account();
        account2.setName("Faisal");
        account2.setId("12435");
        account2.setBalance(500);

        System.out.println("First Account" +
                "\nID: " + account1.getId() +
                "\nName: " + account1.getName() +
                "\nBalance: " + account1.getBalance()
        );

        System.out.println();
        System.out.println("Second Account" +
                "\nID: " + account2.getId() +
                "\nName: " + account2.getName() +
                "\nBalance: " + account2.getBalance()
        );

        // credit
        System.out.println("Account1 balance: " + account1.getBalance());
        System.out.println("200 credit operation to account1");
        System.out.println(account1.credit(200));

        // debit
        System.out.println("1000 debit from account1");
        System.out.println(account1.debit(100));

        // insufficient debit
        System.out.println("700 debit from account1 (not allowd!)");
        System.out.println(account1.debit(700));

        // transfer
        System.out.println("account1 balance: " + account1.getBalance());
        System.out.println("account2 balance: " + account2.getBalance());
        System.out.println("transfer 200 from account1 to account2");
        System.out.println(account1.transferTo(account2, 200));
        System.out.println("account1 balance after transfer: " + account1.getBalance());
        System.out.println("account2 balance after transfer: " + account2.getBalance());

        System.out.println(account1.transferTo(account2, 500));

        // to string method
        System.out.println(account1.toString());
    }
}