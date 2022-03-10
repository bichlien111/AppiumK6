package lab_06;
public class lab_61 {
    /* Given input string: "2hrs and 5 minutes"
     * Please calculate how many minutes in total
     * */
    public static void main(String[] args) {
        String timeString = "2hrs and 5 minutes";
        String onlyNumberString = timeString.replaceAll("[^0-9]", "");

        String hourString = onlyNumberString.substring(0,1);
        String minString = onlyNumberString.substring(1,2);

        int totalMinutes = 0;
        totalMinutes = Integer.parseInt(hourString) * 60 + Integer.parseInt(minString);
        System.out.println(totalMinutes);
    }
}
