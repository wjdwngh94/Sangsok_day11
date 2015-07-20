class Test{// extends Object 라는 구문이 생략되어 있다.
	
}

class Test2 extends Test{ // object <- Test(자식) <- Test2(손자)
	
}
//상속 - 기존의 소스에 추가되는 부분만 넣어서 재사용

public class Sangsok_02 {

	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1.getClass()); // class name 가져옴
		System.out.println(t1.hashCode()); // hashCode(10진수) - 객체에 들어있는 전자서명이다.
		System.out.println(t1.toString()); // 객체 정보   :  클래스 이름 + 구별 기호(@) + hashCode
		System.out.println(t1); // 객체 정보  클래스 이름 + 구별 기호(@) + hashCode
		
		Test t2 = new Test();
		// t1과 t2는 같은가? 
		// 값은 같지만
		// 서로 다른 객체이므로 hashCode 가 다르다.
		

		Test t3 = t1;
		// t1과 t3는 같은가?
		// new가 나왔을때만 객체가 새로 생기는 것이므로
		// t3/t1으로 하나의 객체가 이름을 두개 가지는 것 과 같다.
		// 즉 이 프로그램에서 객체는 2개다.
		
		System.out.println(t1 == t3); // 주소를 비교 하는 것
		System.out.println(t1.equals(t3)); // 정의된 형식으로 비교하는 것
		
		String name1  = "빌게이츠";
		System.out.println(name1 == "빌게이츠"); // 주소 판별
		System.out.println(name1.equals("빌게이츠")); // 값이 같은지를 판별
		
		System.out.println("=====================");
		
		String name2  = new String( "빌게이츠");
		System.out.println(name2 == "빌게이츠"); // 주소 판별
		System.out.println(name2.equals("빌게이츠")); // 값이 같은지를 판별
		
	}
}
