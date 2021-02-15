import java.util.ArrayList;

public class question5 {
    public static void main(String[] args) {
        int[] arr={1,23,45,66,76,8};
        int[] arr1={1,23,43,66,46,8};
        ArrayList<Integer> arrnew= new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr[i]==arr1[j])
                {
                    arrnew.add(arr[i]);
                }
            }
        }
        for(int i: arrnew)
        {
            System.out.println(i);
        }
    }
}
