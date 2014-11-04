public class FactorGenerator
{
    private int number;
    private int factor;
    
    /**
     * Default constructor for objects of class FactorGenerator
     */
    public FactorGenerator(int numberToFactor)
    {
        this.number = numberToFactor;
        this.factor = 1;
    }
    
    public boolean hasMoreFactors()
    {
        while (this.factor < this.number-1)
        {
            this.factor +=1;
            
            //for (int count = 2; count < this.factor; count++)
            //{
            //    if(this.factor % count == 0)
            //    {
            //        return false;
            //    }
            //}
            
            if (this.number % this.factor == 0)
            {
                return true;
            }
            
        }
        return false;
    }
    
    
    public int nextFactor()
    {
        return this.factor;
    }

    

}
