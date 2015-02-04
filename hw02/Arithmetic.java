//Braeden Benedix
//HW02
//CSE002
//Prof Chen

//Compute the cost of items including the PA sales tax of 6%
    //Compute the total for each item
    //Compute the subtotal
    //Compute the total

public class Arithmetic {
    
    public static void main(String[] args) {
        
        //input variables
        
        //number of pairs of socks
        int nSocks=3;
        //cost per pair
        double sockCost$=2.58;
        
        //number of drinking glasses
        int nGlasses=6;
        //cost per glass
        double glassCost$=2.29;
        
        //number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box
        double envelopeCost$=3.25;
        
        //tax rate
        double taxPercent=0.06;
        
        //Calculations
        //item costs
        double sockTotal = nSocks * sockCost$,
        glassTotal = nGlasses * glassCost$,
        envelopeTotal = nEnvelopes * envelopeCost$;
        //item taxes
        double sockTax = sockTotal * taxPercent,
        glassTax = glassTotal * taxPercent,
        envelopeTax = envelopeTotal * taxPercent;
        //subtotal
        double subtotal = sockTotal + glassTotal + envelopeTotal;
        //total tax
        double taxTotal = sockTax + glassTax + envelopeTax;
        //total cost
        double totalWithTax = subtotal * (1 + taxPercent);
        
        //reduce to 2 decimal places
        int sockTaxInt = (int) (sockTax * 100);
        double sockTaxClean = (double) sockTaxInt;
        sockTaxClean /= 100;
        
        int glassTaxInt = (int) (glassTax * 100);
        double glassTaxClean = (double) glassTaxInt;
        glassTaxClean /= 100;
        
        int envelopeTaxInt = (int) (envelopeTax *100);
        double envelopeTaxClean = (double) envelopeTaxInt;
        envelopeTaxClean /= 100;
        
        int taxTotalInt = (int) (taxTotal * 100);
        double taxTotalClean = (double) taxTotalInt;
        taxTotalClean /= 100;
        
        int totalWithTaxInt = (int) (totalWithTax * 100);
        double totalWithTaxClean = (double) totalWithTaxInt;
        totalWithTaxClean /= 100;
        
        //Output
        System.out.println("Pair of socks");
        System.out.println("    Quantity: "+nSocks);
        System.out.println("    Cost per item: $"+sockCost$);
        System.out.println("    Total item cost: $"+sockTotal);
        System.out.println("    Item tax: $"+sockTaxClean);
        System.out.println("Drinking glass");
        System.out.println("    Quantity: "+nGlasses);
        System.out.println("    Cost per item: $"+glassCost$);
        System.out.println("    Total item cost: $"+glassTotal);
        System.out.println("    Item tax: $"+glassTaxClean);
        System.out.println("Box of envelopes");
        System.out.println("    Quantity: "+nEnvelopes);
        System.out.println("    Cost per item: $"+envelopeCost$);
        System.out.println("    Total item cost: $"+envelopeTotal);
        System.out.println("    Item tax: $"+envelopeTaxClean);
        System.out.println("Subtotal: $"+subtotal);
        System.out.println("Tax: $"+taxTotalClean);
        System.out.println("Total: $"+totalWithTaxClean);
    }
}