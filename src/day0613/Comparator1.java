package day0613;

import java.util.Arrays;
import java.util.Comparator;

// 내림차순을 정렬하는 클래스 생성
class Descending implements Comparator {

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		return 0; -> 오버라이딩
//	}
	
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			// Object 형의 참조변수 o1, o2가 Comparable 형태로 사용할 수 있는지
			// 확인하기 위해 instanceof를 사용
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			// Comparable은 Object의 자식이기 때문에 Object의 o1, o2를 Comparable로 형변환
			
			return c1.compareTo(c2) * -1;
		}
		
		return -1;
	}
	
}

public class Comparator1 {

	public static void main(String[] args) {
		
		String[] strArr = {"cat", "Dog", "lion", "tiger"};

		Arrays.sort(strArr); // 배열의 정렬 -> Arrays.sort()
		System.out.println("strArr : " + Arrays.toString(strArr));
		// syso안에 그냥 strArr를 쓰면 주소값이 출력되기 때문에 Arrays.toString을 사용
		// String의 배열은 출력하기 위해선 Array.toString(출력할 변수명);으로 작성해야함
		
		System.out.println();
		
		// CASE_INSENSITIVE_ORDER -> 대소문자 구분없이 정렬 기준의 종류 중 하나
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr : " + Arrays.toString(strArr));
		// 출력하게 되면 대소문자 구분 없이 c, d, l, t 즉, abcd..의 순서대로 정렬됨
		
		System.out.println();
		
		// 내림차순 정렬
		Arrays.sort(strArr, new Descending());
		System.out.println("strArr : " + Arrays.toString(strArr));
	}

}
