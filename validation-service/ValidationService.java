public class ValidationService {

    public static boolean isValidGesture(String gesture) {
        return gesture.equalsIgnoreCase("wave") ||
               gesture.equalsIgnoreCase("help") ||
               gesture.equalsIgnoreCase("stop");
    }
}