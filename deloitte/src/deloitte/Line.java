package deloitte;

public class Line {
	public static void linearSearch(int a[],int k) {
		for(int i = 0;i<a.length;i++) {
			if(a[i]==k) {
				System.out.println("found at "+i);
			}
			
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {10,5,50,7,89};
		int key = 50;
		linearSearch(arr,key);
	}

}
