import java.util.HashMap;
import java.util.Map;

public class question6 {
    public static void main(String[] args) {
        int[] arr={5,4,5,4,6,8,9,8,9,6,2};
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<=arr.length-1;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else
                map.replace(arr[i],2);
        }
        map.forEach((k,v)-> System.out.println(k +" "+v));
        for( Map.Entry<Integer,Integer> search:map.entrySet())
        {
            if(search.getValue()==1)
            {
                System.out.println("Key which is single in array: "+search.getKey());
                break;
            }
        }
    }
}
