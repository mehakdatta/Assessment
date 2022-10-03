package org.assessments;

import java.util.*;

public class Toothpasteusers {
	int brandno;
	String brandname,categ;
	static int countcol,countpep,countpat,countdab;
	
	Scanner sc=new Scanner(System.in);
	public Toothpasteusers()
	{
		System.out.println("ENTER 1 FOR COLGATE,2 FOR PEPSODENT,3 FOR PATANJALI,4 FOR DABUR RED :");
		this.brandno=sc.nextInt();
		System.out.println("ENTER IF YOU ARE CHILDREN, WOMEN,OR MEN :");
		this.categ=sc.next();
		
		if(brandno==1) {
			this.brandname="Colgate";
			countcol++;
		}
		if(brandno==2) {
			this.brandname="Pepsodent";
			countpep++;
		}
		if(brandno==3) {
			this.brandname="Patanjali";
			countpat++;
		}
		if(brandno==4) {
			this.brandname="Dabur red";
			countdab++;
			}
		

}
    public static String mostpopular() {
    	int[] a= { countcol, countpep, countpat, countdab};
    	int max=0;
    	int index=0;
    	for(int i=0;i<4;i++) {
    		if(a[i] >=max) {
    			max=a[i];
    			index=i;
    		}
    	}
    	switch(index+1) {
    	case 1:
    		return "Colgate is most used : "+countcol;
    	case 2:
    		return "Pepsodent is most used : "+countpep;
    	case 3:
    		return "Patanjali is most used : "+countpat;
    	case 4:
    		return "Dabur red is most used : "+countdab;
    	default:
    		return "not valid";
    	}
    }
	public static String countBrands() {
    
    return "COLGATE: "+countcol+"\nPEPSODENT: "+countpep+"\nPATANJALI: "+countpat+"\nDABUR RED: "+countdab;
}   
}
