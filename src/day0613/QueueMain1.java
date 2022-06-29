package day0613;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Message {
	public String command;
	public String to;
	
	public Message (String command, String to) {
		this.command = command;
		this.to = to;
	}
}

public class QueueMain1 {

	public static void main(String[] args) {
		
		// Queue는 interface이기 때문에 구현할 수 있는 LinkedList()로 객체를 사용하면 된다.
		// <Message> 타입으로 입력을 받기 위해 제네릭 사용
		// 제네릭을 사용하는 정확한 이유가 뭐지 ?
		// 제네릭을 사용하기 위해서는 클래스가 있어야 한다.
		Queue<Message> msgQueue = new LinkedList<Message>();
	
//		// new를 사용한 객체를 하나 생성하고 객체명을 넣어도 상관없음
//		// Message 클래스에 String 타입의 매개변수가 2개 있기 때문에 바로 값을 저장함
		msgQueue.offer(new Message("sendMail", "김그린"));
		msgQueue.offer(new Message("sendSMS", "이자바"));
		msgQueue.offer(new Message("sendkakaotalk", "김하하"));
		
		while (!msgQueue.isEmpty()) { // msg를 출력
			// 'msgQueue가 공백이 아니라면' 이라는 의미
			// 정해진 순서나 조건이 없기 때문에 while문 사용
			Message msg = msgQueue.poll();
			 // Stack을 사용했을 땐 Queue의 출력 순서와 반대
			
			switch(msg.command) {
			case "sendMail" :
				System.out.println(msg.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(msg.to + "님에게 문자를 보냅니다.");
				break;
			case "sendkakaotalk" :
				System.out.println(msg.to + "님에게 카톡을 보냅니다.");
				break;
			}
			
		}
		
		// Stack으로 사용할 때
//		Stack<Message> msgQueue = new Stack<Message>();
//
//		msgQueue.push(new Message("sendMail", "김그린"));
//		msgQueue.push(new Message("sendSMS", "이자바"));
//		msgQueue.push(new Message("sendkakaotalk", "김하하"));
//		
//		while (!msgQueue.isEmpty()) { // msg를 출력
//			
//			 Message msg = msgQueue.pop();
//			 // Stack을 사용했을 땐 Queue의 출력 순서와 반대
//			
//			switch(msg.command) {
//			case "sendMail" :
//				System.out.println(msg.to + "님에게 메일을 보냅니다.");
//				break;
//			case "sendSMS" :
//				System.out.println(msg.to + "님에게 문자를 보냅니다.");
//				break;
//			case "sendkakaotalk" :
//				System.out.println(msg.to + "님에게 카톡을 보냅니다.");
//				break;
//			}
//			
//		}
				
	}

}
