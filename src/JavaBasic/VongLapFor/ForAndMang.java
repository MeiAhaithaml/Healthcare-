package JavaBasic.VongLapFor;

import java.util.ArrayList;

public class ForAndMang {
    public static void PrintSoChan(){
        int b[]=new int[25];
        for (int i=0;i<25;i++)
        {
            int soChan= i*2;
            System.out.println(soChan);
           // b[i]=soChan;
        }
        System.out.println("Lap lai mang");
        for (int i:b)
        {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        PrintSoChan();
    }
}
