package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setInfo("VA", "Amazon Inc", "SDET", 110000, true, true, true, true);
        offer2.setInfo("CA", "Sony Inc", "QA", 120000, true, false, false, false);
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, true);
        offer4.setInfo("TX", "CapitalOne", "SM", 115000, false, false, true, true);
        offer5.setInfo("WA", "Bank of America", "BA", 130000, true, true, false, true);
        Offer[] offers = {offer1, offer2, offer3, offer4, offer5};
        ArrayList<Offer> list = new ArrayList<>(Arrays.asList(offers));
        for (Offer offer : list) {
            if(offer.isFullTime)
                System.out.println(offer.companyName);
        }
        ArrayList<Offer> fullTime = new ArrayList<>(Arrays.asList(offers));
        fullTime.removeIf(p-> !p.isFullTime);
        System.out.println("The number of full time jobs is "+fullTime.size());

        System.out.println("-----------------------------------------");

        ArrayList<Offer> local = new ArrayList<>(Arrays.asList(offers));
        local.removeIf(p-> !p.location.equals("VA"));
        System.out.println(local);
        System.out.println(local.size());
    }
}