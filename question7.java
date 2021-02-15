public class question7 {
    static String fname,lname;
    static int age;
    static{
        fname="abhishek";
        lname="bhardwaj";
        age=23;
        System.out.println(fname+" "+lname+" "+age);
    }

   static void display()
    {
        System.out.println(fname+" "+lname+" "+age);
    }
    public static void main(String[] args) {
        System.out.println(question7.fname+" "+question7.lname+" "+question7.age);
        question7.display();
    }
}
