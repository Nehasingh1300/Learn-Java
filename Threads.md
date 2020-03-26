# Threads
Java provides built-in support for multithreaded programming. A multi-threaded program contains two or more parts that can run concurrently. Each part of such a program is called a thread, and each thread defines a separate path of execution. When a Java program starts up, one thread begins running immediately.<br>
## the stages of the life cycle −
<br>
New − A new thread begins its life cycle in the new state. It remains in this state until the program starts the thread. It is also referred to as a born thread.
<br>
Runnable − After a newly born thread is started, the thread becomes runnable. A thread in this state is considered to be executing its task.
<br>
Waiting − Sometimes, a thread transitions to the waiting state while the thread waits for another thread to perform a task. A thread transitions back to the runnable state only when another thread signals the waiting thread to continue executing.
<br>
Timed Waiting − A runnable thread can enter the timed waiting state for a specified interval of time. A thread in this state transitions back to the runnable state when that time interval expires or when the event it is waiting for occurs.
<br>
Terminated (Dead) − A runnable thread enters the terminated state when it completes its task or otherwise terminates.
<br>[CODE 1](https://github.com/Nehasingh1300/Java/blob/master/threads.java)
