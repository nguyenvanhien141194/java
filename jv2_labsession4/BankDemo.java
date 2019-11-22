package jv2_labsession4;

public class BankDemo {

    public static void main(String[] args) {
        BankAcount b = new BankAcount();

        new Thread(()->{
            b.lamTheATM();
        }).start();
        new Thread(()->{
            b.doiMatKhau();
        }).start();
        new Thread(()->{
            b.napTien();
        }).start();
        new Thread(()->{
            b.moTaiKhoan();
        }).start();
    }

}