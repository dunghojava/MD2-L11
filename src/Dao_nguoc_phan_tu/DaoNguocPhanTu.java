package Dao_nguoc_phan_tu;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTu {
    public static void main(String[] args) {
        Stack<Integer> stackInteger = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array's size: ");
        int size = input.nextInt();
        int[] arrayInt = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter arrayInt[" + i + "]: ");
            arrayInt[i] = input.nextInt();
            stackInteger.push(arrayInt[i]);
        }
        System.out.println("=========" +stackInteger.indexOf(3,0));
        System.out.println("check stack integer ====== " + stackInteger);
        for (int i = 0; i < size; i++) {
            System.out.print(stackInteger.pop() + " ");
        }

    }
}
