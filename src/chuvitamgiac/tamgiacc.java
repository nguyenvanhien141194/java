package chuvitamgiac;

public class tamgiacc {
    public int canh1;
    public int canh2;
    public int canh3;
    public int chuvi;
    public double dientich;


    public tamgiacc() {
    }

    public tamgiacc(int canh1, int canh2, int canh3, int chuvi, double dientich) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
        this.chuvi = chuvi;
        this.dientich = dientich;
    }

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh3 = canh3;
    }

    public int chuvi(){
        return  getCanh1()+getCanh2()+getCanh3();

    }



}
