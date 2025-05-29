import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class VehicleSales {
    String referencePeriod;
    double carSales;
    double truckSales;
    public VehicleSales(String referencePeriod, double carSales, double truckSales) {
        this.referencePeriod = referencePeriod;
        this.carSales = carSales;
        this.truckSales = truckSales;
    }
    public String getReferencePeriod() {
        return referencePeriod;
    }
    public void setReferencePeriod(String referencePeriod) {
        this.referencePeriod = referencePeriod;
    }
    public double getCarSales() {
        return carSales;
    }
    public void setCarSales(double carSales) {
        this.carSales = carSales;
    }
    public double getTruckSales() {
        return truckSales;
    }
    public void setTruckSales(double truckSales) {
        this.truckSales = truckSales;
    }
    static HashMap<String, VehicleSales> vehicleSalesMap(){
        HashMap<String, VehicleSales> o = new HashMap<String, VehicleSales>();
        try{
            File f = new File("vehicle_sales.csv");
            Scanner l = new Scanner(f);
            l.nextLine();
            while(l.hasNextLine()){
                Scanner c = new Scanner(l.nextLine()).useDelimiter(",");
                String rp = c.next();
                o.put(rp, new VehicleSales(rp, c.nextDouble(), c.nextDouble()));
                c.close();
            }
            l.close();
        } catch(FileNotFoundException e){
            System.out.println("UwU");
        }
        return o;
    }

    static double getCarSales(HashMap<String, VehicleSales> vehicleSalesMap, String reference) throws IllegalArgumentException{
        if(vehicleSalesMap.containsKey(reference)){
            return vehicleSalesMap.get(reference).getCarSales();
        } else{
            throw new IllegalArgumentException("GRAHHHH");
        }
    }
    static double getAverageTruck(HashMap<String, VehicleSales> vehicleSalesMap){
        double o = 0;
        for(String s : vehicleSalesMap.keySet()){
            o += vehicleSalesMap.get(s).getTruckSales();
        }
        o /= vehicleSalesMap.size();
        return o;
    }
}
