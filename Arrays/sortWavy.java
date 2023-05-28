/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public void swap(int []a, int first, int last){
        int temp;
        temp = a[first];
        a[first]= a[last];
        a[last] = temp;
    }
    public void sortWavy(int []a){
        for(int i=0;i<a.length-1;i++){
            if(i%2==0){
                if(a[i]<a[i+1]){
                    swap(a,i,i+1);
            }
            }
            else{
                if(a[i]>a[i+1]){
                    swap(a,i,i+1);
                }
            }
        }
    }
	public static void main(String[] args) {
		int a[] = {10, 5, 6, 3, 2, 20, 100, 80};
		// expected: 10, 5, 6, 2, 20, 3, 100, 80
		Main obj = new Main();
		
		System.out.println("before:");
		for(int x: a){
		    System.out.print(x+",");
		}
		obj.sortWavy(a);
		System.out.println("after:");
		for(int x: a){
		    System.out.print(x+",");
		}
		
	}
}