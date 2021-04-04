
public abstract class MyCounter {
	
	private int count;
	
	public void increase() {
		count++;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
