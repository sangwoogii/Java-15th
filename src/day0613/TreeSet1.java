package day0613;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		// TreeSet -> 범위를 검색하거나 정렬에 유리
		Set set = new TreeSet(new TestComp());
		
		// 기존 출력할 때 사용하는 코드
//		for (int i=0; set.size() < 6; i++) {
//			int num = (int)(Math.random() * 45) + 1;
//			set.add(num);
//		}
		
		set.add(new Test());
		set.add(new Test());
		set.add(new Test());
		set.add(new Test());
		set.add(new Test());
		

		System.out.println(set);
		
		// TreeSet은 알아서 자동 정렬해서 값을 출력함
		// HashSet은 정렬을 하지않고 무작위로 출력한 값을 보여줌

	}

}

class Test{};

// 객체를 만들어서 사용한다 = 클래스를 만들어서 사용한다는 말과 같음
class TestComp implements Comparator {

	// 값을 비교하기 위해 compare를 오버라이딩
	@Override
	public int compare(Object o1, Object o2) {
		
		return 1;
	}
	
}