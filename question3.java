public class question3 {
    public static void main(String[] args) {
        String str="this is it";
        int len=str.length();
        int replacedchar=str.replace("i","").length();
        System.out.println(len+" "+replacedchar);
        System.out.println("Occurances of i is :"+(len-replacedchar));
    }
}
