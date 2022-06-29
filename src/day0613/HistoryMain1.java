package day0613;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HistoryMain1 {

	// 객체생성 없이 사용할 것이기 때문에 static
	// 그리고 메인뿐만 아니라 다른 메서드에서도 사용하기 위해 main 밖에서 사용
	// 부모타입의 참조변수로 자식의 객체를 다루기 : 업캐스팅. -> 형변환 생략 가능
	static Queue q = new LinkedList();
	
	// queue에는 최대 5개까지 저장할 수 있는 상수 선언
	static final int MAX_SIZE = 5; 
	
	
	public static void main(String[] args) {
		
		System.out.println("help를 입력하면 도움말이 출력됩니다.");
		
		while (true) { //명령어가 종료되기 전까지 반복되야하기 때문에 true 사용
			System.out.print("명령어 > ");
			
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine();
		
				// 명령어가 공백이면 while문 재반복
				// input 즉, 내가 입력한 값이 공백이면 continue (반복)해라
				// String 형을 비교할 땐 equals() 사용
				if (input.equals("")) continue;
					
				// 대소문자를 구별하지 않고 "q"를 입력받으면 종료함
				// -> equalsIgnoreCase() -> 대소문자 구분 x
				if (input.equalsIgnoreCase("q")) {  
					// input 즉 내가 입력한 값이 q(Q)와 같으면 이라는 의미 -> equals()
					System.out.println("종료 되었습니다.");
					System.exit(0);
					
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("  help : 도움말 확인");
					System.out.println("  q 또는 Q : 프로그램 종료");
					System.out.println("  history : 최근에 입력한 명령어" + MAX_SIZE + "개 확인");
					
				} else if (input.equalsIgnoreCase("history")) {
					
					save(input);
					
					// 자식 타입의 참조변수로 부모 객체 다루기 : 다운캐스팅. -> 형변환 생략 불가능
					LinkedList list = (LinkedList)q;
					
					for (int i=0; i<list.size(); i++) {
						System.out.println((i+1) + ". " + list.get(i));
					}
					
				} else {
					save(input);
					System.out.println(input);
				}
				
			} catch (Exception e) {
				System.out.println("입력 오류 입니다.");
			}
			
		}
		
		
	}
	
	// history를 사용할 메서드
	public static void save(String input) {
		
		if (input != null && !input.equals("")) {
			// input이 null이 아니고 input이 공백이 아니면
			q.offer(input);
		}
		
		if (q.size() > MAX_SIZE) {
			q.remove();
		}
	}
	
	
	

}
