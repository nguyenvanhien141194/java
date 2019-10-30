package practical;

import java.util.ArrayList;

public class LisHotel {
    public ArrayList<Hotel> list =new ArrayList<>();
    Hotel h = new Hotel();
    public void newHotel(){
        h.inputInfo();
        list.add(h);

    }
    public void showInfo(){
        System.out.println(list);
    }
}
