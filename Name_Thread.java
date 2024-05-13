package Name_thread;

public class Name_Thread extends Thread 
{
	public void Run()
	{
		System.out.println("This is method");
	}
	public static void main(String[] args) 
	{
		Name_Thread t1=new Name_Thread();
		Name_Thread t2=new Name_Thread();
		t1.Run();
		System.out.println("Name of t1:"+t1.getName());  
		  System.out.println("Name of t2:"+t2.getName());  
		   
		  t1.start();  
		  t2.start();  
		  
		  t1.setName("Swapnil Bhong");
		  t2.setName("John");
		  System.out.println("After changing name of t1:"+t1.getName());
		  System.out.println("After changing name of t2:"+t2.getName());
	}

}
