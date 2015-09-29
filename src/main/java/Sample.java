public class Sample
{
    public void doIt()
    {
        System.out.println("call doIt method");
        System.out.println("VAR1: " + System.getenv("VAR1"));
        System.out.println("VAR2: " + System.getenv("VAR2"));
        System.out.println("VAR3: " + System.getenv("VAR3"));
    }

    public static void main(String[] args)
    {
        new Sample().doIt();
    }
}
