public class question11 {
    String bankName;
    double rateofinterest;
    int minBalance;
    void setDetails(String bankName, double rateofinterest, int minBalance)
    {
        this.bankName=bankName;
        this.rateofinterest=rateofinterest;
        this.minBalance=minBalance;
    }
    void getDetails()
    {
        System.out.println("Bank Details");
    }
}

