package com.interview.string;

public class Main2 {

    public static int numIslands(String[][] grid) {
        int count = 0 ;
        for(int i = 0 ; i < grid.length ; i++ )
        {
            for(int j = 0 ; j < grid[0].length ;j++){
                if(Integer.parseInt(grid[i][j]) == 1){
                    count += 1;
                    findIsland(grid , i ,j);
                }
            }
        }

        return count;
    }

    private static void findIsland(String[][] grid, int i, int j) {


        if(Integer.parseInt(grid[i][j] )!= 1) {
            return;
        }
            grid[i][j] ="seen";
            //no of call findIsland
            findIsland(grid , i+1,j);
            findIsland(grid , i-1,j);
            findIsland(grid , i,j+1);
            findIsland(grid , i,j-1);



    }

    public static void main(String[] args) {

        String[][] grid = {
                {"1","1","1","1","0"},
                {"1","1","0","1","0"},
                {"1","1","0","0","0"},
                {"0","0","0","0","1"}
        };
        System.out.println(numIslands(grid));
    }
}