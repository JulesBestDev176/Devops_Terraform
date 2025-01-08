package com.groupeisi;

public class Main {
    public static void main(String[] args) {
        int num = 5;
        var factoriel = new Factoriel();
        System.out.println("Le factoriel de " + num + " est : " + factoriel.calculate(num));
    }
}
