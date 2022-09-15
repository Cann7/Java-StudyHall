package Week13;

public class InterviewHomework {

    public static void main(String[] args) {
        System.out.println("addMinutes(\"9:10 AM\", 200) = " + addMinutes("9:10 AM", 200));
    }


 /*
		 * 1)As a user I want to add a number of minutes to a time represented as a String.
Without using any built-in date or time functions, write a function or method that accepts two
mandatory arguments along with tests to verify functionality.
The first argument of the function is a 12-hour time string with the format [H]H:MM {AM|PM}
and the second argument is a signed integer indicating the number of minutes to add to the time
given in the first argument.
The return value should be a string of the same format as the first argument. For example,
AddMinutes(9:10 AM, 200) would return 12:30 PM
PS --> This is an actual Interview Question for Senior Level, We can solve this together later on.
*
It is a hard question, If you can not do it, do not have disappointment. It took me a little time to come up with the solution.
There are different ways to do it, The way I did was (using Character.isDigit) for the string.
		 */

        public static String addMinutes(String time, int minutes){

            int addHour = 200 / 60;
            int addMinute = 200 % 60;
            String firstTime = time.split(" ")[0];
            String amPm = time.split(" ")[1];
            //System.out.println(firstTime);
            int firstTimeHour =Integer.parseInt(firstTime.split(":")[0]);
            int firstTimeMinute =Integer.parseInt(firstTime.split(":")[1]);

            int lastHour = firstTimeHour + addHour;
            int lastMinute = firstTimeMinute + addMinute;


            if(lastMinute>60)
            {
                lastMinute -= 60;
                lastHour++;
            }

            if(lastHour>=12)
            {


                if(lastHour ==12)
                {
                    lastHour = 12;
                }else
                {
                    lastHour -= 12;
                }


                if(amPm.equals("AM"))
                {
                    amPm = "PM";
                }
                else
                {
                    amPm = "AM";
                }

            }


            String temp = lastHour+ ":"+lastMinute + " " + amPm;


            return temp;

        }
}
