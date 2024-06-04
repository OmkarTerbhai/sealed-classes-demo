import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Please choose the desired lender for your Home Loan...");
        System.out.println("1. National Bank");
        System.out.println("2. NBFCs");
        
        String lender = console.readLine();

        
        if("National Bank".equalsIgnoreCase(lender)) {
            NationalBank nationalBank = null;
            System.out.println("Please choose the desired national bank for your Home Loan...");
            System.out.println("1. SBI");
            System.out.println("2. PNB");
            String bankName = console.readLine();
            
            if("SBI".equalsIgnoreCase(bankName)) {
                nationalBank = new SBI();
            } else if ("PNB".equalsIgnoreCase(bankName)) {
                nationalBank = new PNB();
            }
            else {
                System.out.println("Wrong choice entered");
                return;
            }

            System.out.println("Your interest rate is : " + nationalBank.getCurrentInterest());
        } else if ("NBFC".equalsIgnoreCase(lender)) {
            NBFC nbfc = null;
            System.out.println("Please choose the desired NBFC for your Home Loan...");
            System.out.println("1. BajajFinance");
            System.out.println("2. MuthootFinance");
            String bankName = console.readLine();

            if("BajajFinance".equalsIgnoreCase(bankName)) {
                nbfc = new BajajFinance();
            } else if ("MuthootFinance".equalsIgnoreCase(bankName)) {
                nbfc = new MuthootFinance();
            }
            else {
                System.out.println("Wrong choice entered");
                return;
            }
            System.out.println("Your interest rate is : " + nbfc.getCurrentInterest());
        }
    }
}