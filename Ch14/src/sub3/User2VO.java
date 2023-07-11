package sub3;
/*
 * 날짜 :2023/07/11
 * 이름 :정채윤
 * 내용 :PreparedStatement 실습하
 */

// VO객체 : 테이블 개체(Entity)가 변환되는 객체 
class User2VO { ///Value Object
	private String uid;
	private String name;
	private String hp;
	private int age;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
