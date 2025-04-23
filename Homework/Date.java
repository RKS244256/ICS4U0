package Homework;

public class Date {
    private int month;
    private int day;
    private int year;

    private static boolean isLeapYear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }
            } else{
                return true;
            }
        }
        return false;
    }

    private static boolean isValid(int day, int month, int year){
        if(month>12||month<1){
            return false;
        }
        if(day < 1){
            return false;
        }
        if(month == 2){
            if(isLeapYear(year)){
                if(day>29){
                    return false;
                }
            } else{
                if(day>28){
                    return false;
                }
            }
        }
        if(month<8){
            if(month%2==0){
                if(day<30){
                    return false;
                }
            } else{
                if(day<31){
                    return false;
                }
            }
        }else{
            if(month%2==0){
                if(day<31){
                    return false;
                }
            } else{
                if(day<30){
                    return false;
                }
            }
        }
        return true;
    }

    Date(int month, int day, int year) throws IllegalArgumentException{
        if(!isValid(day, month, year)){
            throw new IllegalArgumentException();
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }
    int getMonth(){
        return month;
    }
    int getDay(){
        return day;
    }
    int getYear(){
        return year;
    }
    void setYear(int year){
        this.year = year;
    }
    void setDay(int day){
        this.day = day;
    }
    void setMonth(int month){
        this.month = month;
    }
    boolean equals(Date other){
        return month == other.getMonth() && day == other.getDay() && year == other.getYear();
    }
    public Date clone(){
        return new Date(month, day, year);
    }
    public String toString() {
        StringBuilder o = new StringBuilder();
        if(month < 10){
            o.append(String.format("0%d", month));
        } else{
            o.append(month);
        }
        if(day < 10){
            o.append(String.format(":0%d", day));
        } else{
            o.append(String.format(":%d", day));
        }
        o.append(String.format(":%d (", year));
        switch(month){
            case 1:
                o.append("January");
                break;
            case 2:
                o.append("February");
                break;
            case 3:
                o.append("March");
                break;
            case 4:
                o.append("April");
                break;
            case 5:
                o.append("May");
                break;
            case 6:
                o.append("June");
                break;
            case 7:
                o.append("July");
                break;
            case 8:
                o.append("August");
                break;
            case 9:
                o.append("September");
                break;    
            case 10:
                o.append("October");
                break;
            case 11:
                o.append("November");
                break;
            case 12:
                o.append("December");
                break;  
            default:
                break;  
        }
        o.append(String.format(" %d %d)", day, year));
        return String.valueOf(o);
    }
    boolean before(Date other){
        if(year > other.getYear()){
            return false;
        }
        if(year == other.getYear()){
            if(month > other.getMonth()){
                return false;
            }
            if(month == other.getMonth()){
                if(day > other.getDay()){
                    return false;
                }
            }
        }
        return true;
    }
    Date valueOf(String d) throws IllegalArgumentException{
        try{
            int day = Integer.valueOf(d.substring(0, d.indexOf(":")));
            int month = Integer.valueOf(d.substring(d.indexOf(":")+1, d.lastIndexOf(":")));
            int year = Integer.valueOf(d.substring(d.lastIndexOf(":"), d.length()));
            if(isValid(day, month, year)){
                return new Date(month, day, year);
            }
            throw new IllegalArgumentException("Invalid Date");
        } catch (Exception e){
            throw new IllegalArgumentException("Invalid Format");
        }
    }
    boolean isValid(String d) throws IllegalArgumentException{
        try{
            int day = Integer.valueOf(d.substring(0, d.indexOf(":")));
            int month = Integer.valueOf(d.substring(d.indexOf(":")+1, d.lastIndexOf(":")));
            int year = Integer.valueOf(d.substring(d.lastIndexOf(":"), d.length()));
            if(!isValid(day, month, year)){
                return false;
            }
            return true;
        } catch (Exception e){
            throw new IllegalArgumentException("Invalid Format");
        }
    }
}
