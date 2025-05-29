package Homework;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
class CrimeRate{
    int population;
    double violentCrimeRate;
    double medianIncome;
    double propertyCrime;
    double povertyRate;
    public CrimeRate(int population, double violentCrimeRate, double propertyCrime, double medianIncome, double povertyRate) {
        this.population = population;
        this.violentCrimeRate = violentCrimeRate;
        this.medianIncome = medianIncome;
        this.propertyCrime = propertyCrime;
        this.povertyRate = povertyRate;
    }
    public int getPopulation() {
        return population;
    }
    public double getViolentCrimeRate() {
        return violentCrimeRate;
    }
    public double getMedianIncome() {
        return medianIncome;
    }
    public double getPropertyCrime() {
        return propertyCrime;
    }
    public double getPovertyRate() {
        return povertyRate;
    }
    @Override
    public String toString() {
        return "CrimeRate [population=" + population + ", violentCrimeRate=" + violentCrimeRate + ", medianIncome="
                + medianIncome + ", propertyCrime=" + propertyCrime + ", povertyRate=" + povertyRate + "]";
    }
    
    static HashMap<String,CrimeRate> crimeRateMap(){
        HashMap<String,CrimeRate> o = new HashMap<String,CrimeRate>();
        File f = new File("/home/rsirisena/Documents/ICS4UR/Homework/usa_crime_rate_data.csv");
        try{
            Scanner l = new Scanner(f);
            l.nextLine();
            while(l.hasNextLine()){
                Scanner c = new Scanner(l.nextLine()).useDelimiter(",");
                o.put(c.next(), new CrimeRate(c.nextInt(), c.nextDouble(), c.nextDouble(), c.nextDouble(), c.nextDouble()));
                c.close();
            }
            l.close();
        } catch(FileNotFoundException e){
            System.out.println("OwO: No File Found");
        }
        return o;
    }
    static double getMedianIncome(HashMap<String, CrimeRate> crimeRateMap, String state){
        return crimeRateMap.get(state).getMedianIncome();
    }
    static double getMedianPopulation(HashMap<String, CrimeRate> crimeRateMap){
        ArrayList<Integer> p = new ArrayList<Integer>();
        for(String k : crimeRateMap.keySet()){
            p.add(crimeRateMap.get(k).getPopulation());
        }
        p.sort(null);
        if(p.size()%2 == 0){
            return (p.get(p.size()/2) + p.get((p.size()/2)+1))/2;
        } else{
            return (p.get(Math.round(p.size()/2)));
        }
    }
    public static void main(String[] args) {
        System.out.println(crimeRateMap());
    }
}