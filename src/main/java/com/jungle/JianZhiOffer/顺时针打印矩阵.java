package com.jungle.JianZhiOffer;

import java.util.ArrayList;
import java.util.List;

public class 顺时针打印矩阵 {
    private int[][] dirs = {{-1,0},{0,1},{1,0},{0,-1}};
    private boolean[][] visited;
    private int r, c;
    private List<Integer> list = new ArrayList<>();
    private int [][] matrixing;
    private int count;
    private int num;


    public ArrayList<Integer> printMatrix(int [][] matrix) {

        r = matrix.length;
        c = matrix[0].length;
        matrixing = matrix;
        count = 0;
        num = r*c;
        visited = new boolean[r][c];
        dfs(0,0);
        return (ArrayList<Integer>) list;


    }

    private void dfs(int x, int y){

        visited[x][y] = true;
        list.add(matrixing[x][y]);
        num--;
        if (num == 0) {
            return;
        }
        int nextx = x + dirs[count][0], nexty = y + dirs[count][1];

        while (!inArea(nextx,nexty)||visited[nextx][nexty]) {
            count = (count+1)%4;
            nextx = x + dirs[count][0];
            nexty = y + dirs[count][1];
        }

        dfs(nextx,nexty);

    }

    private boolean inArea(int x, int y){
        return x >= 0 && x < r && y >= 0 && y < c;
    }
}
