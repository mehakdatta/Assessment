package org.assessments;



import java.util.*;
class RegularMember {
    int mbrship_fee=0;
    int enrllment_fee=0;
    
    int charges_per_month=20000;
    
    int months;
    
    public RegularMember(int months) {
        super();
        this.months=months;
    }





   public void show_bill() {
        System.out.println("Regular member : ");
        System.out.println("Membership Fee : "+this.mbrship_fee);
        System.out.println("Enrollment Fee : "+this.enrllment_fee);
        System.out.println("Charges Per Month : Rs 20,000");
        System.out.println();
        int charges = this.months*this.charges_per_month+this.mbrship_fee+this.enrllment_fee;
        System.out.println("Total amount : "+charges);
    }
    
    
}




class GoldMember extends RegularMember{
    
    int mbrship_fee=90000;
    int enrllment_fee=10000;
    
    int charges_per_month=10000;
    
    public GoldMember(int months) {
        super(months);
    }
    
    @Override
    public void show_bill() {
        System.out.println("Gold member : ");
        System.out.println("Membership Fee : "+this.mbrship_fee);
        System.out.println("Enrollment Fee : "+this.enrllment_fee);
        System.out.println("Charges for 6 Month : Free");
        System.out.println("after 6 months charges per month : 10000");
        System.out.println();
        
        if(months<=6) {
        int charges = this.mbrship_fee+this.enrllment_fee;
        System.out.println("Total amount : "+charges);
        }
        
        if(months>6)
        {    
            int charges= this.mbrship_fee+this.enrllment_fee+((this.months-6)*this.charges_per_month);
            System.out.println("Total amount : "+charges);
        }
    }
    
}




class SilverMember extends RegularMember{
    
    
    int mbrship_fee=15000;
    int enrllment_fee=5000;
    int charges_per_month=20000;



   public SilverMember(int months) {
        super(months);
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void show_bill() {
        System.out.println("Silver member : ");
        System.out.println("Membership Fee : "+this.mbrship_fee);
        System.out.println("Enrollment Fee : "+this.enrllment_fee);
        System.out.println("Charges for 6 Month : Free");
        System.out.println("after 6 months charges per month : 20000");
        System.out.println();
        
        if(months<=6) {
            int charges=+this.mbrship_fee+this.enrllment_fee;
            System.out.println("Total amount : "+charges);
        }
        
        
        if(months>6)
        {
            int charges=this.mbrship_fee+this.enrllment_fee+((this.months-6)*this.charges_per_month);
            System.out.println("Total amount : "+charges);
        }
    }
    
    
    
}



public class Golf {



   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter regular/gold/silver : ");
        String mbrship_type=sc.nextLine();
        System.out.println("Number of months  : ");
        int months=sc.nextInt();
        
        RegularMember mb ;
        
        switch (mbrship_type) {
        
        case "regular":
            mb= new RegularMember(months);
            mb.show_bill();
            break;
        
        case "gold":
            mb = new GoldMember(months);
            mb.show_bill();
            break;
            
        case "silver":
            mb = new SilverMember(months);
            mb.show_bill();
            break;



       default:
            System.out.println("Invalid input");
            break;
        }
        sc.close();
        
        
        
        
        



   }



}

