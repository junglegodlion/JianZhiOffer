package com.jungle.JianZhiOffer;

public class 矩阵中的路径 {

    private int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}};
    private boolean[][] visited;
    private char[] mat;
    // 长
    private int m;
    // 宽
    private int n;

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {

        m = rows;
        n = cols;
        visited = new boolean[m][n];
        mat = matrix;

        if (matrix.length<str.length) {
            return false;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i+":"+j);
                if (findPath(0,i,j,str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean findPath(int index, int i, int j, char[] str) {

        if (index==str.length-1) {
            return str[index]==mat[i*n+j];
        }

        if (str[index]==mat[i*n+j]) {
            visited[i][j] = true;
            for (int k = 0; k < 4; k++) {
                int nextX = i + dir[k][0];
                int nextY = j + dir[k][1];
                System.out.println(nextX+";"+nextY);
                if (inArea(nextX,nextY)&&!visited[nextX][nextY]&&findPath(index+1,nextX,nextY,str)) {
                    return true;
                }

            }
            visited[i][j] = false;
        }

        return false;
    }
    private boolean inArea(int i,int j) {
        return i>=0&&i<m&&j>=0&&j<n;
    }
}
