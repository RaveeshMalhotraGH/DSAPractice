import java.util.HashSet;
import java.util.Set;



public class Main
{
       
    public int[] findSubArrayWithGivenSum(int arr[], int targetSum){
        int back=-1;
        
        int front=0;
        int tempSum = arr[front];
        int [] result = {-1,-1};
        
        while(front<arr.length){
            System.out.println("inside while");
            System.out.println("front:"+front);
            System.out.println("back:"+back);
            System.out.println("tempSum:"+tempSum);
            if(tempSum==targetSum){
                result[0] = back+1;
                result[1] = front;
                break;
            }
            else{
                if(tempSum<targetSum){
                    front++;
                    tempSum = tempSum + arr[front];
                    System.out.println("adding:"+arr[front]);
                }
                else{
                    back++;
                    tempSum = tempSum - arr[back];
                    System.out.println("subtracting:"+arr[back]);
                }
            }
            System.out.println("tempSum:"+tempSum);
            System.out.println("\n");
        }
        System.out.println("returning...");
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
