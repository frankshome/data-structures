package com.xuhu.ds.recursion;

public class MiGong {

    public static void main(String[] args) {


        int[][] map = new int[8][7];
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;
        map[1][2] = 1;
        map[2][4] = 1;
        map[3][4] = 1;
        map[4][5] = 1;
//        map[2][2] = 1;



        System.out.println("迷宫~");
        printMap(map);


        System.out.println("开始走迷宫~");
        setWay(map, 1, 1);
        printMap(map);

    }


    /**
     * 迷宫路径
     * 0，此路未走过
     * 1，墙 无法走
     * 2，可以通行
     * 3，此路不通
     * @param map 迷宫地图 使用的策略为 右 下 左 上
     * @param i 行
     * @param j 列
     * @return 是否总的通
     */
    private static boolean setWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        }

        if (map[i][j] == 0) {
            // 默认为2
            map[i][j] = 2;
            if (setWay(map, i, j + 1)) {
                return true;
            }

            if (setWay(map, i + 1, j)) {
                return true;
            }

            if (setWay(map, i, j - 1)) {
                return true;
            }

            if (setWay(map, i - 1, j)) {
                return true;
            }

            map[i][j] = 3;
            return false;

        }else{
            return false;
        }
    }

    private static void printMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j : map[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
