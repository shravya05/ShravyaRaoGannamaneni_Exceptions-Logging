package com.epam.SiCi;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.SiCi.*;;
public class Main {
	private static final Logger LOGGER=LogManager.getLogger(Main.class);
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 String str=null;
		 Methods m=new Methods();
		LOGGER.info("Enter the principle amount");
         double p=s.nextDouble();
         LOGGER.info("Enter the time period");
         double t=s.nextDouble();
         LOGGER.info("Enter the rate of interest");
         double r=s.nextDouble();
         do {
        	 LOGGER.info("\n1.Simple Interest\n2.Compound Interest");
        	 LOGGER.info("Enter the choice");
         int n=s.nextInt();
         switch(n)
         {
         case 1:
        	 LOGGER.info(m.getSimpleInterest(p,t,r));
        	  break;
         case 2:
        	 LOGGER.info(m.getCompoundInterest(p,t,r));
        	  break;
         }
         System.out.println("Do you want to continue Y/N?");
         str=s.next();
	}while(str.equalsIgnoreCase("Y"));
	}

}
