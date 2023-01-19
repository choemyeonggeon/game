package yongmin.want.java.study;

import java.util.Random;
import java.util.Scanner;


public class Yongmin extends DTO {
	
	public Yongmin() {
		setName("김용민");
		setExp(0);
		setAge(24);
		
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
				System.out.println("100점이 증가했습니다");
				break;
			case 2:
				setExp(getExp()+150);
				System.out.println("150점이 증가했습니다");
				break;
			case 3:
				setExp(getExp()+300);
				System.out.println("300점이 증가했습니다");
				break;	
			case 4:
				return;
			default :
				System.out.println("다른 번호를 다시 입력해 주세요");
			}
		}
	}	
	public void playyongmin() {

		System.out.println("오늘의 공부 방식은??");
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("용민이가 놀기 시작한다!");
			System.out.println("1. 용민이가 게임을 시작한다...");
			System.out.println("2. 용민이가 잠을 잔다...");
			System.out.println("3. 용민이가 여자친구를 만나러 간다...");
			System.out.println("4. 메뉴로 돌아가기");

			int oo = sc.nextInt();

			switch(oo) {
			case 1:
				setExp(getExp()-100); 
				System.out.println("100점이 떨어졌습니다");
				break;
			case 2:
				setExp(getExp()-150);
				System.out.println("150점이 떨어졌습니다");
				break;
			case 3:
				setExp(getExp()-300);
				System.out.println("300점이 떨어졌습니다");
				break;	
			case 4:
				return;
			default :
				System.out.println("다른 번호를 다시 입력해 주세요");
			}


		}
	
		}
	
	public void Interview() {
		if(getExp()>1500) {
			System.out.println("면접에 신청 할 수 있습니다.");
		} if(getExp()>=1500 && getExp()<2000){
			System.out.println("내"+ getExp()+"점수로는 취업확률이 50%야");
			int random1 = (int)(Math.random()*10)+1; 
			if(random1 >=5 ) {
				System.out.println("합격입니다.");
				System.out.println("용민이가 프로그래머 용민으로 정보가 바뀝니다.");
				setName(" 프로그래머 " + getName() );
				}else {
				System.out.println("불합격입니다. 용민이가 허무함을 느껴 경험치가 0이 됩니다.");
				setExp(0);
			}
		}else if(getExp()>=2000 && getExp()<3000) {
			System.out.println("내"+ getExp()+"점수로는 취업확률이 70%야");
			int random2 = (int)(Math.random()*10)+1;
			if(random2<=7) {
				System.out.println("합격입니다.");
				System.out.println("용민이가 프로그래머 용민으로 정보가 바뀝니다.");
				setName(" 프로그래머 " + getName() );
			}else {
				System.out.println("불합격입니다. 용민이가 허무함을 느껴 경험치가 0이 됩니다.");
				setExp(0);
			}
		}else if(getExp()>=3000){
			System.out.println("이건 그냥 합격이야");
			System.out.println("용민이가 프로그래머 용민으로 정보가 바뀝니다.");
			setName(" 프로그래머 " + getName() );
		}		
		
	}
		
			
		
				
			
	
						
		}
			
		
		
	
		

		
		
