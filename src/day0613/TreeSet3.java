package day0613;

import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		int [] score = {80, 95, 60, 26, 49, 35, 100};

		for (int i=0; i<score.length; i++) {
			set.add(score[i]);
		}
		
		System.out.println(set);
		
		System.out.println();
		
		// 작은 값을 가져올 때 -> headSet()
		// 큰 값을 가져올 때 -> tailSet() (tailSet은 같거나 큰 값을 표시함)
		System.out.println("60보다 작은 값 : " + set.headSet(60));
		System.out.println("60보다 큰 값 : " + set.tailSet(60)); // 60 포함
		
		System.out.println();
		
		System.out.println("60보다 큰 값 : " + set.ceiling(60));
		System.out.println("60보다 작은 값 : " + set.floor(60));
		
		System.out.println();
		
		System.out.println("60보다 작은 값 : " + set.lower(60));
		System.out.println("60보다 큰 값 : " + set.higher(60));
	}

}
