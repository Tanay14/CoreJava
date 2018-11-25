package threadfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class a extends Thread 
{
	String filename;
	BufferedReader br;
	static boolean isSleep = true;
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public synchronized void readfile1(String str)
	{
		String str1;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			while ((str1 = br.readLine())!= null)
			{
				System.out.println("t1"+str1);
				if(isSleep)
				{
					isSleep = false;
					notify();
					wait();
				}
			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public synchronized void readfile2(String str)
	{
		String str1;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			while ((str1 = br.readLine())!= null)
			{
				System.out.println("t1"+str1);
				if(isSleep)
				{
					isSleep = false;
					notify();
					wait();
				}
			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		a aa = new a();
		  Thread s1=new Thread(aa)
			{
				public void run()
				{
					aa.readfile1("threadTxt1.txt");
				}
			};
					
			
			Thread s2=new Thread(aa)
			{
				public void run()
				{
					aa.readfile2("threadTxt2.txt");
				}
			};
			s1.start();
			s2.start();
			s1.join();
			s2.join();
			s1.stop();
		    s2.stop();
			
			
		}

	

}
 
