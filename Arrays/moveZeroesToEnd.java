import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main
{
    public int[] moveZeroes(int[] a){
        int leftIndex = 0;
        int rightIndex = 0;
        int rightIncrementcounter = 0;
        int temp;
        int count=0;
        while( leftIndex<a.length){
            
            temp = Integer.MIN_VALUE;
            
            while(leftIndex<a.length && a[leftIndex]!=0){
                leftIndex++;
            }
            
            
            if(leftIndex+1 <a.length){
                
                // O(N*N)
                // rightIndex = leftIndex+1;
                // while( rightIndex<a.length-1 && a[rightIndex]==0  ){
                    
                //     rightIndex++;
                //     rightIncrementcounter++;
                // }
                
                
                // O(N)
                while( leftIndex>rightIndex||(rightIndex<a.length-1 && a[rightIndex]==0 ) ){
                    rightIndex++;
                    rightIncrementcounter++;
                }

                temp = a[leftIndex];
                a[leftIndex] = a[rightIndex];
                a[rightIndex] = temp;
                
            }
            
            leftIndex++;
            count++;
            
        }
        
        return a;
    }
	public static void main(String[] args) {
		int[] arr = {0,0,0,0,1,2,3,4,0,0,0,0,1,2,3,4,0,0,0,0,1,2,3,4,0,0,0,0,1,2,3,4,0,0,0,0,1,2,3,4,0,0,0,0,1,2,3,4,0,0,0,0,1,2,3,4,0,0,0,0,1,2,3,4,0,0,0,0,1,2,3,4,0,0,0,0,1,2,3,4};
		System.out.println("\nbefore:");
		for(int a:arr){
		    System.out.print(a+",");
		}
		Main obj = new Main();
		arr = obj.moveZeroes(arr);
		System.out.println("before:");
		for(int a:arr){
		    System.out.print(a+",");
		}
	}
}
