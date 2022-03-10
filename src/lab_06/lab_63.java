package lab_06;

public class lab_63 {
    /* String myStr = "100 minutes";
     * NOT using REGEX, extract digit character from that String
     * Expected output: "100".
     * EX: "12345nabc678" -> "12345678"
    * */
    public static void main(String[] args) {
        String myStr = "12345nabc678";
        char [] allMyCharacters = myStr.toCharArray();
        for (char character : allMyCharacters) {
            if(Character.isDigit(character)){
                System.out.printf("%c", character);
            }
        }
    }
}
