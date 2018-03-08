
public class MonitorableQueue<T> implements Queue<T> {

	private int _highWaterMark = 0;
	private int _currentSize = 0;
	private final SimpleQueue<T> _queue = new SimpleQueue<>();
	
	@Override
	public void enqueue(T item) {
		_currentSize++;
		if (_currentSize > _highWaterMark)
			_highWaterMark = _currentSize;
		_queue.enqueue(item);
	}
	
	@Override
	public void enqueueMany(T[] items) {
		_currentSize += items.length;
		if (_currentSize > _highWaterMark)
			_highWaterMark = _currentSize;
		_queue.enqueueMany(items);
	}

	@Override
	public T dequeue() {
		if (_currentSize > 0) { 
			_currentSize--;
			return _queue.dequeue();
		}
		return null;
	}

	@Override
	public T peek() {
		return _queue.peek();
	}

	@Override
	public boolean isEmpty() {
		return _queue.isEmpty();
	}

	public int currentMax() {
		return _highWaterMark;
	}
}
