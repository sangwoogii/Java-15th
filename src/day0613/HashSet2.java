package day0613;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSet2 {

	public static void main(String[] args) {
		
		// Set을 이용한 로또 번호 추출
		// HashSet은 순서 유지 x, 중복 x
		Set set = new HashSet();
		
		// 6개의 랜덤수를 뽑음.
		// set은 중복값이 저장되지 않으므로 num에 중복값이 나온다 하더라도 set에는 저장되지 않음.
		// => 중복값이 표시되어 출력되지 않음 : Set 자체가 중복을 저장하지 않는 특징
		for (int i=0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(num);
		}
		
		System.out.println(set);
		// Set 자체가 중복된 값을 저장하지 않기 때문에 중복된 숫자는 나타나지 않지만,
		// 정렬이 되어 있지 않음.
		
		
		// set 자체에 순서가 없기 때문에 sort를 사용할 수 없음
		// sort를 사용하려면 즉. 정렬을 하려고 하면 순서가 있어야기 때문에 set은 사용할 수 없다.
		// Collections.sort(set); -> 사용 x
		
		System.out.println();
		
		// 그럼에도 정렬을 하고 싶다면 set을 list로 옮겨서 정렬하고 저장해야함.
		// LinkedList(Collection c) 생성자 이용
		// -> LinkedList에는 기본생성자와 Collection을 받는 생성자를 이용할 수 있음)
		List list = new LinkedList(set);
		
		Collections.sort(list);
		System.out.println(list);

	}

}
