
class Junja{ // 전자제품 클래스
	
	private int a = 10;
	protected int b= 20; // 자식에겐 public 과 동일
	// 그 외의 class에게는 package
	
	public void on(){
		
		System.out.println("전원이 켜졌습니다.");
	}
	
	public void off(){

		System.out.println("전원이 꺼졌습니다.");
	}
}

//extends - Junja클래스를 부모 클래스로 선택하겠다.
class Com extends Junja{ // 컴퓨터 클래스
	//단 부모의 private에는 접근이 불가하다.
	
	public void print(){
		//System.out.println("a = " + a );
		//private 이기때문에 error발생
		//(private는 같은 class내부만 접근가능)
		System.out.println("b = " + b ); //protected 이므로 접근거능
	}
}
class Camera extends Junja{
	public void photo(){
		System.out.println("사진을 찍습니다. ! ");
	}
}

public class Sangsok_01 {
	public static void main(String[] args) {
		//컴퓨터 1대 생성
		Com com = new Com();
		com.on(); // 부모에게 있는 요소
		com.off(); // 부모에게 있는 요소
		com.print(); // 나에게 있는 요소
		
		//카메라 1대 생성
		Camera cam = new Camera();
		cam.on();
		cam.off();
		cam.photo();
	}
}
