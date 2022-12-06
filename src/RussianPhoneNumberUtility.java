public class RussianPhoneNumberUtility {
    String phoneNumber = "+7(9 2496 1 42 61=+bf";

    public static String clearFromSymbols(String phoneNumber) {
        return phoneNumber.replaceAll("[^0-9]", "");
    }

    public static String convertPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 11) {
            if (phoneNumber.charAt(0) == '8' || phoneNumber.charAt(0) == '7') {
                return phoneNumber = "+7" + phoneNumber.substring(1);
            } else {
                return phoneNumber = "wrong country code. use +7";
            }
        } else {
            return phoneNumber = "invalid entry";
        }
    }

    public static String checkOperator(String phoneNumber) {
        String operatorName;
        if (phoneNumber.substring(0, 5).contains("914")) {
            operatorName = "MTC";
        } else if (phoneNumber.substring(0, 5).contains("924")) {
            operatorName = "Megafon";
        } else {
            operatorName = "Unknown operator";
        }
        return operatorName;
    }

}
