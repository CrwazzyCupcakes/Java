// ══════════════════════════════════════════
// MULTI-THREADING DEMO
// Shows two threads running simultaneously
// Both threads run their loops at the same time
// Output order is RANDOM every run — that's the nature of multi-threading!
// ══════════════════════════════════════════


// ══════════════════════════════════════════
// THREAD 1
// Created by extending the Thread class
// Contains its own run() method with its own task
// ══════════════════════════════════════════
class MyThread1 extends Thread
{
    // run() is the heart of every thread
    // Whatever code you put here runs in a SEPARATE thread
    // ⭐ NEVER call run() directly — always use start()
    //    start() → creates new thread → calls run() inside it
    //    run()   → just a normal method call, NO new thread created
    @Override
    public void run()
    {
        int i = 0;
        while (i < 50)
        {
            System.out.println("MyThread1 is running | count: " + i);
            i++;
        }
        System.out.println("✅ MyThread1 FINISHED");
    }
}


// ══════════════════════════════════════════
// THREAD 2
// Identical structure to MyThread1
// But runs as a completely SEPARATE thread simultaneously
// ══════════════════════════════════════════
class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        int i = 0;
        while (i < 50)
        {
            System.out.println("MyThread2 is running | count: " + i);
            i++;
        }
        System.out.println("✅ MyThread2 FINISHED");
    }
}


// ══════════════════════════════════════════
// MAIN CLASS
// ⚠️ BUG FIXED: 'static void main' → 'public static void main'
//    main() MUST be public — JVM calls it from outside the class
//    Without 'public' the JVM can't find the entry point → program won't run
// ══════════════════════════════════════════
public class Multi_threading_Extends
{
    public static void main(String[] args)      // ✅ fixed: added 'public'
    {
        // Create thread objects
        // At this point both threads are in NEW state — not running yet
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        // Get and print thread names (auto-assigned by Java as Thread-0, Thread-1)
        System.out.println("Thread 1 name: " + t1.getName());
        System.out.println("Thread 2 name: " + t2.getName());

        // Optional: give threads meaningful names for easier debugging
        t1.setName("MyThread1");
        t2.setName("MyThread2");

        // start() does 3 things:
        // 1. Creates a new thread in the OS
        // 2. Moves thread from NEW → RUNNABLE state
        // 3. JVM calls run() inside that new thread
        t1.start();   // Thread 1 begins executing run() in parallel
        t2.start();   // Thread 2 begins executing run() in parallel
        // Both now run SIMULTANEOUSLY ⚡

        // ⭐ NOTE: main() itself is also a thread — called the 'main thread'
        //    So right now there are 3 threads running:
        //    1. main thread  (this code)
        //    2. MyThread1    (t1.run())
        //    3. MyThread2    (t2.run())

        // join() makes the main thread WAIT for t1 and t2 to finish
        // Without join() — main thread might finish before t1 and t2
        // With join()    — guaranteed all threads finish before this line
        try
        {
            t1.join();   // main thread waits here until t1 finishes
            t2.join();   // main thread waits here until t2 finishes
        }
        catch (InterruptedException e)
        {
            // InterruptedException is thrown if a thread is interrupted
            // while waiting in join() or sleep()
            System.out.println("Main thread interrupted!");
        }

        // This line only prints AFTER both threads are completely done
        System.out.println("✅ Both threads finished — main thread continues");
    }
}