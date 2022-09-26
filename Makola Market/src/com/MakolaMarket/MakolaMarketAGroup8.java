package com.MakolaMarket;

import java.util.Scanner;


public class MakolaMarketAGroup8 {

    Scanner sc = new Scanner(System.in);

    String customerName, customerMobileNumber, orderMonth, orderDay, orderYear;
    double priceOfAPoundGoatMeat, priceOfAPoundOfRedFish, priceOfLeleRice, priceOfSadiaChicken, priceOfVegetableOil;
    int poundsOfGoatMeat, poundsOfRedFish, numberOfLeleRice, numberOfSadiaChicken, litresOfVegetableOil;
    double subTotalGoatMeat, subTotalRedFish, subTotalLeleRice, subTotalSadiaChicken, subTotalVegetableOil;

    public void CustomerDetails(){
        CustomerAGroup8 customerAGroup8 = new CustomerAGroup8();

        System.out.println("Welcome to Makola Market");

        System.out.print("Enter Customers Name: ");
        customerAGroup8.setCustomerName(sc.next());
        System.out.print("Enter Customers Mobile Number: ");
        customerAGroup8.setCustomerMobileNumber(sc.next());
        this.customerName = customerAGroup8.getCustomerName();
        this.customerMobileNumber = customerAGroup8.getCustomerMobileNumber();
    }

    public void QuantityDisplay(){
        ItemsAGroup8 itemsAGroup8 = new ItemsAGroup8();
        PricesAGroup8 pricesAGroup8 = new PricesAGroup8();


        System.out.print("What is the price of Goat Meat: GHC ");
        pricesAGroup8.setPriceOfAPoundGoatMeat(sc.nextDouble());
        System.out.print("Enter unit price of redfish: GHC ");
        pricesAGroup8.setPriceOfAPoundOfRedFish(sc.nextDouble());
        System.out.print("What is the price of Lele Rice: GHC ");
        pricesAGroup8.setPriceOfLeleRice(sc.nextDouble());
        System.out.print("What is the price of Sadia Chicken: GHC ");
        pricesAGroup8.setPriceOfSadiaChicken(sc.nextDouble());
        System.out.print("What is price of Vegetable Oil: GHC ");
        pricesAGroup8.setPriceOfVegetableOil(sc.nextDouble());
        System.out.print("What quantity of goatmeat was bought: ");
        itemsAGroup8.setPoundsOfGoatMeat(sc.nextInt());
        System.out.print("What quantity of redfish was bought: ");
        itemsAGroup8.setPoundsOfRedFish(sc.nextInt());
        System.out.print("What quantity of Lele rice was bought: ");
        itemsAGroup8.setNumberOfLeleRice(sc.nextInt());
        System.out.print("What quantity of sadia chicken was bought: ");
        itemsAGroup8.setNumberOfSadiaChicken(sc.nextInt());
        System.out.print("What quantity of vegetable oil was bought: ");
        itemsAGroup8.setLitresOfVegetableOil(sc.nextInt());

        //getting current unit price of items
        this.priceOfAPoundGoatMeat = pricesAGroup8.getPriceOfAPoundGoatMeat();
        this.priceOfAPoundOfRedFish = pricesAGroup8.getPriceOfAPoundOfRedFish();
        this.priceOfLeleRice = pricesAGroup8.getPriceOfLeleRice();
        this.priceOfSadiaChicken = pricesAGroup8.getPriceOfSadiaChicken();
        this.priceOfVegetableOil = pricesAGroup8.getPriceOfVegetableOil();

        //getting quantity of items bought
        this.poundsOfGoatMeat = itemsAGroup8.getPoundsOfGoatMeat();
        this.poundsOfRedFish = itemsAGroup8.getPoundsOfRedFish();
        this.numberOfLeleRice = itemsAGroup8.getNumberOfLeleRice();
        this.numberOfSadiaChicken = itemsAGroup8.getNumberOfSadiaChicken();
        this.litresOfVegetableOil = itemsAGroup8.getLitresOfVegetableOil();

        //calculations
        this.subTotalGoatMeat = itemsAGroup8.getPoundsOfGoatMeat() * pricesAGroup8.getPriceOfAPoundGoatMeat();
        this.subTotalRedFish = itemsAGroup8.getPoundsOfRedFish() * pricesAGroup8.getPriceOfAPoundOfRedFish();
        this.subTotalLeleRice = itemsAGroup8.getNumberOfLeleRice() * pricesAGroup8.getPriceOfLeleRice();
        this.subTotalSadiaChicken = itemsAGroup8.getNumberOfLeleRice() * pricesAGroup8.getPriceOfSadiaChicken();
        this.subTotalVegetableOil = itemsAGroup8.getLitresOfVegetableOil() * pricesAGroup8.getPriceOfVegetableOil();
    }
    public  void OrderDate(){
        DateAGroup8 dateAGroup8 =new DateAGroup8();

        System.out.println();
        System.out.println("Please enter details of client's visit below");
        System.out.println("*********************************************************************");

        System.out.print("Enter day of order: ");
        dateAGroup8.setOrderDay(String.valueOf(sc.nextInt()));
        System.out.print("Enter month of order: ");
        dateAGroup8.setOrderMonth(String.valueOf(sc.nextInt()));
        System.out.print("Enter year of order: ");
        dateAGroup8.setOrderYear(String.valueOf(sc.nextInt()));
        System.out.println();

        this.orderDay = dateAGroup8.getOrderDay();
        this.orderMonth = dateAGroup8.getOrderMonth();
        this.orderYear = dateAGroup8.getOrderYear();

    }
    public void createReceipt(){
        System.out.println("- / - Makola Market - / -");
        System.out.println("========================================================================================================");
        System.out.println("Customer: " + this.customerName);
        System.out.println("Mobile Number: " + this.customerMobileNumber);
        System.out.println("Order Date: " + this.orderDay + "/" + this.orderMonth + "/" + this.orderYear);
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Item Type" + "\t\t\tQty" + "\t\tUnit Price (GHC)" + "\tSub-Total (GHC)");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("Goatmeat" + "\t\t\t" +this.poundsOfGoatMeat + "\t\t"+this.priceOfAPoundGoatMeat + "\t\t\t\t\t" + this.subTotalGoatMeat);

        System.out.println("RedFish"+ "\t\t\t\t" + this.poundsOfRedFish + "\t\t"+this.priceOfAPoundOfRedFish + "\t\t\t\t\t"+ this.subTotalRedFish);

        System.out.println("LeleRice"+ "\t\t\t" +this.numberOfLeleRice + "\t\t"+this.priceOfLeleRice+"\t\t\t\t\t"+ this.subTotalLeleRice);

        System.out.println("SadiaChicken"+ "\t\t" +this.numberOfSadiaChicken + "\t\t"+this.priceOfSadiaChicken +"\t\t\t\t\t"+ this.subTotalSadiaChicken);

        System.out.println("VegetableOil"+ "\t\t" +this.litresOfVegetableOil + "\t\t"+this.priceOfVegetableOil + "\t\t\t\t\t"+ this.subTotalVegetableOil);
        System.out.println("---------------------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        MakolaMarketAGroup8 makolaMarketAGroup8 = new MakolaMarketAGroup8();
        makolaMarketAGroup8.CustomerDetails();
        makolaMarketAGroup8.QuantityDisplay();
        makolaMarketAGroup8.OrderDate();
        makolaMarketAGroup8.createReceipt();


        //declaring variables and performing mathematical calculation
        int totalNumOrder;
        double totalOrder, totalDiscount;
        totalNumOrder = makolaMarketAGroup8.poundsOfGoatMeat+makolaMarketAGroup8.poundsOfRedFish + makolaMarketAGroup8.numberOfLeleRice + makolaMarketAGroup8.numberOfSadiaChicken + makolaMarketAGroup8.litresOfVegetableOil;
        totalOrder = makolaMarketAGroup8.subTotalGoatMeat + makolaMarketAGroup8.subTotalRedFish + makolaMarketAGroup8.subTotalLeleRice + makolaMarketAGroup8.subTotalSadiaChicken + makolaMarketAGroup8.subTotalVegetableOil;
        totalDiscount = 0.25 * totalOrder;

        System.out.println("Number of Items: " + totalNumOrder);
        System.out.printf("Total Order: GHC %.2f",totalOrder);
        System.out.println();
        System.out.printf("Total Discount: GHC %.2f",totalDiscount);
        System.out.println();
        System.out.println("==========================================================================================================");
        System.out.println("Created by GROUP 8: 01210614D, 01211076D, 01210265D, 01210474D, 01212248D, 01210697D, 01211154D, 01211756D, 01210783D, 01210345D, 01210386D and 01212857D");
    }


}
