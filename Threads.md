# Threads
Java provides built-in support for multithreaded programming. A multi-threaded program contains two or more parts that can run concurrently. Each part of such a program is called a thread, and each thread defines a separate path of execution. When a Java program starts up, one thread begins running immediately.<br>
## The stages of the life cycle 
<br>
New − A new thread begins its life cycle in the new state. It remains in this state until the program starts the thread. It is also referred to as a born thread.
<br>
Runnable − After a newly born thread is started, the thread becomes runnable. A thread in this state is considered to be executing its task.
<br>
Waiting − Sometimes, a thread transitions to the waiting state while the thread waits for another thread to perform a task. A thread transitions back to the runnable state only when another thread signals the waiting thread to continue executing.
<br>
Timed Waiting − A runnable thread can enter the timed waiting state for a specified interval of time. A thread in this state transitions back to the runnable state when that time interval expires or when the event it is waiting for occurs.
<br>
Terminated (Dead) − A runnable thread enters the terminated state when it completes its task or otherwise terminates.<br>

## Commonly used methods of Thread class:
[public void run()](https://github.com/Nehasingh1300/Java/blob/master/ThreadRun.java): is used to perform action for a thread.<br>
[public void start()](https://github.com/Nehasingh1300/Java/blob/master/ThreadStart.java) starts the execution of the thread.JVM calls the run() method on the thread.<br>
public void sleep(long miliseconds): Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.<br>
public void join(): waits for a thread to die.<br>
public void join(long miliseconds): waits for a thread to die for the specified miliseconds.<br>
public int getPriority(): returns the priority of the thread.<br>
public int setPriority(int priority): changes the priority of the thread.<br>
public String getName(): returns the name of the thread.<br>
public void setName(String name): changes the name of the thread.<br>
public Thread currentThread(): returns the reference of currently executing thread.<br>
public int getId(): returns the id of the thread.<br>
public Thread.State getState(): returns the state of the thread.<br>
public boolean isAlive(): tests if the thread is alive.<br>
public void yield(): causes the currently executing thread object to temporarily pause and allow other threads to execute.<br>
public void suspend(): is used to suspend the thread(depricated).<br>
public void resume(): is used to resume the suspended thread(depricated).<br>
public void stop(): is used to stop the thread(depricated).<br>
public boolean isDaemon(): tests if the thread is a daemon thread.<br>
public void setDaemon(boolean b): marks the thread as daemon or user thread.<br>
public void interrupt(): interrupts the thread.<br>
public boolean isInterrupted(): tests if the thread has been interrupted.<br>
public static boolean interrupted(): tests if the current thread has been interrupted.<br>
<br>[CODE 1](https://github.com/Nehasingh1300/Java/blob/master/threads.java)
<br>[runnable interface](https://github.com/Nehasingh1300/Java/blob/master/runnableDemo.java)
