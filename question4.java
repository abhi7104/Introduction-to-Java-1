public class question4 {
    public static void main(String[] args) {
        String str="Th#is is Abhishek.Bhardwaj@com";
        int countUpper =0,countLower=0,countSpecial=0,countNumber=0;
        for(int i=0;i<str.length();i++)
        {
         char ch=str.charAt(i);
         if(ch>='A'&& ch<='Z')
             countUpper++;
         else if(ch>='a'&&ch<='z')
             countLower++;
         else if(ch>='0'&&ch<='9')
             countNumber++;
         else
             countSpecial++;
        }
        System.out.println("String Length: "+ str.length());
        System.out.println("Uppercase char: "+ countUpper+" "+"Percentage: "+((countUpper*100)/str.length()));
        System.out.println("Lowercase char: "+ countLower+" "+"Percentage: "+((countLower*100)/str.length()));
        System.out.println("Number char: "+ countNumber+" "+"Percentage: "+((countNumber*100)/str.length()));
        System.out.println("Special char: "+ countSpecial+" "+"Percentage: "+((countSpecial*100)/str.length()));
    }

}
