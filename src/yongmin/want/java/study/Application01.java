package yongmin.want.java.study;

import java.util.Scanner;

public class Application01 {

	public static void main(String[] args) {
		
		System.out.println("자바 학원을 다니게 된 용민이는 공부를 방해하는 유혹들을 뿌리치고 공부를 할 수 있을까");
	
		Scanner sc = new Scanner(System.in);
		Yongmin dt = new Yongmin();
		
		while(true) {
			System.out.println("================= 용민이의 자바 스터디=================");
			System.out.println("1.현재 정보 확인하기");
			System.out.println("2.공부하기");
			System.out.println("3.놀기");
			System.out.println("7.면접보기(1500점을 달성해야 면접에 합격 할 수 있습니다.)");
			System.out.println("9. 포기...");
			
			
			int  no = sc.nextInt();
			
			switch(no) {
			case 1 :
				dt.checkyoungmin();
				break;
			case 2 :
				dt.studyyongmin();
				break;
			case 3 : 
				dt.playyongmin();
				break;
			case 7 :
				dt.Interview();
				break;
			case 9 :
				System.out.println(" 용민이가 포기했습니다...");
				System.out.println("======================================");
				System.out.println("Game over...");
				return;
				
			default :
				System.out.println("다른 번호를 다시 입력해 주세요");
				break;
			}
		}
		
			
		
	
	
	
	
	
	}

}