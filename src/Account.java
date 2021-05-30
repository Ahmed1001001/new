class Account {
    private double balance;
    private int account_number;

    Account() {
    }

    public Account(int a, double b) {
        account_number = a;
        balance = b;
    }

    public void set_account_number(int a) {
        account_number = a;
    }

    public void set_balance(double b) {
        balance = b;
    }

    public int get_account_number() {
        return account_number;
    }

    double get_balance() {
        return balance;
    }

    void withdraw(int value) {
        if (value > balance) {
            System.out.println("error");
        } else {
            balance -= value;
            System.out.println("done ");
        }


    }

    void deposit(int value) {
        balance += value;
    }

    public String toString() {
        return "the account number = " + account_number + "\n the balance = " + balance + "\n";

    }
}
class specialAccount extends Account
{
    specialAccount(int account_number,double balance)
    {
        super(account_number,balance);
    }

    @Override
    void withdraw(int value) {
        if (get_balance()+1000<value)
        {
            System.out.println("error");
        }
        else
        {
            set_balance(get_balance()-value);

        }

    }


}
