/**  
* @author SANKALP SAXENA  
*/

   public static PerformOperation isOdd()
{
    return num ->
    {
          if(num%2==0)
            return false;
         else
            return true;
    } ;
}

public static PerformOperation isPrime()
{
    return num ->
    {
        int flag = 0;
        for(int i=2;i<=num/2;i++)
      {
           if(num%i==0)
            {
              flag = 1;
              break; 
            }
           else
            {
              flag = 0;
              break; 
            }
            
      }
      if(flag == 0)
          return true;
      else 
          return false;
    }; 
}

public static PerformOperation isPalindrome()
{
    return num ->
    {
      int r,sum=0,temp; 
      temp = num;
       while(num>0)
        {
            r = num % 10;
            sum = (sum*10)+r;  
            num = num/10;  
        }
      if(temp == sum)
        return true;
      else
        return false;
    };
   
}
}