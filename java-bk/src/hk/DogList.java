package hk;

import java.util.ArrayList;
import java.util.List;

class Dog{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAge(Integer age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
}
// dogList를 만들어서 반복문으로 1부터 10까지
// Dog를 총 10개 생성하여
// name => 강아지1~강아지10, age= 1~10
public class DogList {

	public static void main(String[] argS) {
		List<Dog> dg = new ArrayList<>();
		for(int i=0; i<10; i++) {
			Dog d = new Dog();
			d.setName("강아지"+(i+1));
			d.setAge(i+1);
			dg.add(d);
			
		}
		for(int i=0; i<10; i++) {
			System.out.println(dg.get(i).getName());
			System.out.println(dg.get(i).getAge());
		}
		
	}
}


