public class Main
{
    public void swap(int []a, int left, int right){
        int temp = 0;
        temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
    public void solve(int []a){
        int i = 0;
        int j = 0;
        while(j+1<a.length){
            System.out.println("\nin while");
            while(i<a.length && a[i]%2==0){
                i++;
            }
            System.out.println("i:"+i);
            while(j<i || (j<a.length && a[j]%2!=0)){
                j++;
            }
            System.out.println("j:"+j);
            swap(a,i,j);
            System.out.println("change:");
            for(int k : a){
		    System.out.print(k+" ");
		    }   
        }
        System.out.println("solve complete");
    }
	public static void main(String[] args) {
		int a[] = {1, 3, 2, 4, 7, 6, 9, 10};
		Main x = new Main();
		x.solve(a);
		System.out.println("after");
		for(int i : a){
		    System.out.print(i+" ");
		}
	}
}
