class MyTask implements Runnable
{
    // fields to store data passed via constructor
    private String taskName;
    private int    count;
    private String type;

    // constructor — receives data before thread starts
    public MyTask(String taskName, int count, String type)
    {
        this.taskName = taskName;
        this.count    = count;
        this.type     = type;
    }

    @Override
    public void run()
    {
        System.out.println("Starting : " + taskName + " | Type : " + type);

        for (int i = 1; i <= count; i++)
        {
            System.out.println(taskName + " → step " + i + "/" + count);
        }

        System.out.println("Done : " + taskName);
    }
}

public class Thread_Contructors_2{
    static void main(String[] args) {
        // creating tasks with different data via constructor
        MyTask task1 = new MyTask("Download", 5, "Network");
        MyTask task2 = new MyTask("Convert",  3, "File");
        MyTask task3 = new MyTask("Upload",   4, "Network");

        // wrapping tasks in threads
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.start();
        t2.start();
        t3.start();
    }
}