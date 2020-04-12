package mta.edu.vn;

public class Stack {

	int top;
	int maxsize = 10;
	int[] arr = new int[maxsize];

	boolean isEmpty() {
		return top < 0;
	}

	void push(int data) {
		if (isEmpty()) {

		} else {
			top++;
			arr[top] = data;
		}
	}
	
//	int pop() {
//		
//		if(!isEmpty()) {
//			
//		}
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
