package com.xuhu.ds.recursion;

public class Queue8 {
    int queueNum = 8;
    int[] queueArr = null;

    int count = 0;

    int checkNum = 0;


    public Queue8(int queueNum) {
        this.queueNum = queueNum;
        queueArr = new int[queueNum];
    }

    public static void main(String[] args) {
        Queue8 queue8 = new Queue8(8);
        queue8.setWay(0);
        System.out.printf("共有%d种走法\n", queue8.count);
        System.out.printf("共比较%d次\n", queue8.checkNum);
    }


    private void setWay(int n){
        if (n == queueNum) {
            count++;
            print();
            return;
        }

        for (int i = 0; i < queueNum; i++) {
            queueArr[n] = i;
            if (check(n)) {
                setWay(n + 1);
            }
        }
    }

    private boolean check(int n){
        for (int i = 0; i < n; i++) {
            checkNum++;
            // 同一列 queueArr[n] == queueArr[i]
            if (queueArr[n] == queueArr[i]
                    || Math.abs(n - i) == Math.abs(queueArr[n] - queueArr[i])) {
                // 同一列或者同一对角线 都为不可放置
                return false;
            }
        }
        return true;
    }

    private void print(){
        for (int i : this.queueArr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
