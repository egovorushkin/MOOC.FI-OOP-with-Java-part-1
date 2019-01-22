
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        Account matAcc = new Account("Matt's account", 1000);
        Account myAcc = new Account("My account", 0);

        matAcc.withdrawal(100.0);
        myAcc.deposit(100.0);

        System.out.println(matAcc);
        System.out.println(myAcc);
    }

}
