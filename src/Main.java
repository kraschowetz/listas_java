import java.util.Scanner;

/* 
 *
 * como eu sou um infeliz que usa vim,
 * tem essa mandinga do scanner pro meu terminal não
 * fechar quando o código acabar.
 *
 * Só uma gambiarrinha de leve, sorria e acene.
 *
 */

class Main {

	static void testeStack() {
		Stack<Integer> s = new Stack<Integer>(10);
		s.push(12);
		s.push(13);
		s.push(14);

		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

		Scanner scan = new Scanner(System.in);

		scan.nextLine();

		scan.close();
	}

	static void testeQueue() {
		Queue<Integer> q = new Queue<Integer>(8);

		q.enqueue(0);
		q.enqueue(1);
		q.enqueue(3);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

		Scanner scan = new Scanner(System.in);

		scan.nextLine();

		scan.close();
	}

	public static void main(String args[]) {
		System.out.println("oi");
		
		testeQueue();
	}
}
