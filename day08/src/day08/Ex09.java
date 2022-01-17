package day08;

public class Ex09 {

	public static void main(String[] args) {
		// 깊은복사
		int[] arr1={1,3,5,7};
		int[] arr2;
		arr2=new int[arr1.length];
	
//		for(int i=0; i<arr2.length; i++){
//			arr2[i]=arr1[i];
//		}
		// 배열의 깊은복사 기능 제공
//		System.arraycopy(원본참조변수,원본시작index,대상변수,대상시작,몇개)
		System.arraycopy(arr1, 0, arr2,  0, arr2.length);
		
//		arr1[1]=10;
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]+",");
		}
	}

}
