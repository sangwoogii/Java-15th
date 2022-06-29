package day0613;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
	//  LinkedList list = new LinkedList(); 로 사용해도 가능	

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		// 입력되어 있는 값을 가져 올때는 get 사용
		// 기존에 ArrayList를 출력하는 방법
//		for (int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		Iterator it1 = list.iterator();
		
		while (it1.hasNext()) {
			Object obj = it1.next();
			System.out.println(obj); // obj라는 변수에 담아서 사용
		}
		
		// Iterator는 컬렉션에 저장된 요소들을 읽어오는 방법.
		// 참조변수 set은 Set타입이 Collection에 저장되어 있는 요소이기 때문에
		// iterator()를 호출하여 Iterator를 구현한 객체를 얻어서 사용할 수 있다.
		
		// hasnext()를 한번 사용하고 나면
		// 끝까지 이동하였으므로 다시 호출해도 처음으로 이동하지 않음
		// 그러므로 Iterator()는 일회용. -> 한번 사용을 하고 나면 또 사용이 불가능
		
		System.out.println();
		
		// 한번 더 사용하고 싶으면 Iterator의 객체를 하나 더 생성하여 사용하면 됨
		Iterator it2 = list.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}
