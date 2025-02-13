package Week1.day2;

public class Home_Ass3_Day2 {

	  		 
		    // Driver Program
		    public static void main(String args[])
		    {
		    	boolean flag = false;
		    	        int n = 3;
		    			
		    	
		        for (int i = 2; i<=n/2; i++)
		            if (n % i == 0)
		                flag= true;

		            	    	
		        if (!flag)
		            System.out.println(" Prime Number");
		        else
		            System.out.println("Not prime Number");
		       
		    }
		}