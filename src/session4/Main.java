package session4;

import Labsession3.PhanSo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add("xin chào");
        arrayList.add(1,4);

        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        ArrayList arr2 = new ArrayList();
        arr2.add(18);

        System.out.println("mảng thứ 2");
        arr2.addAll(arrayList);
        for (int i=0;i<arrayList.size();i++) {
            System.out.println(arr2.get(i));
        }

        PhanSo ps = new PhanSo();
        arr2.add(ps);

        ArrayList<PhanSo> psList = new ArrayList<>();
        psList.add(ps);
        psList.add(new PhanSo());
        for (PhanSo p : psList){
            p.inputInfo();
        }
        for (PhanSo p: psList){
            p.InPhanSo();
        }

    }

}