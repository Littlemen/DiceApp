public class DiceApp
{
    
    public static void main(String[] args)
    {
        int roll;
        String msg = "Behold 10 random dice rolls 1-6.";
        System.out .println(msg);
        
        
        
        for (int i=0; i<10; i++)
        {
            roll = randomInt(1, 6);
            System.out.print(roll + " ");
            
        }
        System.out.println();
    }
    
    public static int randomInt(int low, int high)
    {
       // int low = 1;
       // int high = 6;
        int result = (int)(Math.random() * (high - low +1 ) + low);
        return result;
    }
    
    
    
    
}