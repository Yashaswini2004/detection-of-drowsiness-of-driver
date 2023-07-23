public class yash
{
    public static int fact(int n)
    {
        if(n<0)
        {
            return 1;
        }
        else{
        int factorial=n*fact(n-1);
        return factorial;
        }
    }
    public static void main(String args[])
    {
        int n=4;
        int res=fact(n);
        System.out.println(res);
    }
}