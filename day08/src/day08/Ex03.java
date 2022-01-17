package com.hi;

class Ex03{
	int a=1111;
}
	
	
class Ex333{
		int b=2222;
		
		public Ex333(){
			System.out.println("생성자 호출"){
				
			}
		}
		
class Ex3333{
	int c=3333;
	public Ex3333(int su){
		c=su;
		System.out.println();
	}
}

public class Ex03{
	
		public static void main(String[] args){
			
			
			//클래스의 구성요소
			// 1.메서드
			// 2.전역변수
			// 3.생성자
			// public 클래스명([매개변수]){수행할 코드;return;}
			// 없으면 default생성자()를 자동으로 만듦
			Ex33 ex33;				//변수의 선언
			ex33=null;		//초기화
			ex33=new Ex33();
			
			
			
			Ex333 ex333=new Ex333();
//			Ex3333 ex3333=new Ex3333();
			Ex3333 ex3333=new Ex3333(1234);
			
		}
}


	}

}
