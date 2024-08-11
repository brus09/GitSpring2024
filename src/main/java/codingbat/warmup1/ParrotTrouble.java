package Codingbat.warmup1;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        return  talking && (hour < 7 || hour > 20 )? true: false;

  /*if (talking && (hour < 7 || hour > 20 )) {
    return true;
  } return false;*/
    }
}
