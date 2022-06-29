package day0613;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSet3 {

	public static void main(String[] args) {
		
		Set set = new HashSet();

		set.add("abc");
		set.add("abc");
		
		// Person이라는 클래스를 만들어 객체를 만들어서 사용
		set.add(new Person("abc", 10));
		set.add(new Person("abc", 10));
		
		
		System.out.println(set);
		// set은 중복허용이 안되기 때문에 값이 1번만 찍힘
		// 객체는 각각 다른 주소에 저장이 되기 때문에 두개의 객체가 같지 않음
		// 그래서 값이 2개가 각각 찍힘
		
		// 2개의 객체가 각각 다른 주소값이 저장되어도 오버라이딩을 사용하게 되면 
		// 같은 값이 1번만 출력됨.
		
		// HashSet은 equals() 와 hashCode()가 오버라이딩 되어 있어야 한다.
	}

}


class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() { // 오버라이딩
		return name + " : " + age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) return false;
		// obj가 Person으로 형변환이 안된다면 false값을 되돌려준다.
			
		Person p = (Person) obj;
		
		return this.name.equals(p.name) && this.age == p.age;
		// name은 String이기 때문에 비교하기 위해 equals() 사요으
		// age는 int이기 때문에 그냥 연산자 사용
		
	}
	
}