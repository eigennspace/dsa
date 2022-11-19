public class TimeConversion {
    public static String timeConversion(String s){
       String timeCondition = s.substring(s.length()-2,s.length()-1).toUpperCase();
       int hours = Integer.parseInt(s.substring(0,2));

       String minutes = s.substring(3,5);
       String seconds = s.substring(6,8);
       String hour = String.valueOf(hours);
       if (hour.length() == 1){
           hour = "0"+hour;
       }

       if (timeCondition.equals("P") && hours !=12){
           hours += 12;
           return hours + ":" + minutes + ":" + seconds;
       }

       if (timeCondition.equals("A") && hours == 12){
           return "00" + ":" + minutes + ":" + seconds;
       } else {
           return hour + ":" + minutes + ":" + seconds;
       }
    }

    public static void main(String[] args) {
        String time = "07:05:45PM";
        String conversion = timeConversion(time);

        System.out.println(conversion);
    }
}