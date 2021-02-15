public class BOI extends question11 {
    String headOffice="Mumbai";
    @Override
    void setDetails(String bankName, double rateofinterest, int minBalance) {
        super.setDetails(bankName, rateofinterest, minBalance);
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Head Office: "+headOffice+"\n"+"Bank name: "+bankName +"\n"+"Rate: "+rateofinterest+"\n"+"Minimum Balance: "+minBalance);
    }

    public static void main(String[] args) {
        BOI boi = new BOI();
        boi.setDetails("Bank of India",3.25,0);
        boi.getDetails();
    }
}
