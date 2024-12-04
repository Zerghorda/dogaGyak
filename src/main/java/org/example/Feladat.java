package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Feladat {
    private ArrayList<String>lista;
    private String [] tomb;
    private static Scanner sc = new Scanner(System.in);

    public Feladat(int hossz) {
        this.tomb = new String[hossz];
        this.lista = new ArrayList<>();
    }

    public Feladat() {
        this.lista = new ArrayList<>();
        this.tomb = new String[18];
    }

   public void bekeres(){
       System.out.println("Adjon meg 15 betüt!");
       String betu=sc.nextLine();
       tomb[0] =betu;
       lista.add(betu);
       for (int i =1;i< tomb.length;i++){
           System.out.println("Adjon még egy betüt!");
           betu=sc.nextLine();
           tomb[i] =betu;
           lista.add(betu);
       }
   }
   public void tartalmaz(){
       HashSet<String>db =new HashSet();
       for (String s :lista){
           db.add(s);
       }
       System.out.println(db);
   }
   public void sorbarendez(){
       TreeSet<String>rend =new TreeSet<>();
       for (String s :lista){
           rend.add(s);
       }
       System.out.println(rend);
   }
   public void tombKiir(){
       String szoveg ="tömb: ";
       for (int i = 0;i< tomb.length;i++){
           if (i == tomb.length-1){
               szoveg += tomb[i];
           }else {
               szoveg += tomb[i]+",";
           }
       }
       System.out.println(szoveg);
   }

   public void listaKiir(){
        String szoveg ="lista: ";
    for (int i = 0;i< lista.size();i++){
        if (i == lista.size()-1){
            szoveg += lista.get(i);
        }else {
            szoveg += lista.get(i)+"-";
        }
    }
       System.out.println(szoveg);
   }
    public void dbBetuk(){
        HashMap<String,Integer>db = new HashMap();
        for(String a:lista){
            db.put(a,db.getOrDefault(a,0)+1);
        }
        System.out.println(db);
    }
}

