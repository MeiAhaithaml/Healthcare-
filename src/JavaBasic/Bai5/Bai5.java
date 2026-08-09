package JavaBasic.Bai5;

import java.util.ArrayList;
import java.util.List;

public class Bai5 {
    public static void PrintSoChan(){
        ArrayList<Integer> b= new ArrayList<>();
        for (int i=0;i<25;i++)
        {
            int soChan= i*2;
            System.out.println(soChan);
            b.add(soChan);
        }
        System.out.println("Lap lai mang");
        for (int i:b)
        {
            System.out.print(i + " ");
        }
    }
    public static List<String> Customer(){
        List<String> customer=new ArrayList<>();
        customer.add("Nguyen Van a");
        customer.add("Nu");
        customer.add("150cm");
        customer.add("0123456789");
        customer.add("Hanoi");
    return customer;
    }

    public static void main(String[] args) {
      //  PrintSoChan();
        List<String> thongtin= Customer();

        for (int i =0;i<thongtin.size();i++)
        {
            System.out.println(thongtin.get(i));
        }
    }
}

