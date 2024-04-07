package pojo_classes;

import org.springframework.stereotype.Component;

@Component
public class Player {
	private String name;
	private int age;
	private boolean isCaptain;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isCaptain() {
		return isCaptain;
	}
	public void setCaptain(boolean isCaptain) {
		this.isCaptain = isCaptain;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", isCaptain=" + isCaptain + "]";
	}
	

}
