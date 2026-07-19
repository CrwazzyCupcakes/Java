class MyThread extends Thread
{
    // fields to store data passed via constructor
    private String name;
    private int    count;

    // constructor — receives data before thread starts
    public MyThread(String name, int count)
    {
        this.name  = name;
        this.count = count;
    }

    @Override
    public void run()
    {
        // uses the data passed through constructor
        for (int i = 1; i <= count; i++)
        {
            System.out.println(name + " → step " + i);
        }
    }
}

public class Thread_Contructors_1{
    static void main() {
        MyThread t1 = new MyThread("Downloader", 5);
        MyThread t2 = new MyThread("Converter",  3);
        t1.start();
        t2.start();
    }
}
