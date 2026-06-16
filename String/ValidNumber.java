package String;

public class ValidNumber {
    public boolean isNumber(String s) {

        boolean isValid = false;

        String pattern = "[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?";

        if (s.matches(pattern)) {
            isValid = true;
        }
        return isValid;
    }

    public static void main(String[] args) {
        
        String s = "-123.456e789";
        ValidNumber v = new ValidNumber();
        System.out.println(v.isNumber(s));
    }
}

