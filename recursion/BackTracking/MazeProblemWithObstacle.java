package BackTracking;

import java.util.ArrayList;

public class MazeProblemWithObstacle {

    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        System.out.println("Count Number of Ways to cross Maze: "+ mazeCount(arr,0,0));
        System.out.println("Number of Ways to cross Maze: "+ mazeWays("",arr,0,0));

    }

    //Count the ways to reach target in Maze
    static int mazeCount(boolean[][] maze,int row , int col){
        if(row == maze.length-1 || col ==maze[0].length-1){
            return 1;
        }

        if(!maze[row][col]){
            return 0;
        }

        int left = mazeCount(maze,row+1,col);
        int right = mazeCount(maze,row,col+1);

        return left+right;
    }

    //Find the path for the Maze Ways
    static ArrayList<String> mazeWays(String p, boolean[][] maze, int row , int col){

        if ((row==maze.length-1) && (col==maze[0].length-1)){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if(!maze[row][col]){
            return new ArrayList<>();
        }

        ArrayList<String> list = new ArrayList<>();

        if(row<maze.length-1){
            list.addAll(mazeWays(p+'D',maze,row+1,col));
        }
        if(col<maze[0].length-1){
            list.addAll((mazeWays(p+'R',maze,row,col+1)));
        }

        return list;
    }
}
