import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increaseBy(5);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decreaseBy(2);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.multiplyBy(6);
		
		System.out.println("Current count:" + counter.getCount());	
	}
}
