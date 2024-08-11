package codingbat.string1;

public class FirstTwo {
    public String firstTwo(String str) {
        return str.length() > 1 ? str.substring(0,2) : str;
    }
}
