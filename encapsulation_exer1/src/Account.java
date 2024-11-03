public class Account {

    String id;
    String name;
    int balance = 0;

    Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    Account(){

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }


    public int credit(int amount){
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance){
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
        return this.balance;
    }

    public int transferTo(Account another, int amount){
        if (amount <= this.balance) {
            this.balance -= amount;
            another.credit(amount); // adding the transfer amount to the recipient user
            return this.balance;
        } else {
            System.out.println("Transfer not allowed: you do not enough balance!");
            return this.balance;
        }
    }

    public String toString() {

        return ("Account name: " + getName() +
                "\nAccount id: " + getId() +
                "\nAccount balance: " + getBalance());
    }
}
