package com.epam.Construction;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Compute {
	private static final Logger LOGGER=LogManager.getLogger(Compute.class);
	public static void main(String args[])
	{
		String st=null;
		Scanner s=new Scanner(System.in);
		LOGGER.info("Enter the total area of the house");
		int total_area=s.nextInt();
		Construction c=new Construction();
		String str=null;
		do
		{
			LOGGER.info("1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.High standard Material and Fully automatic home");
			int ch=s.nextInt();
			if(ch!=4){
				LOGGER.info("Do you want a fully automated house(y/n)");
				st=s.next();
				}
			switch(ch)
			{
			case 1:
				if(st.equalsIgnoreCase("y"))
					LOGGER.info(c.construct(total_area,1900));
				else
					LOGGER.info(c.construct(total_area,1200));
				break;
			case 2:
				if(st.equalsIgnoreCase("y"))
					LOGGER.info(c.construct(total_area,2200));
				else
					LOGGER.info(c.construct(total_area,1500));
				break;
			case 3:
				if(st.equalsIgnoreCase("y"))
					LOGGER.info(c.construct(total_area,2500));
				else
					LOGGER.info(c.construct(total_area,1800));
				break;
			case 4:
				LOGGER.info(c.construct(total_area,2500));
				break;	
			}
			LOGGER.info("Do you want to continue y/n?");
			str=s.next();
		}while(str.equalsIgnoreCase("Y"));
	}
}
