class Person{
	//상속 = 기존 클래스의 재사용
	private String name;
	private int age;
	
	public Person(String name, int age){ // 한번설정하면 바뀌지 못하게
		this.name = name;
		this.age = age;
		
	}
	public void info(){
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}


//Person 의 형태에 gender를 추가하여 확장

class NewPerson extends Person{
	// 추가된 내용만 적는다
	// 기존의 내용은 이미 갖고 있으므로
	
	private String gender;
	
	public NewPerson(String name, int age, String gender){
		//부모의 생성자를 불러서 name, age를 전달
		
		super(name, age); // this와 비슷
		this.gender = gender;
		
	}
	
	//부모의 info와 똑같은 메소드 구현
	public void info(){

		//System.out.println("이름 : " + name); // private임으로 접근 불가하다.
		//System.out.println("나이 : " + age);
		super.info(); // 자기자신의 것은 this.info(); 이지만 부모의 info는 super.info();
		
		System.out.println("성별 : " + gender);
		
	}
}

public class Sangsok_03 {
	public static void main(String[] args) {
		NewPerson per = new NewPerson("홍길동", 20, "남자");
		per.info();
	}
}

