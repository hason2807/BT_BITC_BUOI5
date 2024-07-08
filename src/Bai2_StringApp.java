public class Bai2_StringApp {
    public static void main(String[] args) {
        Bai2_StringApp stringApp = new Bai2_StringApp();
        int count = stringApp.CountCharInString("Hello welcome to the world of Java", 'o');
        System.out.println("So lan xuat hien cua ky tu la: " + count);  
    }
    public int CountCharInString(String mainString, char searchChar) {
        int count = 0;
        for (int i = 0; i < mainString.length(); i++) {
            if (mainString.charAt(i) == searchChar) {
                count++;
            }
        }
        return count;
    }
}
