package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeAllPaths {

    public static void main(String[] args) {
        boolean[][] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        System.out.println("Count Number of Ways to cross Maze: "+ mazeAllPathCount(arr,0,0));

        System.out.println("Number of Ways to cross Maze: "+ mazeAllPaths("",arr,0,0));

        int[][] path = new int[arr.length][arr[0].length];

        System.out.println("Number of Ways to cross Maze: "+ mazeAllPathsMatrix("",arr,0,0,
                path,1));

    }

    //Count the ways to reach target in Maze
    static int mazeAllPathCount(boolean[][] maze,int row , int col){
        if(row == maze.length-1 && col == maze[0].length-1){
            return 1;
        }

        if(!maze[row][col]){
            return 0;
        }

        maze[row][col]=false;
        int left=0;
        int up =0;
        int down =0;
        int right =0;

        if(row<maze.length-1)
            down = mazeAllPathCount(maze,row+1,col);
        if(col<maze[0].length-1)
            right = mazeAllPathCount(maze,row,col+1);
        if(row>0)
            left = mazeAllPathCount(maze,row-1,col);
        if(col>0)
            up = mazeAllPathCount(maze,row,col-1);
        maze[row][col]=true;

        return left+right+down+up;
    }

    //Find the path for the Maze Ways
    static ArrayList<String> mazeAllPaths(String p, boolean[][] maze, int row , int col){

        if ((row==maze.length-1) && (col==maze[0].length-1)){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if(!maze[row][col]){
            return new ArrayList<>();
        }

        ArrayList<String> list = new ArrayList<>();

        //I am considering the maze to be blocked
        maze[row][col]=false;

        if(row<maze.length-1){
            list.addAll(mazeAllPaths(p+'D',maze,row+1,col));
        }
        if(col<maze[0].length-1){
            list.addAll((mazeAllPaths(p+'R',maze,row,col+1)));
        }
        if(row>0){
            list.addAll(mazeAllPaths(p+'U',maze,row-1,col));
        }
        if(col>0){
            list.addAll((mazeAllPaths(p+'L',maze,row,col-1)));
        }

        //Remove the changes to the block
        maze[row][col]=true;

        return list;
    }

    //Find the path for the Maze Ways
    static ArrayList<String> mazeAllPathsMatrix(String p, boolean[][] maze, int row , int col , int[][] path ,int step){

        if ((row==maze.length-1) && (col==maze[0].length-1)){
            path[row][col] = step;
            System.out.println(p);
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if(!maze[row][col]){
            return new ArrayList<>();
        }

        ArrayList<String> list = new ArrayList<>();

        //I am considering the maze to be blocked
        maze[row][col]=false;
        path[row][col]=step;
        if(row<maze.length-1){
            list.addAll(mazeAllPathsMatrix(p+'D',maze,row+1,col,path,step+1));
        }
        if(col<maze[0].length-1){
            list.addAll((mazeAllPathsMatrix(p+'R',maze,row,col+1,path,step+1)));
        }
        if(row>0){
            list.addAll(mazeAllPathsMatrix(p+'U',maze,row-1,col,path,step+1));
        }
        if(col>0){
            list.addAll((mazeAllPathsMatrix(p+'L',maze,row,col-1,path,step+1)));
        }

        //Remove the changes to the block
        maze[row][col]=true;
        path[row][col]=0;

        return list;
    }

}
