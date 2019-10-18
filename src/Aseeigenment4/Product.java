package Aseeigenment4;

import java.util.Scanner;

public class Product {
    public int id;
    public String ProductName;
    public int qty;
    public double price;
    public Product(){
    }
    public  Product(int id,String ProductName, double price){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void InputInfo (){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id");
        setId(sc.nextInt());
        System.out.println("nhap productName");
        setProductName(sc.nextLine());
        System.out.println("nhap qty");
        setQty(sc.nextInt());
    }
    public void inthongtin(){
        System.out.println("id:"+id);
        System.out.println("qty:"+qty);
        System.out.println("price:"+price);
    }
}
