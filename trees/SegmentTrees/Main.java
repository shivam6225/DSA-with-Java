package SegmentTrees;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};

        Segment segment = new Segment(arr);

        segment.display();

        System.out.println(segment.query(2,6));

        segment.update(3,12);

        segment.display();

        System.out.println(segment.query(2,6));
    }
}
