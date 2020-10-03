package com.company;

import java.util.ArrayList;

public class Coffee {

    private String producer;
    private String product;
    private String information;

    public Coffee() {

    }

    public Coffee(String producer, String product, String information) {
        this.producer = producer;
        this.product = product;
        this.information = information;
    }

    @Override
    public String toString() {
        return "\nProducer: " + producer +
                "\nProduct: " + product +
                "\nInformation: " + information + "\n";
    }
    public void showCoffee() {

        Coffee product1 = new Coffee("Löfbergs", "Mellanrost", "En originalblandning, en fyllig  mellanrost, som framhäver en fin och mjuk arom.");

        Coffee product2 = new Coffee("Arvid Nordqvist", "Classic Festivita", "Festivita är ett extra mörkrostat bryggmalet kaffe med intensiv doft. Kraftfull och fyllig smak med inslag av mörk choklad.");

        Coffee product3 = new Coffee("Zoéga", "Skånerost", "Skånerost är ett malet mörkrostat bryggkaffe från Zoégas bestående av 100 % Arabicabönor, som ger ett särskilt smakrikt kaffe med mjuka och spännande nyanser av frukt och mörka bär.");

        Coffee product4 = new Coffee("Gevalia", "Mörkrost", "Gevalia mörkrostade kaffe består av 100% Arabicabönor, med en välbalanserad och lätt fruktig smak");

        ArrayList<Coffee> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        StringBuilder stringBuilder = new StringBuilder();
        for (Coffee product : products) {
            stringBuilder.append(product);
        }
        String text = stringBuilder.toString();
        System.out.println(text);

    }
}
