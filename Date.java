public class Date{

 int day;
 int month;
 int year;


Date(int day, int month, int year){
this.day=day;
this.month=month;
this.year=year;
}



public String toString(){
return String.format("%d-%d-%d",day,month,year);
}
}