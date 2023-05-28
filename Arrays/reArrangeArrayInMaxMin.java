/*
0, 1, 2, 3, 4, 5, 6, 7,     8
i                           j, min


8, 1, 2, 3, 4, 5, 6, 7,     0
   i                       j,min
   
8, 0, 2, 3, 4, 5, 6, 7,     1
      i              j      min

8, 0, 7, 3, 4, 5, 6, 2,     1
      i              j      min

8, 0, 7, 1, 4, 5, 6, 2,     3
         i           j      min

8, 0, 7, 1, 4, 5, 6, 2,     3
            i   j          min

*/






public class Main
{
    public void swap(int []a, int left, int right){
        int temp = 0;
        temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
    public void solve(int []a){
        int  min = a.length -1;
        int i = 0;
        int j = a.length -1;
        
        while(i<=j){
            //setMax
            if(i%2==0){
                swap(a,i,j);
                j--;
            }
            else{
                swap(a,i,min);
            }
            i++;
        }
        
        System.out.println("solved complete");
    }
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		Main x = new Main();
		x.solve(a);
		System.out.println("after");
		for(int i : a){
		    System.out.print(i+" ");
		}
	}
}
