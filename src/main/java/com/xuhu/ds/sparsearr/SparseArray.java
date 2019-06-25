package com.xuhu.ds.sparsearr;

public class SparseArray {

    public static void main(String[] args) {
        int[][] chessArr = new int[11][11];
        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        System.out.println("棋盘信息~");
        printfArr(chessArr);

        System.out.println("开始生成稀疏数组...");
        // 有效数据的总数
        int count = 0;
        for (int[] row : chessArr) {
            for (int col : row) {
                if (col != 0) {
                    count++;
                    continue;
                }
            }
        }

        int[][] sparseArr = new int[count + 1][3];
        sparseArr[0][0] = chessArr.length;
        sparseArr[0][1] = chessArr[0].length;
        sparseArr[0][2] = count;

        int dataIndex = 0;
        for (int i = 0; i < chessArr.length; i++) {
            for (int j = 0; j < chessArr[i].length; j++) {
                if (chessArr[i][j] != 0) {
                    dataIndex++;
                    sparseArr[dataIndex][0] = i;
                    sparseArr[dataIndex][1] = j;
                    sparseArr[dataIndex][2] = chessArr[i][j];
                    continue;
                }
            }
        }

        System.out.println("打印稀疏数组信息...");
        printfArr(sparseArr);

        System.out.println("从稀疏数组回复棋盘信息...");
        int[] title = sparseArr[0];
        int[][] revertChessArr = new int[title[0]][title[0]];
        for (int i = 1; i <= title[2]; i++) {
            int[] row = sparseArr[i];
            revertChessArr[row[0]][row[1]] = row[2];
        }

        System.out.println("打印恢复后的数组信息...");
        printfArr(revertChessArr);



    }


    private static void printfArr(int[][] arr) {
        for (int[] row : arr) {
            for (int col : row) {
                System.out.printf("%d\t", col);
            }
            System.out.println();
        }
    }

}
