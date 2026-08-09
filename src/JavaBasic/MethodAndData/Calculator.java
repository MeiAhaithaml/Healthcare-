package JavaBasic.MethodAndData;

public class Calculator {
    public static int tong(int a, int b){
      return a+b;
    }
    public static float tich(float a, float b){
        return a*b;
    }

    public static void main(String[] args) {
     int ketQuaTong =   tong(10,20);
     float ketQuaTich=  tich(2,5);
     System.out.println("Ket qua cua tong la: "+ ketQuaTong );
     System.out.println("Ket qua cua tich la: "+ ketQuaTich );

    }
}
