class Queue {
	private int arr[];
	private int x, y;
	public int length;

	//Constructor
	Queue(int size) {
		arr = new int[size];
		x = y = 0;
		length = size;
	}

	//accessing private member
	public int getArr(){
		for (int i=0; i<arr.length; i++ ) {
			System.out.print(arr[i]+" ");
		}
		return arr[0];
	}		

	//put/push integer into the queue
	public boolean push(int i) {
		if (x < arr.length) {
			arr[x++] = i;
			return true;
		}
		System.out.println("Queue is full.");
		return false;
	} 

	//pop integer from the queue
	public int pop() {
		if (y < arr.length) {
			
			return arr[y++];	
		}
		return -1;	
	}
}

class Qdemo {
	public static void main(String[] args) {
		Queue qu = new Queue(10);

		//push
		for (int i=0; i<qu.length; i++) {
			qu.push(2*i);
		}

		qu.getArr();

		System.out.println();
		
		//pop
		for (int i=0; i<qu.length; i++) {
			System.out.print(qu.pop() + " ");
		}
		System.out.println();
	}
}
