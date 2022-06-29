package day0613;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		
		Object [] objArr = {"1", new Integer(1), "2", "2", "3", "4","4","4"};
		// 여러개의 타입을 한번에 사용하기 위해 Object타입의 배열로 선언
		
		Set set = new HashSet();
		
		for (int i=0; i<objArr.length; i++) {
			 // set.add(objArr[i]); -> objArr의 i번째의 값을 setSet의 참조변수에 추가(add)한다는 의미
			System.out.println(objArr[i] + " = " + set.add(objArr[i]));
			// 중복(동일한) 값이 있으면 값이 false로 나옴
		}
		
		System.out.println();
		
		System.out.println(set);
		// set의 내용을 출력
		// 중복된 값은 표시되지 않음. -> Set의 특징
		// 1,1,2,3,4가 출력되는데 1은 각각 타입이 다른 1
			
		System.out.println();
		
		// Iterator를 이용하여 출력
		Iterator it = set.iterator();
		
		// Iterator는 컬렉션에 저장된 요소들을 읽어오는 방법.
		// 참조변수 set은 Set타입이 Collection에 저장되어 있는 요소이기 때문에
		// iterator()를 호출하여 Iterator를 구현한 객체를 얻어서 사용할 수 있다.
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
