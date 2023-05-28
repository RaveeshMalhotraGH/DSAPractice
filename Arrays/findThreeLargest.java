import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main
{
    public Map<String,Integer> findThreeLargest(int[] a){
        int largest = Integer.MIN_VALUE;
        int smaller = Integer.MIN_VALUE;
        int smallest = Integer.MIN_VALUE;
        Map posToIndex = new HashMap<String,Integer>();
        
        for(int x: a){
            
            if(x>largest){
              smallest = smaller;
              smaller = largest;
              largest = x;
            }
            
            else if(x>smaller){
                smallest = smaller;
                smaller = x;
            }
            else if (x>smallest){
                smallest = x;
            }
        }
        posToIndex.put("largest",largest);
        posToIndex.put("smaller",smaller);
        posToIndex.put("smallest",smallest);
        
        
        return posToIndex;
        
    }
    
	public static void main(String[] args) {
		int[] arr = {1,27,47,8,90,3,5,6,2,44,16,48,67,93};
		Main obj = new Main();
        Map result = obj.findThreeLargest(arr);
        System.out.println(result);
	}
}
