package Assignment1P2;

public class calculator
{
    public double add(double n1, double n2)
    {
        return n1+n2;
    }

    public double subtract(double n1, double n2)
    {
        return n1-n2;
    }

    public double multiply(double n1, double n2)
    {
        return n1*n2;
    }

    public double divide(double n1, double n2)
    {
        return n1/n2;
    }

    public double srt(double n1) {
        return Math.sqrt(n1);
    }

    public double power(double n1, double n2)
    {
        return Math.pow(n1,n2);
    }

    public double mean(double[] nums)
    {
        int count = 0;
        double sum = 0;

        for (int i=0; i < nums.length; i++)
        {
            if (nums[count] != 0.0)
            {
            sum = sum + nums[count];
            count++; }
        }
        return sum/count;
    }

    public double variance(double[] nums)
    {
        int count = 0;
        double var = 0;

        double mean = mean(nums);

        for (int i=0; i < nums.length; i++)
        {
            if (nums[count] != 0.0)
            {
                double sub = nums[count] - mean;
                var += power(sub,2.0);
                count++;
            }
        }
        var = var/(count-1);

        return var;
    }
}