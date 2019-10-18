package Labsession2;

import java.util.Scanner;

public class SoNguyenTo {
    private int a;
    public static boolean isSoNguyenTo(int x) {
        for (int i = 2; i < x/2; i++) {
            if (x%i == 0) return false;
        }
        return true;
    }
    public static void timSoNguyenToTiepTheo(int x){
        for(int i=x+1;;i++){
            if (isSoNguyenTo(i)){
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String args[]){
        int a;
        System.out.println("Nhap so a can kiem tra: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if(isSoNguyenTo(a)){
            System.out.println(a + "la so nguyen to");
        }
        else {
            System.out.println(a + "khong phai la so nguyen to");
        }
        System.out.println("So nguyen to gan nhat sau "+ a + " la: ");
        timSoNguyenToTiepTheo(a);
    }
}