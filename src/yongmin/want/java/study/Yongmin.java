package yongmin.want.java.study;

import java.util.Scanner;

public class Yongmin extends DTO {
	public Yongmin() {
		setName("김용민");
		setExp(0);
		setAge(10);
	}
	public void checkyoungmin() {



		System.out.println("내이름은"+ getName());
		System.out.println("내 경험치는!  "+ getExp() +"  야!");
		System.out.println("내나이는 파릇파릇한 " + getAge() + "살!");

	}

	public void studyyongmin() {
		System.out.println("오늘의 공부 방식은??");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("용민이가 공부를 시작한다!");
			System.out.println("1. 용민이가 코딩자습하기");
			System.out.println("2. 용민이가 인터넷강의를 본다!");
			System.out.println("3. 용민이가 선생님의 줌영상을 다시본다!");
			System.out.println("4. 메뉴로 돌아가기");
		
		
		int no = sc.nextInt();
		
		switch(no) {
		case 1:
		setExp(getExp()+100); 
		break;
		case 2:
		setExp(getExp()+150);
		break;
		case 3:
		setExp(getExp()+300);
		break;	
		case 4:
		return;
		default :
			System.out.println("다른 번호를 다시 입력해 주세요");
		
		}
		}	
}
}