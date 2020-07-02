package jp.co.bbreak.sokusen.test3.dbunit;

public class User {
	private String userid;

	private String name;

	private int age;

	public String getUserid() {
		return this.userid;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
}