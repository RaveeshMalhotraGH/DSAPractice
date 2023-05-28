import java.util.HashSet;
import java.util.Set;



public class Main
{
    public Set<Integer> findLeadersRightToLeft(int lengths[]){
        int max;
        Set <Integer> result = new HashSet<Integer>();
		int i = lengths.length-1;
		max = lengths[i];
		result.add(lengths[i]);
		i--;
		for(; i>=0 ; i--){
		    if(lengths[i]>max){
		        result.add(lengths[i]);
		        max = lengths[i];
		    }
		}
		return result;
    }
    
    
    
	public static void main(String[] args) {
		int lengths [] = {1, 4, 0, 0, 3, 10, 5};
		Object result;
		Main obj = new Main();
		result = obj.findSubArrayWithGivenSum(lengths,7);
		for(int x: (int[]) result)
		System.out.println(x);

	}
}
