package Task4.CleanCode;

import java.util.Scanner;
import java.util.logging.Logger;
public class App 
{
    public static void main( String[] args )
    {
    	Logger logger 
        = Logger.getLogger( 
            App.class.getName()); 
    	HouseConstructionCost cost = new HouseConstructionCost();
    	
        Scanner sc=new Scanner(System.in);
        String automation = "no";
        logger.info("Enter Material Standard ");
        String materialStandard = sc.nextLine();
        
        logger.info("Enter Total Area of the house(in sq.feet)  ");
        int totalArea = sc.nextInt();
        
        sc.nextLine();
        if(materialStandard.equals("high standard"))
        {
        	System.out.println("Do you want fully automated home????");
        	automation = sc.nextLine();
        }
          
        logger.info("Total house construction cost = Rs "+
        								cost.constructionCost(materialStandard,totalArea,automation));
        
        /*................................................................................*/
        /* code for calculating simple and compound interest */
        
        SimpleandCompound interest = new SimpleandCompound();
        
        logger.info("Enter principle amount,rate and time : ");
        
        int principle = sc.nextInt();
        double rate = sc.nextDouble();
        int time = sc.nextInt();
        int n = sc.nextInt();
        
        logger.info("simple interest is : " +interest.calculateSimpleInterest(principle, rate, time));
        logger.info("compound interest is : " +interest.calculateCompoundInterest(principle, rate, time,n));
        
        sc.close(); 
    }
}
