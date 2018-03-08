import java.util.ArrayList;

public class SimpleQueue<T> implements Queue<T> {
	
	private final ArrayList<T> _array = new ArrayList<>();
	private int _currentTop = -1;
	
	@Override
	public void enqueue(T item) {
		_array.add(item);
		_currentTop++;
	}

	@Override
	public T dequeue() {
		if (_currentTop >= 0)
			return _array.remove(_currentTop--);
		return null;
	}

	@Override
	public T peek() {
		return _array.get(_currentTop);
	}

	@Override
	public boolean isEmpty() {
		return _currentTop >= 0;
	}

}
