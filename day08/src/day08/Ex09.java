package day08;

public class Ex09 {

	public static void main(String[] args) {
		// ��������
		int[] arr1={1,3,5,7};
		int[] arr2;
		arr2=new int[arr1.length];
	
//		for(int i=0; i<arr2.length; i++){
//			arr2[i]=arr1[i];
//		}
		// �迭�� �������� ��� ����
//		System.arraycopy(������������,��������index,��󺯼�,������,�)
		System.arraycopy(arr1, 0, arr2,  0, arr2.length);
		
//		arr1[1]=10;
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]+",");
		}
	}

}
