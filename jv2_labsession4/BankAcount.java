package jv2_labsession4;

public class BankAcount {
    public int acount =0;

    public synchronized void moTaiKhoan(){
        acount = 10;
        System.out.println("Mo tai khoan thanh cong : ");
        try {
            notifyAll();
        }catch (Exception e){

        }
    }

    public synchronized void napTien(){
        if (acount==0){
            try {
                wait();
            }catch (Exception e ){

            }
        }
        System.out.println("nap tien vao tai khoan: "+acount);
    }

    public synchronized void doiMatKhau(){
        if (acount==0){
            try {
                wait();
            }catch (Exception e ){

            }
        }
        System.out.println("Doi mat khau cho tia khoan: "+acount);
    }

    public synchronized void lamTheATM(){
        if (acount==0){
            try {
                wait();
            }catch (Exception e ){

            }
        }
        System.out.println("Lam ATM cho tai khoan: "+acount);
    }
}