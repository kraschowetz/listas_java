public class Stack<T> {
	T[] data;

	int top = -1;
	int size = 0;

	@SuppressWarnings("unchecked") //pra nn dar aviso :)
	Stack(int size) {
		this.data = (T[]) new Object[size];
		this.size = size;
	}
	
	public boolean empty() {
		return this.top == -1;
	}

	public int size() {
		if (empty()) {
			return -1;
		}

		return size + 1;
	}
	

	public void push(T val) {
		if (top < size - 1) {
			data[++top] = val;
			return;
		}

		System.err.println("erro: transbordamento de pilha " + this);
	}

	public T pop() {
		if (empty()) {
			System.err.println("erro: tentando acessar endereco inválido " + this);
			return null;
		}
		return data[top--];
	}

	public T peek() {
		if (empty()) {
			System.err.println("erro: tentando acessar endereco inválido " + this);
			return null;
		}

		return data[top];
	}
}
