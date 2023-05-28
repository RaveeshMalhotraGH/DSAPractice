public class Main
{
    public void reverseArray(int []a, int startIndex, int endIndex){
        int temp;
        for(int i=0;i<=(int)(endIndex-startIndex)/2;i++){
            temp = a[startIndex+i];
            a[startIndex+i] = a[endIndex-i];
            a[endIndex-i] = temp;
        }
    }
    public void rotateByD(int [] a, int d){
        //reverse complete array
        reverseArray(a,0,a.length-1);
        reverseArray(a,0,a.length-1-d);
        reverseArray(a,a.length-d, a.length-1);
    }
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		Main obj = new Main();
		System.out.println("before:");
	    for(int x: arr)
		System.out.print(x+",");
		obj.rotateByD(arr,2);
		System.out.println("after:");
	    for(int x: arr)
		System.out.print(x+",");
	}
}
