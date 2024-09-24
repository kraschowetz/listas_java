public class Queue<T> {
	T[] data;
	int front;
	int rear;
	int size;

	@SuppressWarnings("unchecked")
	Queue(int size) {
		this.size = size;
		this.data = (T[]) new Object[size];
		this.front = 0;
		this.rear = 0;
	}

	public boolean empty() {
		return front == rear;
	}

	public void enqueue(T val) {
		if (rear == size - 1) {
			System.err.println("erro: transbordamento de fila " + this);
		}
		data[rear++] = val;
	}

	public T peek() {
		return data[0];
	}

	public T dequeue() {
		if (empty()) {
			System.err.println("erro: tentado acessar valor inválido " + this);
			return null;
		}

		T res = data[0];

		for(int i = 0; i < rear; i++) {
			data[i] = data[i + 1];
		}
		rear--;

		return res;
	}
}
