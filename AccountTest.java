import java.util.Date;

public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account(1122,20.000,4.5);
        account.withDraw(2.5000);
        account.depositMoney(3.000);
        account.setDateCreated(new Date());
        double balance = account.getBalance();
        System.out.println("Balance is:" +balance);
        double monthInterest = account.getMonthlyInterest();
        System.out.println("monthInterest"+monthInterest);
        String dateCreated = account.getDateCreated().toString();
        System.out.println("Date Created is: " + dateCreated);
    }
}
