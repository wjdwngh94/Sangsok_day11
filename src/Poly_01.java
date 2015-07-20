//다형성 : 상위 자료형으로 다양한 하위 자료형을 표현하는 성질

class Teacher{
	public void teach(){
		System.out.println("강사가 강의한다 !");
	}
}

class Hwang extends Teacher{ // Hwang 이 Teacher을 부모로 고름으로서 강사가 된 것이다.
	public void game(){
		System.out.println("황인빈이 게임한다!");
	}
	public void drink(){
		System.out.println("황인빈이 술을 마신다!");
	}
	public void teach(){ // main의 코드를 건드리지 않고
		//고치게 되면 하위 내용이 실행 된다.
		System.out.println("황인빈이 소리지르며 강의한다!");
	}
}

class Yu extends Teacher{
	public void musical(){
		System.out.println("희경샘이 뮤지컬을 감상한다!");
	}
	
	//teach 를 고친다 - Yu의 스타일에 맞게
	public void teach(){
		System.out.println("희경샘이 부드럽게 강의한다!");
	}
	
}

public class Poly_01 {
	public static void main(String[] args) {
		Hwang h = new Hwang();
		
		h.drink();
		h.game();
		h.teach(); // 부모로부터 가져다 쓰는 것
		
		//출근(Hwang -> Teacher로 변환 : 업캐스팅)
		Teacher t = h; 
		//t가 할 수 있는 행동은?
		//t.drink(); // X
		//t.game();// X
		t.teach(); 
		//즉, 황인빈이 Teacher이 되면 범위가 줄어 들기 때문에
		// Teacher은 teach이외에는 정의되어 있지 않기 때문에
	
		//퇴근(Teacher -> Hwang로 변환 : 다운 캐스팅 / 강제 형변환)
		
		System.out.println(t instanceof Hwang);
		//t가 Hwang의 객체인가?
		//instanceof 연산자 : 자신없으니까 어떤 클래스의 객체인지 알려달라고 요청
		Hwang h2 = (Hwang)t;
		h2.drink();
		h2.game();
		h2.teach(); 
		
		
		//Yu yu = new Yu();
		//t = yu;
		//아래와 동일
		t= new Yu();// Teacher <- Yu : 업캐스팅(자동 형 변환)
		//t가 할 수 있는 행동은? 1개 teach
		//t.musical(); X
		t.teach();
	}
}
