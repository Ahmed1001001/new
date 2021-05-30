public class main {

        public static void Main(String[] args) {

            Account acc1= new Account(150,150);
            acc1.deposit(900);
            acc1.withdraw(1500);
            acc1.withdraw(2000); // note that will return false
            System.out.println(acc1.toString());

            System.out.println("***********"); // to seperate a two classes results

            specialAccount acc2=new specialAccount(1000,1000);
            acc2.deposit(1000);
            acc2.withdraw(3000);
            System.out.println(acc2.toString());


        }
}
