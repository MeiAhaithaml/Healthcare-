package JavaBasic.Variable;

public class SinhVien {
    String name;
    static String lop="A32";
    public static void MaSinhVien(){
        int msv = 123456;
        System.out.println(msv);
    }

    public static void main(String[] args) {
        SinhVien sinhVien=new SinhVien();
        sinhVien.name = "Nguyen Van A";
        System.out.println(sinhVien.name);
        System.out.println(lop);
        MaSinhVien();
        System.out.println(ThongTin.age);
        System.out.println(ThongTin.university);
    }
}
