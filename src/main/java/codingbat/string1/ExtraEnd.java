package codingbat.string1;

public class ExtraEnd {
    public String extraEnd(String str) {
        str.substring(str.length() - 2);
        String result = str.substring(str.length() - 2);
        return result + result + result;
    }
}
