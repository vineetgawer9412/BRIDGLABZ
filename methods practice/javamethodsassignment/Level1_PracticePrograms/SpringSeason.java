public class SpringSeason {
    public static boolean isSpring(int month, int day) {
        if(month < 3 || month > 6) return false;
        if(month == 3 && day < 20) return false;
        if(month == 6 && day > 20) return false;
        return true;
    }
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        if(isSpring(month, day)) System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");
    }
}