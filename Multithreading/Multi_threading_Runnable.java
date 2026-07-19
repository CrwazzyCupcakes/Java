// ══════════════════════════════════════════
// MULTI-THREADING DEMO — Runnable Interface
// Same concept as extending Thread but using
// the Runnable interface instead
// ⭐ This is the PREFERRED and RECOMMENDED way
//    to create threads in Java
// ══════════════════════════════════════════


// ══════════════════════════════════════════
// TASK 1 — implements Runnable
// 'implements Runnable' means this class
// promises to provide a run() method
// Unlike 'extends Thread', this class can
// still extend another class if needed ✅
// ══════════════════════════════════════════
class MyTask1 implements Runnable
{
    // run() contains the code this task will execute
    // Same as before — but now this class is just a TASK
    // not a Thread itself
    // The Thread is created separately in main()
    @Override
    public void run()
    {
        int i = 0;
        while (i < 50)
        {
            System.out.println("MyTask1 is running | count: " + i
                    + " | Thread: " + Thread.currentThread().getName());
            i++;
        }
        System.out.println("✅ MyTask1 FINISHED");
    }
}


// ══════════════════════════════════════════
// TASK 2 — implements Runnable
// Completely separate task that runs
// simultaneously with MyTask1
// ══════════════════════════════════════════
class MyTask2 implements Runnable
{
    @Override
    public void run()
    {
        int i = 0;
        while (i < 50)
        {
            System.out.println("MyTask2 is running | count: " + i
                    + " | Thread: " + Thread.currentThread().getName());
            i++;
        }
        System.out.println("✅ MyTask2 FINISHED");
    }
}


public class Multi_threading_Runnable
{
    public static void main(String[] args)
    {
        // ── STEP 1: Create the TASK objects (Runnable) ──
        // These are just tasks — not threads yet!
        // Think of Runnable as a JOB DESCRIPTION
        MyTask1 task1 = new MyTask1();
        MyTask2 task2 = new MyTask2();

        // ── STEP 2: Wrap tasks inside Thread objects ──
        // Thread is the WORKER that carries out the job
        // You hand the task to the thread via constructor
        // Thread(Runnable target) — takes a Runnable as argument
        Thread t1 = new Thread(task1);   // t1 will execute task1.run()
        Thread t2 = new Thread(task2);   // t2 will execute task2.run()

        // Give threads meaningful names for easier debugging
        // Without this Java auto-names them Thread-0, Thread-1 etc
        t1.setName("Worker-Thread-1");
        t2.setName("Worker-Thread-2");

        // Optional: set priority (1=lowest, 5=default, 10=highest)
        // This is a HINT to the OS — not a guarantee
        t1.setPriority(Thread.NORM_PRIORITY);    // priority 5 (default)
        t2.setPriority(Thread.NORM_PRIORITY);    // priority 5 (default)

        // Print thread info before starting
        System.out.println("Starting threads...");
        System.out.println("T1 name: "     + t1.getName());
        System.out.println("T2 name: "     + t2.getName());
        System.out.println("T1 priority: " + t1.getPriority());
        System.out.println("T2 priority: " + t2.getPriority());
        System.out.println("T1 alive before start: " + t1.isAlive()); // false
        System.out.println("T2 alive before start: " + t2.isAlive()); // false

        // ── STEP 3: Start the threads ──
        // start() → creates new thread → calls task's run() inside it
        // Both threads now run SIMULTANEOUSLY ⚡
        t1.start();
        t2.start();

        System.out.println("T1 alive after start: " + t1.isAlive());  // true
        System.out.println("T2 alive after start: " + t2.isAlive());  // true

        // ── STEP 4: join() — wait for both threads to finish ──
        try
        {
            t1.join();    // main thread waits here until t1 finishes
            t2.join();    // main thread waits here until t2 finishes
        }
        catch (InterruptedException e)
        {
            System.out.println("Main thread was interrupted!");
        }

        // Only prints after BOTH threads are completely done
        System.out.println("T1 alive after join: " + t1.isAlive());   // false
        System.out.println("T2 alive after join: " + t2.isAlive());   // false
        System.out.println("✅ All tasks complete — main thread ends");
    }
}