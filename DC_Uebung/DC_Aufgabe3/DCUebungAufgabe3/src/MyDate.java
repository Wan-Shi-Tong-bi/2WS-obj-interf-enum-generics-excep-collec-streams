
public class MyDate {
    private int day;
    private String month;
    private int year;

    public MyDate(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String formatDate(){
        return getDay() + ". " + getMonth() + " " + getYear();
    }
    
    public void addDays(int days){
        int alldays = days + getDay() + monthtodays(getMonth()) + getYear()* 365;
        setYear((int)alldays/365);
        setMonth(daytomonth(alldays-(getYear()*365)));
        setDay(alldays - monthtodays(getMonth()) - getYear()*365);
        
    }
    
    public void addMonths(int monthsd){
        int h = 0;
        switch(getMonth()){
            case "Jaenner":
                h = 1;
                break;
            case "Februar":
                h = 2;
                break;
            case "Maerz":
                h = 3;
                break;
            case "April":
                h = 4;
                break;
            case "Mai":
                h = 5;
                break;
            case "Juni":
                h = 6;
                break;
            case "Juli":
                h = 7;
                break;
            case "August":
                h = 8;
                break;
            case "September":
                h = 9;
                break;
            case "Oktober":
                h = 10;
                break;
            case "November":
                h = 11;
                break;
            case "Dezember":
                h = 12;
                break;
        }
        int months = h + monthsd;
        if(months%12 == 1)
            setMonth("Jaenner");
        else if(months%12 == 2)
            setMonth("Februar");
        else if(months%12 == 3)
            setMonth("Maerz");
        else if(months%12 == 4)
            setMonth("April");
        else if(months%12 == 5)
            setMonth("Mai");
        else if(months%12 == 6)
            setMonth("Juni");
        else if(months%12 == 7)
            setMonth("Juli");
        else if(months%12 == 8)
            setMonth("August");
        else if(months%12 == 9)
            setMonth("September");
        else if(months%12 == 10)
            setMonth("Oktober");
        else if(months%12 == 11)
            setMonth("November");
        else if(months%12 == 0)
            setMonth("Dezember");
    }
    
    public void addYear(int years){
        setYear(getYear() + years);
    }
    
    public int getDaysInYear(){
        int sj = 0;
        if(getYear()%4 == 0 && getYear()%100 != 0)
            sj = 1;
   
        
        int days = getDay() + monthtodays(getMonth()) + sj;
        return days;
    }
    
    public int monthtodays(String m){
        switch(m){
            case "Jaenner":
                return 0;
            case "Februar":
                return 31;
            case "Maerz":
                return 59;
            case "April":
                return 90;
            case "Mai":
                return 120;
            case "Juni":
                return 151;
            case "Juli":
                return 181;
            case "August":
                return 212;
            case "September":
                return 243;    
            case "Oktober":
                return 273;    
            case "November":
                return 304;   
            case "Dezember":
                return 334;   
        }
        return 0;
    }
    
    public String daytomonth(int days){
        if(days < 32)
            return "Jaenner";
        else if(days < 60)
            return "Februar";
        else if(days < 91)
            return "Maerz";
        else if(days < 121)
            return "April";
        else if(days < 152)
            return "Mai";
        else if(days < 182)
            return "Juni";
        else if(days < 213)
            return "Juli";
        else if(days < 244)
            return "August";
        else if(days < 274)
            return "September";
        else if(days < 305)
            return "Oktober";
        else if(days < 335)
            return "November";
        else if(days < 366)
            return "Dezember";
        return "";
    }
        
            
    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
    
}
