class Queue {
	private int arr[];
	private int x, y;
	public int length;

	//Constructor
	Queue(int size) {
		arr = new int[size];
		int x = y = 0;
		length = size;
	}

	//put/push integer into the queue
	public boolean push(int i) {
		if (x < arr.length-1) {
			arr[x++] = i;
			System.out.println("Queue has space");
			return true;
		}
		System.out.println("Queue is full");
		return false;
	} 
}

class Qdemo {
	public static void main(String[] args) {
		Queue qu = new Queue(15);

		for (int i=0; i<qu.length; i++) {
			qu.push(i);
		}
	}
}