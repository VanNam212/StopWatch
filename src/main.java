import java.util.Date;
import java.util.Random;

public class main {
    public static void main(String[] args) throws InterruptedException {

        //init array
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt();
        }

        StopWatch stopWatch = new StopWatch();
        Date start = stopWatch.getStartTime();
        System.out.println("Thoi gian bat dau: " + start);
        //selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        stopWatch.stop();
        Date end = stopWatch.getEndTime();
        System.out.println("Thoi gian ket thuc: " + end);
        System.out.println("Thoi gian thuc hien: " + stopWatch.getElapsedTime(start, end));

    }
}
