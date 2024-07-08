public class Bai3_StringApp {
    public String UpperCaseToString(String mainString) {
        return mainString.toUpperCase();
    }

    public static void main(String[] args) {
        Bai3_StringApp stringApp = new Bai3_StringApp();
        String upperStr = stringApp.UpperCaseToString("Hello welcome to the world of Java");
        System.out.println("Chuoi duoc in hoa: " + upperStr);
    }
}
