package yongmin.want.java.study;

public class Interviewyo extends Yongmin {
	public void Intervoewyo() {
	if(getExp()>=1500 && getExp()<2000){
		System.out.println("내"+ getExp()+"로는 취업확률이 50%야");
		return;
	}else if(getExp()>=2000 && getExp()<3000) {
		System.out.println("내"+ getExp()+"로는 취업확률이 70%야");
	}else if(getExp()>=3000){
		System.out.println("이건 그냥 합격이야");

		}
	}
}

//}else{
//	System.out.println("면접에 신청 할 수 없습니다. 공부를 더하세요");
//	return;