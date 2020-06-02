package com.jungle.JianZhiOffer;

public class 孩子们的游戏圆圈中最后剩下的数 {
    private boolean[] visited;
    private int allChildren;
    // 淘汰人数
    private int outNum;
    private int res;

    public int LastRemaining_Solution(int n, int m) {

        if (n <= 0) {
            return -1;
        }
        visited = new boolean[n];
        allChildren = n;
        res = 0;
        outNum = 0;
        luckyChild(m, 0);
        return res;
    }

    /**
     * 从当前index开始数起，第m的人
     */
    private void luckyChild(int m, int index) {
        System.out.println("index="+index);
        // 递归终止条件
        if (outNum == allChildren) {
            res = index - 1;
            return;
        }

        index = (index - 1) % allChildren;
        for (int i = 0; i < m; i++) {
            // 先判断该儿童是否被淘汰
            int curindex = (index + 1) % allChildren;

            while (visited[curindex]) {
                curindex++;
                curindex = curindex%allChildren;
            }
            index = curindex;
        }

        visited[index] = true;
        outNum++;
//        System.out.println(JSON.toJSONString(visited));
        System.out.println("踢出去了"+outNum+"人");

        System.out.println("index="+index);
        System.out.println("=================================");
        luckyChild(m, ((index + 1) % allChildren));

    }
}
