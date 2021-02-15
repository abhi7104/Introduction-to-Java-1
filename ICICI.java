public class ICICI extends question11 {
    String headOffice="Mumbai";
    @Override
    void setDetails(String bankName, double rateofinterest, int minBalance) {
        super.setDetails(bankName, rateofinterest, minBalance);
    }

    @Override
    void getDetails() {
        super.getDetails();
        System.out.println("Bank name: "+bankName +"\n"+"Rate: "+rateofinterest+"\n"+"Minimum Balance: "+minBalance+ "\n" +"Head Office: "+headOffice);
    }

    public static void main(String[] args) {
        ICICI icici = new ICICI();
        icici.setDetails("ICICI Bank",5.50,10000);
        icici.getDetails();
    }
}
