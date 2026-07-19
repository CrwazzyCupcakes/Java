class Mytask implements Runnable
{
    private String name;

    public Mytask(String name)
    {
        this.name = name;
    }

    public void run()
    {
        System.out.println(name
                + " | Priority : " + Thread.currentThread().getPriority()
                + " | Thread   : " + Thread.currentThread().getName());
    }
}

public class Thread_Priority
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Mytask("Low    "));
        Thread t2 = new Thread(new Mytask("Normal "));
        Thread t3 = new Thread(new Mytask("High   "));

        // set priorities BEFORE start()
        // setting after start() may have no effect
        t1.setPriority(Thread.MIN_PRIORITY);    // 1
        t2.setPriority(Thread.NORM_PRIORITY);   // 5
        t3.setPriority(Thread.MAX_PRIORITY);    // 10

        // get priorities
        System.out.println("T1 priority : " + t1.getPriority());   // 1
        System.out.println("T2 priority : " + t2.getPriority());   // 5
        System.out.println("T3 priority : " + t3.getPriority());   // 10

        t1.start();
        t2.start();
        t3.start();
    }
}