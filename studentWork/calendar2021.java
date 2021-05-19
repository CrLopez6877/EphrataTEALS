package calendar2021;

public class calendar2021 { 

    public static void main(String []args) {
        String[] daysOfTheWeek=new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday`"};
        String[] Monthk=new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 

        int dayOfWeek  = 5;
        int year = 2021;
        int y = 0;
        for (String x: months) {

            for (int z = 1; z <= daysInMonth[y]; z++){
                System.out.println(daysOfTheWeek[dayOfWeek] + " " + x + " " + z);
                if(dayOfWeek == 6) {
                    dayOfWeek = 0;
                } else {
                    dayofWeek = dayOfWeek + 1;
                }
            }
            y = y + 1;

            }
        }


    }
}