package Labsession5;

import java.util.Scanner;

public class Person {
    public String name;
    public String gioitinh;
    public String ngaysinh;
    public String diachi;

    public Person() {
    }

    public Person(String name, String gioitinh, String ngaysinh, String diachi) {
        this.name = name;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }


    public void inputInfo(){
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap ten:");
        setName(sc.nextLine());
        System.out.println("nhap gioi tinh:");
        setGioitinh(sc.nextLine());
       System.out.println("nhap ngay sinh:");
       setNgaysinh(sc.nextLine());
       System.out.println("nhap dia chi");
       setDiachi(sc.nextLine());
    }
    public void showInfo(){
        System.out.println("name:"+this.name);
        System.out.println("gioitinh:"+this.gioitinh);
        System.out.println("ngaysinh:"+this.ngaysinh);
        System.out.println("diachi:"+this.diachi);
    }
}
