package com.epam.SiCi;

public class Methods {
   public double getSimpleInterest(double p,double t,double r)
   {
	   double result=(p*t*r)/100;
	   return result;
   }
   public double getCompoundInterest(double p,double t,double r)
   {
	    double q=p;
	   double hr=(1+(r/100));
	  double answer= Math.pow(hr,t);
	   return answer*p-q;
   }
}