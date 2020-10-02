package com.company;

public class Coffee {

    private String producer;
    private String product;
    private String information;

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
}
