package Methods;/*minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow.
For example, suppose RBI has set minimum interest rate applicable to a saving bank account to be 4% annually;
however, banks are free to use 4% interest rate or to set any rates above it.*/

public class Assignment24 {
    class Customer {
        float minimum_interest_rate;
        int minimum_balance_allowed;
        int maximum_withdrawal_limit;
        //Personal Details
        int accNo;
        int userName;
        float accBalance;
        String branchName;
        String BankName;

        //Few functions
        int withdrawal;
        int credit;

    }

    class Account {
        //Account details
        float accBalance;
        String branchName;
        String BankName;

        //Few Functions

    }

    public class RBI {
        Customer c;//has A relationship
        Account a;//has A relationship

        public double getInterestRate() {

            return 0;
        }

        public double getWithdrawalLimit() {

            return 0;
        }
    }
}
/*
    }
    class SBI: public void RBI
    {
        //use RBI functionality or define own functionality

    }
    class ICICI : public void RBI
    {

        //use RBI functionality or define own functionality
    }

}
*/