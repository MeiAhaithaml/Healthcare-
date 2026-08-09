package JavaBasic.ToanTuAndDieuKien;

public class Logic {
   static int a = 8;
    static int b=10;
    static int c=9;
    static int number=100;
    public static boolean ToanTu(){
        if (a==10){
            return true;
        }
        else if ((a>b)&&(a>c)) {
            return true;
        }
        else if((b>c)||(b>a)){
            return true;
        }
        else {
            return false;
        }
    }
    public static void ToanTuIf(int n)
    {
        if (n==number)
        {
            System.out.println(n + " bang 100");
        } else if (n<number) {
            System.out.println(n + " nho hon 100");
        } else if (n>number) {
            System.out.println(n + " lon hon 100");
        } else {
            System.out.println("Nhap sai gia tr");
        }
    }

    public static void main(String[] args) {
        System.out.println(ToanTu());
        ToanTuIf(60);
    }
}
