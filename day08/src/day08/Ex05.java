package day08;

public class Ex05 {

	public static void main(String[] args) {
		// �迭-�迭������ ��������
		int[] arr1=null;				// [�迭]������ ����
		System.out.println(arr1);
		Ex05 me=new Ex05();
		System.out.println(me);
		arr1=new int[3];		// [�迭]������ �ʱ�ȭ
		arr1[0]=2;
		arr1[1]=4;
		arr1[2]=6;
		int[] arr2;
		arr2=new int[]{2,4,6};
		int[] arr3;
		arr3=new int[3];
		
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]+",");
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]+",");
		}
		System.out.println();
		for(int i=0; i<arr3.length; i++){
			System.out.println(arr3[i]+",");
		}
		
		
		
	}

}
