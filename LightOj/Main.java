import java.util.*;
public class Main
{
  public static void main(String[]args)
  {
    Scanner abu=new Scanner(System.in);
    long counter=abu.nextLong();
    
    long count1=1;
    while(count1<=counter)
    {
      
      long input1=abu.nextInt();
      long input2=abu.nextInt();
      long output=0;
      for(long count=input1;count<=input2;count++)
      {
        long length=Long.toString(count).length();
        String number = String.valueOf(count);
        String[]num = number.split("(?<=.)");
        long result=0;
        for (int loop=0;loop<length;loop++)
        {
          if(num[loop].equals("5")||num[loop].equals("7"))
          {
            result++;
          }
          else
          {
            result--;
            
          }
        }
        if(length==result)
        {
          output++;
        }
        
        
      }
      System.out.println("Case"+" "+(count1++)+":"+" "+output);
      
    }
    
    
  }
}