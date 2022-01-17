package day08;

public class Ex04 {
	public int su;
	public int su3=4321;
	public static final int su5=5555;
	public static final int su6;
	
	
	public Ex04(int su2){
		su=su2; // 값을 바꾸는게 x, 필드값의 초기화
	}
	
	public static void main(String[] args) {
		final int su4; // 상수형 변수.	 // final : 값을 바꾸지 못하는 변수를 가지는 키워드
		su4=4444;
//		su5=5555; // 한번 들어오면 값을 바꿀 수 없기 때문에 에러
		System.out.pritnln(su4);
		
		Ex04 me=new Ex04(1234);
		System.out.println(me.su);
		System.out.println(me.su3);
		me.su3=54321;
	}

}
