package AimsProject;
import java.util.Scanner;

import AimsProject.Media.DigitalVideoDisc;
class tester {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cart order = new Cart();
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("abc", "animate", "roger allers",
                87, 19.85f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("xyz", "action", "director name",
                120, 15.99f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("def", "drama", "another director",
                105, 12.50f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("pqr", "comedy", "some director",
                95, 17.25f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("lmn", "sci-fi", "famous director",
                110, 21.75f);  
        
        order.addDigitalVideoDisc(dvd1);
        order.addDigitalVideoDisc(dvd2);
        order.addDigitalVideoDisc(dvd3);
        order.addDigitalVideoDisc(dvd4);
        order.addDigitalVideoDisc(dvd5);
        order.removeDigitalVideoDisc(dvd2);


        float cost = order.getTotalCost();
        int quantity = order.getQuantity();
        System.out.println("1. Print cart information\n2. Print quantity"+
                                "\n3. Print Sum");
        int option = input.nextInt();
        input.close();

        switch (option) {
            case 1:
                for(int i = 0; i < quantity; i ++){
                    if(order.itemOrdered[i] != null){
                        String title = order.itemOrdered[i].getTitle();
                        String director  = order.itemOrdered[i].getDirector();
                        float fee = order.itemOrdered[i].getCost();
                        System.out.printf("Title : %-20s" , title );
                        System.out.printf("Director : %-30s" , director );
                        System.out.printf("Price : %-30s\n" , fee);
                    }
                }
                
                break;
            case 2:
                System.out.println("Total quantity of your purchased : " + quantity);
                break;  
            case 3:
                System.out.println("Total cost of your purchase : " + cost);
                break;    
            default:
                System.out.println("Choose wrong option");
                break;
        }
    }  
}