package Task4.CleanCode;

import java.util.Scanner;

public class HouseConstructionCost {
	Scanner scanner ;
	public int constructionCost(String materialStandard,int totalArea,String autumation) {
		if(materialStandard.equals("standard"))
		{
			return 1200*totalArea;
		}
		else if(materialStandard.equals("above standard"))
		{
			return 1500*totalArea; 
		}
		else if(materialStandard.equals("high standard") && autumation.equals("no"))
		{
			return 1800*totalArea;
		}
		else if(materialStandard.equals("high standard") && autumation.equals("yes"))
		{
			return 2500*totalArea;
		}
		return 0;
	}
}
