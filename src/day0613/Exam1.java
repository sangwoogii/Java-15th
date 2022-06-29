package day0613;

import java.util.ArrayList;
import java.util.List;

public class Exam1 {

	public static void main(String[] args) {
		
		// 정수집합 1, 2, 3, 4와 3, 4, 5, 6을 만들어
		// 교집합, 차집합, 합집합을 구하시오.
		// 정수 집합과 결과값 모두 ArrayList 이용
		// 교집합 : 두 개의 집합에서 중복되는 값만 출력
		// 차집합 : 두 집합의 차이 (1번 집합에만 있는 자료를 출력)
		// 합집합 : 두 집합의 모든 내용을 출력 (중복될 땐 한번만)
		// 힌트 - ArrayList 클래스의 메서드 사용

		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List kyo = new ArrayList();
		List cha = new ArrayList();
		List hap = new ArrayList();
		
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		kyo.addAll(list1); // 1,2,3,4
		kyo.retainAll(list2); // 공통 요소만 남기고 삭제
		
		System.out.println("교집합 : " + kyo);
		
		cha.addAll(list1); // 1,2,3,4
		cha.removeAll(list2); // list1과 list2의 공통된 요소들
		
		System.out.println("차집합 : " + cha);
		
		hap.addAll(list1); // 1,2,3,4
		hap.removeAll(list2); // removeAll을 하게 되면 1,2만 남음
		hap.addAll(list2); // -> 1과 2가 남았을 때 다시 list2(3,4,5,6)를 모두 더해주면 된다. 
		
		
		System.out.println("합집합 : " + hap);
	}

}
