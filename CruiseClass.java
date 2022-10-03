package org.assessments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CruiseClass {
	public static void main(String[] args) 
    {
    Members ob;    	
    	Scanner sc = new Scanner(System.in);
        
        Map<Integer,Members> mapValue = new HashMap<Integer,Members>();
        
        System.out.println("Enter the Number of Travelers You want On the Cruise");
        
        
        int num = sc.nextInt();
        
        for(int i=1; i<=num; i++) 
        {
            mapValue.put(i, new Members());
        }
        
        
        for(Map.Entry<Integer, Members> entry:mapValue.entrySet()){    
            int key=entry.getKey();  
            Members b=entry.getValue();  
            System.out.println(key+" Data:");  
            System.out.println("Name: " + b.name + "\nAge: " + b.age + "\nMember Type: " + b.memberTypes+"\nFees: "+b.fee);    
            } 
        
       System.out.println(Members.countMembers());
        
    }

}
