package Assignment1P1;

public class factorial {
    public long calc(long num)
    {
        if (num == 0 || num == 1)
        {
            return 1;
        }
        else {
            return num*calc(num-1);
        }
    }
}
