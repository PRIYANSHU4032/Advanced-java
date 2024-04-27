package deloitte;

public class Transposemat {
	public static void transposeIt(int arr[][]) {
		int m = arr.length;
		int n = arr[0].length;
		int temp[][] = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				temp[j][i] = arr[i][j];
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String args[]) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		transposeIt(arr);
	
	

}
}