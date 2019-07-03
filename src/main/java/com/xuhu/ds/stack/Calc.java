package com.xuhu.ds.stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Calc {

    private static Map<Character, Integer> operMap = new HashMap<>(8);
    static {
        operMap.put('+', 0);
        operMap.put('-', 0);
        operMap.put('*', 1);
        operMap.put('/', 1);
    }

    public static void main(String[] args) {
        ArrayStack<Integer> numsStack = new ArrayStack<>(Integer.class, 10);
        ArrayStack<Character> opersStack = new ArrayStack<>(Character.class, 10);

        String expression = "3+2*6-2";

        String keepNum = "";
        int expLen = expression.length();
        for (int i = 0; i < expLen; i++) {
            char c = expression.charAt(i);
            if (isOper(c)) {
                if (opersStack.isEmpty()) {
                    opersStack.push(c);
                    continue;
                }
                // 开始计算优先级
                if (operMap.get(c) > operMap.get(opersStack.peek())) {
                    opersStack.push(c);
                    continue;
                }

                Integer num1 = numsStack.pop();
                Integer num2 = numsStack.pop();

                Character oper = opersStack.pop();

                int ret = calc(num2, num1, oper);

                numsStack.push(ret);
                opersStack.push(c);


            } else {
                keepNum += c;
                if (i < expLen - 1) {
                    if (!isOper(expression.charAt(i + 1))) {
                        continue;
                    }
                }

                numsStack.push(Integer.valueOf(keepNum));
                keepNum = "";
            }
        }

        if (opersStack.isEmpty()) {
            System.out.println(numsStack.pop());
            return;
        }

        while (!opersStack.isEmpty()) {
            Character oper = opersStack.pop();
            Integer num1 = numsStack.pop();
            Integer num2 = numsStack.pop();

            int ret = calc(num1, num2, oper);
            numsStack.push(ret);
        }

        System.out.println(numsStack.pop());




    }

    private static int calc(int num1, int num2, Character oper) {
        int ret = 0;
        switch (oper) {
            case '+':
                ret = num2 + num1;
                break;
            case '-':
                ret = num2 - num1;
                break;
            case '*':
                ret = num2 * num1;
                break;
            case '/':
                ret = num2 / num1;
                break;
            default:
                break;
        }
        return ret;
    }

    private static boolean isOper(Character c) {
        return operMap.containsKey(c);
    }

    private static int getPriority(Character oper){
        return operMap.get(oper);
    }


}
