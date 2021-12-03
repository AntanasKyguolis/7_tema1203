package com.paveldejimas;

import isvestine.StatybininkasImpl;

import java.sql.SQLOutput;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import static isvestine.StatybininkasImpl.lyginimasPagalAtlyginima;

public class Main {

    public static void main(String[] args) {

        StatybininkasImpl statybininkasImpl1 = new StatybininkasImpl("Aukstasis", "brigadininkas", 2000, 9);
        StatybininkasImpl statybininkasImpl2 = new StatybininkasImpl("Vidurinis", "murininkas", 1500, 2);
        StatybininkasImpl statybininkasImpl3 = new StatybininkasImpl("Profesinis", "stogdengys", 1600, 3);
        StatybininkasImpl statybininkasImpl4 = new StatybininkasImpl("Aukstasis", "prarabas", 2500, 5);
        StatybininkasImpl statybininkasImpl5 = new StatybininkasImpl("Profesinis", "santechnikas", 1000, 4);
        StatybininkasImpl statybininkasImpl6 = new StatybininkasImpl("Vidurinis", "stogdengys", 1600, 3);
        StatybininkasImpl statybininkasImpl7 = new StatybininkasImpl("Profesinis", "brigadininkas", 2000, 6);
        StatybininkasImpl statybininkasImpl8 = new StatybininkasImpl("Aukstasis", "prarabas", 2500, 7);
        StatybininkasImpl statybininkasImpl9 = new StatybininkasImpl("Vidurinis", "murininkas", 1500, 2);
        StatybininkasImpl statybininkasImpl10 = new StatybininkasImpl("Aukstasis", "prarabas", 2500, 6);


        ArrayList<StatybininkasImpl> sarasas = new ArrayList<>();
        sarasas.add(statybininkasImpl1);
        sarasas.add(statybininkasImpl2);
        sarasas.add(statybininkasImpl3);
        sarasas.add(statybininkasImpl4);
        sarasas.add(statybininkasImpl5);
        sarasas.add(statybininkasImpl6);
        sarasas.add(statybininkasImpl7);
        sarasas.add(statybininkasImpl8);
        sarasas.add(statybininkasImpl9);
        sarasas.add(statybininkasImpl10);

        System.out.println("Spausdinti paprastai");
        spausdintiPaprastai(sarasas);
        System.out.println("Spausdinti su Iterator");
        spausdintiIterator(sarasas);
        System.out.println("Salinimas is saraso kas maziau kai 4m stazo");
        salinimasSuIteratorium(sarasas);
        spausdintiIterator(sarasas);
       /* System.out.println("Salinimas Paprastai is saraso kas maziau kai 4m stazo");
        salinimas(sarasas);
        spausdintiPaprastai(sarasas); */
        System.out.println("Saraso rikiavimas pagal atlyginima naudojant Comperator");
        Collections.sort(sarasas, lyginimasPagalAtlyginima); //rikiujant kolekcijas su sukurtu Comperator butina nurodyti du parametrus
        spausdintiPaprastai(sarasas);
        System.out.println("Saraso rikiavimas pagal atlyginima naudojant compare metoda");
        Collections.sort(sarasas); //idiegiant comparable interface perduodamas 1 parametras
        spausdintiPaprastai(sarasas);
    }

    //sukuriamas statybininku sarasas paprastai
    static void spausdintiPaprastai(ArrayList<StatybininkasImpl> sarasas) {
        for (StatybininkasImpl sarasas1 : sarasas) {
            System.out.println(sarasas1.toString());
        }
    }

    //sukuriamas statybininku sarasas su Iterator
    static void spausdintiIterator(ArrayList<StatybininkasImpl> sarasas) {
        Iterator<StatybininkasImpl> iterator = sarasas.iterator(); //int i = 0
        while (iterator.hasNext()) { //taspats kas i < n
            System.out.println(iterator.next()); // i++
        }
    }

    // Isimti is saraso kas zemiau  4m stazo Iterator
    static void salinimasSuIteratorium(ArrayList<StatybininkasImpl> sarasas) {
        Iterator<StatybininkasImpl> iterator = sarasas.iterator();
        while (iterator.hasNext()) {
            StatybininkasImpl statybininkas = iterator.next();
            if (statybininkas.getStazas() < 4) {
                iterator.remove();
            }
        }
    }
/*
    // salinimas paprastai NESIGAUNA
    static void salinimas(ArrayList<StatybininkasImpl> sarasas){
        for (int i=0; i< sarasas.size(); i++) {
            StatybininkasImpl statybininkas = sarasas.get(i);
            if (statybininkas.getStazas() < 4 ) {
                sarasas.remove(statybininkas);
            }
        }
    } */

}


