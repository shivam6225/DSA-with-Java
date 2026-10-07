package BackTracking;

import java.util.ArrayList;

public class MazeProblem {

    public static void main(String[] args) {

        System.out.println("Number of Ways to find target in Maze " + mazeCount(4, 3));

        mazePrint("", 3, 3);
        System.out.println();
        System.out.println("Number of Ways to find target in Maze :" + mazeWays("", 3, 3));

        System.out.println("Number of Ways to target in Maze (V,H,D): " + mazeWaysDiagonal("", 3, 3));
    }

    //Count the ways to reach target in Maze
    static int mazeCount(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        int left = mazeCount(row - 1, col);
        int right = mazeCount(row, col - 1);

        return left + right;
    }

    //Find the path for the Maze Ways
    static ArrayList<String> mazeWays(String p, int row, int col) {

        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1) {
            list.addAll(mazeWays(p + 'D', row - 1, col));
        }
        if (col > 1) {
            list.addAll((mazeWays(p + 'R', row, col - 1)));
        }

        return list;
    }


    //Print the path for the Maze Ways
    static void mazePrint(String p, int row, int col) {

        if (row == 1 && col == 1) {
            System.out.print(p + " ");
        }

        if (row > 1) {
            mazePrint(p + 'D', row - 1, col);
        }
        if (col > 1) {
            mazePrint(p + 'R', row, col - 1);
        }

    }

    //Find the path for the Maze Ways D , R and Diagonal
    static ArrayList<String> mazeWaysDiagonal(String p, int row, int col) {

        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1) {
            list.addAll(mazeWaysDiagonal(p + 'V', row - 1, col));
        }
        if (col > 1) {
            list.addAll((mazeWaysDiagonal(p + 'H', row, col - 1)));
        }

        if (row > 1 && col > 1) {
            list.addAll((mazeWaysDiagonal(p + 'D', row - 1, col - 1)));
        }

        return list;
    }


}
