public class PatternService {

    public static boolean detectSOS(String gesture) {

        if (gesture.equalsIgnoreCase("wave")) {
            return true;
        }

        return false;
    }
}