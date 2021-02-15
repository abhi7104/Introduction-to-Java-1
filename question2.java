import java.util.HashMap;
import java.util.Map;

public class question2 {
    public static void main(String[] args) {
        String str="abhi abhi shek shek ttn ttn ttn ";
        String[] newarr=str.split(" ");
        Map<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<=newarr.length-1;i++)
        {
            if(!map.containsKey(newarr[i]))
            {
                map.put(newarr[i],1);
            }
            else
                {
                    int temp= map.get(newarr[i]);
                    temp=temp+1;
                    map.replace(newarr[i], temp);
                }
        }
        map.forEach((k,v)-> System.out.println("Char: "+k +" "+"Occurances: "+v));

    }
}
