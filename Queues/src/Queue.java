
interface Queue<T> {
	void enqueue(T item);
	void enqueueMany(T[] items);
	T dequeue();
	
	T peek();
	boolean isEmpty();
}
