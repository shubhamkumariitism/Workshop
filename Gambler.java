
public class Gambler 
{

    public static void main(String[] args)
 {
        int stake = 100;
        int bet  = 1;
      while(stake!=0)
	{
		if((Math.random())%2==1)
		{
			stake++;
		}
		else
		{
			stake--;
		}
	}
  }
}
