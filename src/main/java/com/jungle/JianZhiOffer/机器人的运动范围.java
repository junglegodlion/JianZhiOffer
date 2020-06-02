package com.jungle.JianZhiOffer;

public class 机器人的运动范围 {
    // 存放结果
    private int res;
    private int[][] dir ={{0,-1},{0,1},{-1,0},{1,0}};

    // 行
    private int m;

    // 列
    private int n;
    private int maxValue;
    private boolean[][] visited;
    public int movingCount(int threshold, int rows, int cols)
    {

        visited = new boolean[rows][cols];
        m = rows;
        n = cols;
        maxValue = threshold;
        if (threshold < 0) {
            return 0;
        }
        res++;
        visited[0][0] = true;
        move(0,0);
        return res;

    }

    private void move(int x, int y) {



        for (int i = 0; i < 4; i++) {
            int newX = x + dir[i][0];
            int newY = y + dir[i][1];

            // 1.判断是否出界
            // 2.判断是否大于指定值
            // 3.未被访问
            if (inArea(newX,newY)&&!isLarge(newX,newY)&&!visited[newX][newY]) {

                res++;
                visited[newX][newY] = true;
                move(newX,newY);
            }



        }

    }

    /**
     *判断是否出界
     */
    private boolean inArea(int x,int y) {
        return x>=0&&x<m&&y>=0&&y<n;
    }

    /**
     * 判断是否大于指定值
     * */
    private boolean isLarge(int x,int y) {
        int s=0;
        char[] char1 = String.valueOf(x).toCharArray();
        char[] char2 = String.valueOf(y).toCharArray();
        for (char c : char1) {
            s = s + Integer.valueOf(c+"");
        }
        for (char c : char2) {
            s = s + Integer.valueOf(c+"");
        }
        return s>maxValue;
    }
}
