public class Main
{
    public void swap(int []a, int left, int right){
        int temp = 0;
        temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
    public void reArrangeOddEven(int []a){
        for(int i=1;i<a.length;i++){
            if((i+1)%2==0){
                if(a[i]<a[i-1]){
                    swap(a,i-1,i);
                }
            }
            else{
                if(a[i]>a[i-1]){
                    swap(a,i-1,i);
                }
            }
        }
        System.out.println("task complete");
    }
	public static void main(String[] args) {
		int a[] = {1, 3, 2, 2, 5};
		Main x = new Main();
		x.reArrangeOddEven(a);
		System.out.println("after");
		for(int i : a){
		    System.out.print(i+" ");
		}
	}
}
