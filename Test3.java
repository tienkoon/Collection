// import Stack.Stack;
class T3 {
	public static void main(String args[]){
		Queue q1 = new Queue();
		Queue q2 = new Queue();
		Stack s1 = new Stack();
		Stack s2 = new Stack();
				
		s1.push(1);
		s1.push(2);
		s2.push(2);
		s2.push(3);
				
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		q2.enqueue(2);
		q2.enqueue(3);
		
		System.out.println(q1.equals(s1));
		System.out.println(q1.equals(q2));
		System.out.println(s2.equals(s1));
		System.out.println(q2.equals(q2));
		
		s1.pop();
		s1.pop();
		s2.pop();
		s1.push(2);
		q1.dequeue();
		
		System.out.println(q1.equals(s1));
		System.out.println(q1.equals(q2));
		System.out.println(s2.equals(s1));
		System.out.println(q2.equals(q2));
	}
}
