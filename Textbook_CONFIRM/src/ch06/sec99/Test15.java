package ch06.sec99;

class MemberService{
	String id = "hong";
	String password = "12345";
	
	public boolean login(String id, String password) {
		if(id==this.id && password == this.password) {
			return true;
		}
		return false;

	}
	public void logout(String password) {
		System.out.println(id + "님이 로그아 되었습니다.");
	}
}
public class Test15 {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result =memberService.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
