/*
 * Modifier _ 01번 문제를 가져와서 다음의 내용을 구현하세요
 * 
 * 기존에 Phone이라는 클래스를 사용하고 있었습니다.
 * 그런데 3개의 항목이 부족하여
 * 
 * 추가할 항목 : 제휴카드
 * 
 * 제휴카드는 수시로 설정, 확인이 가능하도록
 * 
 * 생성할 클래스 명 : NewPhone
 */

class NewPhone extends Phone{
	private String card;

	public NewPhone(String name, String co, int price, String card){
	
		super(name, co, price); 
		setCard(card);
		
	}
	
	public void getInfo(){
//재정의 - 반드시 원본과 동일하게 생성
		
		super.getInfo(); 
		
		System.out.println("제휴카드 : " + card);
		System.out.println("\n");
	}
	
	public void getCardInfo(){
		System.out.println("제휴카드 : " + card);
	}
	
	public void setCard(String card){
		this.card = card;
	}
}

class Phone{
	private String name, co;
	private int price;
	
	
	public Phone(String name, String co, int price){
		
		this.name=name;
		this.co=co;
		this.price=price;
	}
	
	public void setCo(String co){
		this.co = co;
	}
	
	public void setPrice(int price){
		
		if(price>100000){
			System.out.println("가격 설정이 완료되었습니다.");
			this.price = price;
		}
		
		else{
			System.out.println("가격 설정 오류 입니다.");
			return;
		}
		
	}
	
	public void getInfo(){
		System.out.println("이름 : " + this.name);
		System.out.println("통신사 : " + this.co);
		System.out.println("가격 : " + this.price);
	}
}


public class Sangsok_04  {
	public static void main(String[] args) {
		
		
		NewPhone[] phones = new 	NewPhone[3];

		phones[0] = new 	NewPhone("갤럭시5","skt",30000,"bc");
		phones[1] = new 	NewPhone("G3","lgt",100000,"lotte");
		phones[2] = new 	NewPhone("아이폰6","kt",250000,"visa");
		
		for (int i = 0; i < phones.length; i++) {
			phones[i].getInfo();
		}

	}
}
