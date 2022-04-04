package Dao_nguoc_phan_tu;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String[] mWord = input.nextLine().split(" ");
        for (int i = mWord.length-1; i >= 0; i--) {
            System.out.print(wStack.push(mWord[i]) + " ");
        }

    }
}
