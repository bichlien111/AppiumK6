import java.util.*;

public class lab_05 {
    public static void main(String[] args) {
        /* Create a menu
         * Allow user to input student name and id
         * Find by using ID
         * */
        boolean isContinuing = true;
        while (isContinuing) {
            // Display menu
            System.out.println("==== MENU ====");
            System.out.println("1. Input student info");
            System.out.println("2. Find student by ID");
            System.out.println("0. Exit!");

            // Input option
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose option: ");
            int userInput = scanner.nextInt();

            // Trigger base on user's input
            Map<Integer, String> student = new HashMap<>();
            switch (userInput){
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Student ID: ");
                    int id = Integer.parseInt(scanner1.nextLine());
                    System.out.println("Student Name: ");
                    String name = scanner1.nextLine();
                    break;
                case 2:
                    student.put(111, "Lien");
                    student.put(112, "Ngoc");
                    student.put(113, "Quynh");
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Input ID: ");
                    int id2 = scanner2.nextInt();
                    Set<Integer> allKeys = student.keySet();
//                    Iterator<Map.Entry<Integer, String>> studentIterator = student.entrySet().iterator();
//                    while (studentIterator.hasNext()){
//                        Map.Entry<Integer, String> entry = studentIterator.next();
//                        int entryKey = entry.getKey();
//                        if(entryKey == id2){
//                            System.out.println("It is student: " + student.get(entryKey));
//                        }
//                    }
                    for (Integer key : allKeys) {
                        if (key == id2){
                            System.out.println("Student name is: " + student.get(key));
                        }
                    }
                    break;
                case 0:
                    isContinuing = false;
                    System.out.println("Exit!");
                    break;
            }
        }
    }
}
