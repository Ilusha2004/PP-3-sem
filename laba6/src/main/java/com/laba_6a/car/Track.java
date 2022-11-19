package com.laba_6a.car;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import com.laba_6a.pair.Pair;

public class Track {
    private Hashtable<Pair<String, String>, Pair<Integer, Integer>> Cars = new Hashtable<Pair<String, String>, Pair<Integer, Integer>>();

    public Track(Hashtable<Pair<String, String>, Pair<Integer, Integer>> cHashtable) {
        Cars = cHashtable;
    }

    public Hashtable<Pair<String, String>, Pair<Integer, Integer>> getCars() {
        return Cars;
    }

    public void setCars(Hashtable<Pair<String, String>, Pair<Integer, Integer>> cars) {
        Cars = cars;
    }

    @Override
    public String toString() {
        Enumeration<Pair<String, String>> nEnumeration = Cars.keys();
        StringBuffer buffer = new StringBuffer(); 
        buffer.append("Cars: [ ");
        while(nEnumeration.hasMoreElements()){
            Pair<String, String> key = nEnumeration.nextElement();
            buffer.append("{ Position: " + key.toString() + " Velocity: " + Cars.get(key) + " }, ");
        }
        buffer.append("]");

        return buffer.toString();
    }

    public void CountRapid(Double time) {
        Enumeration<Pair<String, String>> nEnumeration = Cars.keys();
        List<Car> cars = new ArrayList<>();
        while (nEnumeration.hasMoreElements()) {   
            Pair<String, String> key = nEnumeration.nextElement();
            System.out.println(key.getFirstItem().getClass());
            System.out.println(key.getSecondItem().getClass());
            System.out.println(Cars.get(key).getFirstItem().getClass());
            System.out.println(Cars.get(key).getSecondItem().getClass());
            
            cars.add(new Car(key.getFirstItem(), key.getSecondItem(), Cars.get(key).getFirstItem(), Cars.get(key).getSecondItem()));
        }

        for(var id : cars){
            System.out.println(id.toString());
        }

        Integer CounterRapid = 0;

        for(int iter_0 = 0; iter_0 < cars.size(); iter_0++){
            for(int iter = 0; iter < cars.size(); iter++){
                if(iter_0 == iter){
                    continue;
                }
                else if((cars.get(iter_0).getPosition() - cars.get(iter).getPosition()) +
                   (double)(cars.get(iter_0).getVelocity() - cars.get(iter).getVelocity()) * time > 0){
                    CounterRapid++;
                }
            }
        }

        System.out.println(CounterRapid);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hashtable<Pair<String, String>, Pair<Integer, Integer>> cHashtable = new Hashtable<>();
        for(int i = 0; i < 4; i++){
            String brandString = scan.nextLine();
            String colString = scan.nextLine();
            int Pos = scan.nextInt();
            int Vel = scan.nextInt();

            Pair<String, String> str = new Pair<String, String>(brandString, colString);
            Pair<Integer, Integer> iPair = new Pair<Integer,Integer>(Pos, Vel);

            cHashtable.put(str, iPair);

        }
        
        Track Main = new Track(cHashtable);
        Main.CountRapid(1.9d);
        scan.close();
    }

}
