package com.laba_6a.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;
import com.laba_6a.JsonParser.ParserJson;
import com.laba_6a.XMLParser.XMLParser;

public class Track extends Car{

    private static Hashtable<Car, String> Cars = new Hashtable<Car, String>();
    private ArrayList<Car> cars = new ArrayList<Car>();

    public Track(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public Hashtable<Car, String> getCars() {
        return Cars;
    }

    @Override
    public String toString() {
        Enumeration<Car> nEnumeration = Cars.keys();
        StringBuffer buffer = new StringBuffer(); 
        buffer.append("Cars: [ ");

        while(nEnumeration.hasMoreElements()){
            Car key = nEnumeration.nextElement();
            buffer.append("{ Position: " + key.getPosition() +
                           " Velocity: " + key.getVelocity() +
                           " Brand: " + key.getBrand() +
            " }");

            buffer.append(key.getPosition());
        }

        buffer.append("]");

        return buffer.toString();

    }

    public void Sort(Integer n){

        if(n > Cars.size()){
            n = Cars.size();
        }

        cars = new ArrayList<Car>();
        ArrayList<Car> listCars = new ArrayList<Car>(Cars.keySet());
        Collections.sort(listCars, (s0, s1) -> s0.getRaInteger().compareTo(s1.getRaInteger()));
        for(var id : listCars) { if(n == 0){ break; } cars.add(id); n--; }
        XMLParser.setCars(cars);
        ParserJson.setCars(cars);
        
    }

    public void GetfirstNrapids(Integer n){

        for(int iter_0 = 0; iter_0 < cars.size(); iter_0++){

            for(int iter = 0; iter < cars.size(); iter++){

                if(iter_0 == iter){
                    continue;
                }

                if(cars.get(iter_0).getVelocity() - cars.get(iter).getVelocity() <= 0){
                    continue;
                }

                Double time = Math.abs((Double.valueOf(cars.get(iter).getPosition()) - Double.valueOf(cars.get(iter_0).getPosition())) / 
                                       (Double.valueOf(cars.get(iter).getVelocity()) - Double.valueOf(cars.get(iter_0).getVelocity()))
                ); 

                cars.get(iter_0).IncreaseRapids(time);
                
                Cars.put(new Car(cars.get(iter_0).getPosition(),
                                 cars.get(iter_0).getVelocity(),
                                 cars.get(iter_0).getBrand(),
                                 cars.get(iter_0).getRaInteger()),
                                 cars.get(iter).getBrand());
            }

        }
        
        Sort(n);
        XMLParser.setcars(Cars);
        ParserJson.setCars(Cars);

    }

    public void Print() {

        Enumeration<Car> nEnumeration = Cars.keys();

        while (nEnumeration.hasMoreElements()) {   
            Car key = nEnumeration.nextElement();
            System.out.println("{ Position: " + key.getPosition() +
                           ", Velocity: " + key.getVelocity() +
                           ", Brand: " + key.getBrand() +
                           ", Time: " + key.getRaInteger() + 
                           ", Brand_2 " + Cars.get(key).toString() + 
            " }"
            );
            
        }

    }

}
