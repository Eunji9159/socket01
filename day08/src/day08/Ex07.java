package day08;

public class Ex07 {

	public static void func01(int[] arr2){
		arr2[1]=10;
	}
	
	public static void main(String[] args) {
		// ¾èÀº º¹»ç
		int[] arr1={2,4,6,8};
		
		
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}

}
