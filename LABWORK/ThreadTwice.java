//No thread will run once and for the second time it will throw exception//

public class ThreadTwice extends Thread
{
public void run()
{
System.out.println("Thread Started Running...!");
}
public static void main(String args[])
{
ThreadTwice t1= new ThreadTwice();
t1.start();
t1.start();
}
}