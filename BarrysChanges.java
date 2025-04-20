import java.time.LocalTime;

public class BarrysChanges {
    public static void main(String[] args) {
        LocalTime myObj = LocalTime.now();
        int time1 = myObj.getMinute();
        System.out.println(time1);
    }
}