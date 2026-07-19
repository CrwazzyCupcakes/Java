import java.util.*;

class Task implements Runnable
{
    private String name;

    public Task(String name)
    {
        this.name = name;
    }

    public void run()
    {
        for (int i = 1; i <= 3; i++)
        {
            System.out.println(name + " → step " + i);

            try
            {
                // ── sleep() ──────────────────────────────
                // pauses THIS thread for given milliseconds
                // other threads continue running during this pause
                // MUST be in try-catch — throws InterruptedException
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                // ── interrupt() ──────────────────────────
                // when interrupt() is called on a sleeping thread
                // it wakes up and lands here immediately
                // always return after catching — don't continue
                System.out.println(name + " was interrupted!");
                return;
            }
        }
        System.out.println(name + " finished!");
    }
}

public class Thread_Methods
{
    public static void main(String[] args)
    {
        // create tasks and wrap in threads
        Thread t1 = new Thread(new Task("Downloader"));
        Thread t2 = new Thread(new Task("Converter"));
        Thread t3 = new Thread(new Task("Uploader"));

        // ── setName() ────────────────────────────────────
        // gives thread a meaningful name
        // default names are Thread-0, Thread-1 etc
        // useful for debugging
        t1.setName("Downloader-Thread");
        t2.setName("Converter-Thread");
        t3.setName("Uploader-Thread");

        // ── setPriority() ────────────────────────────────
        // hints to OS which thread is more important
        // range: 1 (lowest) to 10 (highest), default is 5
        // NOT a guarantee — OS makes the final call
        t1.setPriority(Thread.MAX_PRIORITY);    // 10
        t2.setPriority(Thread.NORM_PRIORITY);   // 5
        t3.setPriority(Thread.MIN_PRIORITY);    // 1

        // ── isAlive() ────────────────────────────────────
        // returns true if thread has started and not yet finished
        // false before start() and after termination
        System.out.println("=== Before start() ===");
        System.out.println(t1.getName() + " alive : " + t1.isAlive());  // false
        System.out.println(t2.getName() + " alive : " + t2.isAlive());  // false
        System.out.println(t3.getName() + " alive : " + t3.isAlive());  // false

        // ── start() ──────────────────────────────────────
        // creates a new thread and calls run() inside it
        // NEVER call run() directly — that's just a method call
        // no new thread is created if you call run() directly!
        t1.start();
        t2.start();
        t3.start();

        System.out.println("\n=== After start() ===");
        System.out.println(t1.getName() + " alive : " + t1.isAlive());  // true
        System.out.println(t2.getName() + " alive : " + t2.isAlive());  // true
        System.out.println(t3.getName() + " alive : " + t3.isAlive());  // true

        // ── interrupt() ──────────────────────────────────
        // sends an interrupt signal to the thread
        // if thread is sleeping → wakes it up → InterruptedException is thrown
        // if thread is running  → sets a flag, checked manually
        // here we interrupt t3 (Uploader) early
        t3.interrupt();
        System.out.println("\nt3 interrupted!");

        // ── join() ───────────────────────────────────────
        // makes the CALLING thread wait until this thread finishes
        // without join() main might end before t1 and t2 finish
        // MUST be in try-catch — throws InterruptedException
        try
        {
            t1.join();   // main waits here until t1 finishes
            t2.join();   // main waits here until t2 finishes
            // t3 was interrupted so it's already done
        }
        catch (InterruptedException e)
        {
            System.out.println("Main thread interrupted!");
        }

        System.out.println("\n=== After join() ===");
        System.out.println(t1.getName() + " alive : " + t1.isAlive());  // false
        System.out.println(t2.getName() + " alive : " + t2.isAlive());  // false
        System.out.println(t3.getName() + " alive : " + t3.isAlive());  // false

        // ── currentThread() ──────────────────────────────
        // returns a reference to the thread that is CURRENTLY running
        // here it refers to the main thread
        System.out.println("\nCurrent thread      : "
                + Thread.currentThread().getName());      // main

        // ── getName() ────────────────────────────────────
        // returns the name of the thread
        System.out.println("T1 name             : " + t1.getName());

        // ── getPriority() ────────────────────────────────
        // returns the priority of the thread
        System.out.println("T1 priority         : " + t1.getPriority());  // 10
        System.out.println("T2 priority         : " + t2.getPriority());  // 5
        System.out.println("T3 priority         : " + t3.getPriority());  // 1

        System.out.println("\n✅ Main thread ends");
    }
}