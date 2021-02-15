public class question10 {
    void add(int num1,int num2)
    {
        System.out.println(num1+num2);
    }
    void add(double num1, double num2)
    {
        System.out.println(num1+num2);
    }
    void multiply(int num1, int num2)
    {
        System.out.println(num1*num2);
    }
    void multiply(float num1, float num2)
    {
        System.out.println(num1*num2);
    }
    void concat(String st1,String str2)
    {
        System.out.println(st1+str2);
    }
    void concat(String st1,String str2,String str3)
    {
        System.out.println(st1+str2+str3);
    }

    public static void main(String[] args) {

        question10 obj=new question10();
        obj.add(10,20);
        obj.add(10.234,53.908);
        obj.multiply(10,4);
        obj.multiply(23.4f,6.1f);
        obj.concat("Hello this is concat function"," containing two strings");
        obj.concat("Hello this is concat function containing three string first var"," second var"," third var");
    }

}
