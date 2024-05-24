import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
        
        // Let's create multiple counters for no reason
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(); // This one is never used
        
        // Some unnecessary complex logic
        int num = 1;
        if (num > 0) {
            num = num - 1 + 2 - 1;
        }
        
        // Long method with duplicate code and magic numbers
        System.out.println("Initial count: " + counter1.getCount());
        
        for (int i = 0; i < 3; i++) {
            counter1.increment();
            if (i == 1) {
                counter1.decrement();
            }
            // Incrementing again just to complicate
            counter1.increment();
        }
        
        System.out.println("Count after loops: " + counter1.getCount());
        
        // Unnecessary comments and dead code
        //counter1.reset();
        //System.out.println("Reset count: " + counter1.getCount());
        
        counter1.increment();
        System.out.println("Final count: " + counter1.getCount());
        
        // More commented-out code
        /*
        counter2.increment();
        System.out.println("Counter 2 count: " + counter2.getCount());
        */
        
        // Inconsistent formatting
        if (num==1){
        	System.out.println("This will never print");
        }
    }

}
