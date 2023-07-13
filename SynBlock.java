/* block-level synchorization */
class msg
{
    public void show(String name)
    {                           // Home
        ;;;;;;  // 100 LOC(line of code)

        synchronized(this)
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println("How are U "+name);
            }
        }

        ;;;;;; // 100 LOC
    }                       // School
}
class OurThread extends Thread
{
    msg m;
    String name;
    OurThread(msg m, String name)
    {
        this.m=m;
        this.name=name;
    }
    public void run()
    {
        m.show(name);
    }
}
class SynBlock
{
    public static void main(String[] args) {

        msg m=new msg();  // m has a lock
        OurThread t1=new OurThread(m,"akhilesh");
        OurThread t2=new OurThread(m,"ankush");
        
        t1.start();  t2.start();
    }
}
