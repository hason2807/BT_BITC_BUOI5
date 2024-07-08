public class Bai4_StringApp {
    public boolean isPalindrome(String mainString) {
        // Loại bỏ khoảng trắng và chuyển đổi thành chữ thường
        String cleaned = mainString.replaceAll("\\s+", "").toLowerCase();
        
        int left = 0;
        int right = cleaned.length() - 1;
        
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    public static void main(String[] args) {
        Bai4_StringApp stringApp = new Bai4_StringApp();
        
        String test1 = "radar";
        String test2 = "BITC";
        
        System.out.println("Chuoi : " + test1 + (stringApp.isPalindrome(test1) ? " la chuoi doi xung" : " khong phai chuoi doi xung"));
        System.out.println("Chuoi : " + test2 + (stringApp.isPalindrome(test2) ? " la chuoi doi xung" : " khong phai chuoi doi xung"));
}
}

