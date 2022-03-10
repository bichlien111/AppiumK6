package lab_06;

public class lab_64 {
    /* String url = "https://google.com";
     * Check http OR https; domain name, .com OR .net
    * */
    public static void main(String[] args) {
        String url = "https://google.com";
        
        String sub1 = url.substring(0, 5);
        if (sub1.equals("http")){
            System.out.println("URL is http");
        }
        if (sub1.equals("https")){
            System.out.println("URL is https");
        }

        String sub2 = url.substring(8);
        System.out.println("Domain name is: " + sub2);

        String sub3 = url.substring(14);
        if (sub3.equals(".com")){
            System.out.println("URL is .com");
        }
        if (sub3.equals(".net")){
            System.out.println("URL is .net");
        }
    }
}
