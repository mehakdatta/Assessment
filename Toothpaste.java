package org.assessments;

import java.util.*;

public class Toothpaste {
	public static void main(String[] args) {
		Toothpasteusers ob;
		Scanner scan=new Scanner(System.in);
		Map<Integer,Toothpasteusers> mapValue= new HashMap<Integer,Toothpasteusers>();
		System.out.println("ENTER NO. OF MEMBERS :");
		int num=scan.nextInt();
		for(int i=1;i<=num;i++) {
			mapValue.put(i,new Toothpasteusers());
		}
		for(Map.Entry<Integer,Toothpasteusers> entry :mapValue.entrySet()) {
			int key=entry.getKey();
			Toothpasteusers b=entry.getValue();
            System.out.println(key+" Data:"); 
            System.out.println("MEMBER TYPE "+b.categ);   
            System.out.println("BRAND "+b.brandname);
        } 
		 System.out.println(Toothpasteusers.countBrands());
		 System.out.println(Toothpasteusers.mostpopular());
		
		}

}
