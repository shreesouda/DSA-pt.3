package shree2;

class A { 
	
	//providing thread safety using synchronized method.
    synchronized void sum(int n) 
    { 
  
        // Creating a thread instance 
        Thread t = Thread.currentThread(); 
        for (int i = 1; i <= 5; i++) { 
            System.out.println( 
                t.getName() + " : " + (n + i)); 
        } 
    } 
} 
  
// Class B extending thread class 
class B extends Thread { 
  
    // Creating an object of class A 
    //A a = new A();
	A obj;
	public B(A obj) {
		this.obj = obj;
	}
	
    public void run() 
    { 
        // Calling sum() method 
        obj.sum(10); 
    } 
} 
class Testthread { 
    public static void main(String[] args) 
    { 
  
        // Creating an object of class B 
    	A obj = new A();
    	
        B b = new B(obj); 
        B b1 = new B(obj);
        
        b.setName("Thread 1");
        b1.setName("Thread 2");
        b.start();
        b1.start();
        // Initializing instance t1 of Thread 
        // class with object of class B 
        /*Thread t1 = new Thread(b); 
  
        // Initializing instance t2 of Thread 
        // class with object of class B 
        Thread t2 = new Thread(b); 
  
        // Intializing thread t1 with name 
        //'Thread A' 
        t1.setName("Thread A"); 
  
        // Initializing thread t2 with name 
        //'Thread B' 
        t2.setName("Thread B"); 
  
        // Starting thread instance t1 and t2 
        t1.start(); 
        t2.start();*/ 
    } 
}