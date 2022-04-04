package Dem_so_lan_xuat_hien_cua_tu;

import java.util.Locale;
import java.util.Scanner;

public class TreeMap {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String[] mWord = input.nextLine().toLowerCase().split(" ");
        System.out.println("Nhập key: ");
        String key = input.nextLine();
        System.out.println("check key ====== " + key);
        for (int i = 0; i < mWord.length; i++) {
            System.out.println("check mWord ========== " + mWord[i]);
            if (key.equals(mWord[i])) {
                count++;
            }
        }
        System.out.println("Key: " + key + " xuất hiện " + count + " lần");
    }
}
