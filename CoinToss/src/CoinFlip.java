import java.util.Random;
public class CoinFlip {
	
	public boolean getHeadsOrTails()
	//return a value of heads or tails
	{
		Random random = new Random();
		//create random object
		boolean heads = random.nextBoolean();
		//set heads boolean to either True or False
		return heads;
		//return heads boolean
	}// End of GetHeadsOrTails
	
	public double getQuarterVal()
	//return either .25 or 0
	{
		double Quarter = 0;
		//Quarter variable
		TwentyFive QuarterVal = new TwentyFive();
		//create QuarterVal object
		boolean heads = getHeadsOrTails();
		//set heads to True or False
		if (heads)
		//if heads is True
		{
			Quarter = QuarterVal.getQuarter();
			//set Quarter equal to .25
		}
		else
		//if heads is False
		{
			Quarter = 0;
			//set Quarter equal to 0

		}
		
		return Quarter;
		//return the Quarter double
	}
	
	public double getDimeVal()
	//return either .1 or 0
	{
		double Dime = 0;
		//Dime variable
		Ten DimeVal = new Ten();
		//create DimeVal object
		boolean heads = getHeadsOrTails();
		//set heads to True or False
		if (heads)
		//if heads is True			
		{
			Dime = DimeVal.getDime();
			//set Dime equal to .1
		}
		else
		//if heads is False
		{
			Dime = 0;
			//set Dime equal to 0
		}
		
		return Dime;
		//return the Dime double
	}
	
	public double getNickelVal()
	//return .05 or 0
	{
		double Nickel = 0;
		//Nickel variable
		Five NickelVal = new Five();
		//create NickelVal object
		boolean heads = getHeadsOrTails();
		//set heads to True or False
		if (heads)
		//if heads is True	
		{
			Nickel = NickelVal.getNickel();
			//set Nickel equal to .05
		}
		else
		//if heads is False
		{
			Nickel = 0;
			//set Nickel equal to 0
		}
		
		return Nickel;
		//return the Nickel double
	}
	
	public double getPennyVal()
	//return .01 or 0
	{
		double Penny = 0;
		//Penny variable
		One PennyVal = new One();
		//create PennyVal object
		boolean heads = getHeadsOrTails();
		//set heads to True or False
		if (heads)
		//if heads is True
		{
			Penny = PennyVal.getPenny();
			//set Penny equal to .01
		}
		else
		//if heads is False
		{
			Penny = 0;
			//set Penny equal to 0
		}
		
		return Penny;
		//return the Penny double
	}
	
}// End of class
