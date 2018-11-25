package intro;

public class multithread extends Thread {
	void disp()
	{
		System.out.println("inside disp method");
		System.out.println(Thread.currentThread().getName()+"thread running");
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	void print()
	{
		System.out.println("inside print method");
		System.out.println(Thread.currentThread().getName()+"thread running");
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	
	}


	public static void main(String[] args) {
		final  multithread m = new multithread();		
		new Thread(m)
		{
			public void run()
			{
				m.disp();
			}
		}.start();
		
		
		new Thread(m)
		{
			public void run()
			{
				m.print();
			}
		}.start();
		
		System.out.println(Thread.currentThread().getName());
		


	}

}
