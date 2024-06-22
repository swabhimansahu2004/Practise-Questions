import java.util.*;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class AD_12_Interval_Partitionng {
    public static int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0)
            return 0;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a.start));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(intervals[0].end); 

        for (int i = 1; i < intervals.length; i++) {
           
            if (intervals[i].start >= minHeap.peek()) {
                minHeap.poll(); 
            }
            minHeap.offer(intervals[i].end); 
        }
        return minHeap.size();
    }

    public static void main(String[] args) {
        Interval[] intervals = {
        		 new Interval(0, 30),
                 new Interval(5, 10),
                 new Interval(15, 20),
                 new Interval(20, 25),
                 new Interval(22, 28),
                 new Interval(27, 35),
                 new Interval(40, 45),
                 new Interval(50, 55),
                 new Interval(60, 65),
                 new Interval(70, 75)
        };
        System.out.println("Minimum number of meeting rooms required: " + minMeetingRooms(intervals));
    }
}