package day0613;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		// 범위를 찾을 때
		// 변수를 만들어 주어야 함
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZ");
		set.add("dzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range search : from " + from + " to " + to);
		
		// subSet() : treeset에서 전체 중 일부분 만 표시해주는 코드
		
		System.out.println("result1 : " + set.subSet(from, to));
		// b ~ d 사이의 단어를 찾음 -> d 미만까지 표시 ( d는 표시하지 않음 )
		System.out.println("result1 : " + set.subSet(from, to + "zzz"));
		// from(b) 부터 to+"zzz" (d+zzz => dzzz) 이전까지 (미만까지) 출력
	}

}
