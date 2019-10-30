package practical;

import java.util.Scanner;

public class Hotel {
    public String name;
    public String location;
    public String ownerName;

    public Hotel() {
    }

    public Hotel(String name, String location, String ownerName) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Thong Tin:");
        System.out.println("Nhap Ten:");
            setName(sc.nextLine());
            System.out.println("Nhap Dia chi:");
            setLocation(sc.nextLine());
            System.out.println("Nhap Chu So huu:");
            setOwnerName(sc.nextLine());

    }
    public void showInfo(){
        System.out.println("Ten"+this.name);
        System.out.println("Dia Chi"+this.location);
        System.out.println("Ten Chu So Huu"+this.ownerName);

    }
}
