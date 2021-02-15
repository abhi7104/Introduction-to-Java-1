public class SBI extends question11 {
    String contact="agmcustomer.lhodel@sbi";
    @Override
    void setDetails(String bankName, double rateofinterest, int minBalance) {
        super.setDetails(bankName, rateofinterest, minBalance);
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Bank name: "+bankName +"\n"+"Rate: "+rateofinterest+"\n"+"Minimum Balance: "+minBalance+"\n"+"Contact Info: "+contact);
    }

    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.setDetails("State Bank of India",4.54,0);
        sbi.getDetails();
    }
}
