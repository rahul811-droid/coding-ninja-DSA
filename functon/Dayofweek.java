package functon;

import java.time.temporal.WeekFields;

public class Dayofweek {
public static void  returnDay(int num ,String weekDay[]) {
	
	 if(num<1 || num>7){
		    System.out.println("null") ;

		  }else {
			    System.out.println(weekDay[num]) ;
		  }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String weekDay[]= {"Sunday","Monday","Tuesday","Wednesday",
				"Thursday","Friday","Saturday"};
		returnDay(0,weekDay );
	}

}
