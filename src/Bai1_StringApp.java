public class Bai1_StringApp {
    public static void main(String[] args) {
        Bai1_StringApp stringApp = new Bai1_StringApp();
        stringApp.checkSubString("Hello, welcome to the world of Java!", "Java");
    }
    public void checkSubString(String mainString, String subString) {
        if (mainString.contains(subString)) {
            System.out.println("The substring '" + subString + "' is present in the main string.");
        } else {
            System.out.println("The substring '" + subString + "' is not present in the main string.");
        }
    }

} 



   