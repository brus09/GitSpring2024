package Codingbat.warmup1;

public class Diff21 {
    public int diff21(int n) {
        if (n > 21){
            return Math.abs(2*(n - 21));

        }
        return Math.abs(n - 21);
    }
}
