package day08;

public class Ex04 {
	public int su;
	public int su3=4321;
	public static final int su5=5555;
	public static final int su6;
	
	
	public Ex04(int su2){
		su=su2; // ���� �ٲٴ°� x, �ʵ尪�� �ʱ�ȭ
	}
	
	public static void main(String[] args) {
		final int su4; // ����� ����.	 // final : ���� �ٲ��� ���ϴ� ������ ������ Ű����
		su4=4444;
//		su5=5555; // �ѹ� ������ ���� �ٲ� �� ���� ������ ����
		System.out.pritnln(su4);
		
		Ex04 me=new Ex04(1234);
		System.out.println(me.su);
		System.out.println(me.su3);
		me.su3=54321;
	}

}
