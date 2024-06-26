import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        ArrayList<SINHVIEN> listSv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("CHUONG TRINH QUAN LÝ SINH VIEN");
            System.out.println("------------------------------");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Lưu tệp");
            System.out.println("3. Hiển thị");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Sửa bản ghi");
            System.out.println("6. Xóa bản ghi");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose){
                case 1:
                    main.nhap(sc, listSv);
                    break;
                case 2:
                    main.luuTep(listSv);
                    break;
                case 3:
                    main.HienThi();
                    break;
                case 4:
                    main.timKiem(sc, listSv);
                    break;
                case 5:
                    break;
                case 6:
                    main.xoa(sc, listSv);
                    break;
                case 7:
                    break;
                default:
                    break;
            }
        } while(choose != 7);
    }

    public void nhap(Scanner sc, ArrayList<SINHVIEN> list){
        System.out.print("Nhập số lượng sinh viên muốn thêm: ");
        int count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.print("--Nhập họ tên sinh viên: ");
            String hoten = sc.nextLine();
            System.out.print("Nhập ngày sinh: ");
            String ngaySinh = sc.nextLine();
            System.out.println("Nhập giới tính: ");
            String gioiTinh = sc.nextLine();
            System.out.println("Nhập CCCD: ");
            long CCCD = Long.parseLong(sc.nextLine());
            System.out.println("Nhập mã sinh viên: ");
            int maSV = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập ngành nghề: ");
            String nganhNghe = sc.nextLine();
            SINHVIEN sv = new SINHVIEN(hoten, ngaySinh, gioiTinh, CCCD, maSV, nganhNghe);
            String[] taiKhoan = sv.nhapTaiKhoan();
            sv.setTenTk(taiKhoan[0]);
            sv.setMatKhau(taiKhoan[1]);
            list.add(sv);
        }
    }

    public void luuTep(ArrayList<SINHVIEN> list){
        DAOSinhVien.ghiFile("SinhVien.dat", list);
    }

    public void HienThi(){
        ArrayList<SINHVIEN> list = DAOSinhVien.docFile("SinhVien.dat");
        for (SINHVIEN sv : list){
            System.out.println(sv.toString());
        }
    }

    public void timKiem(Scanner sc, ArrayList<SINHVIEN> list){
        System.out.println("Nhập mã sinh viên muốn tìm kiếm: ");
        int maSV = Integer.parseInt(sc.nextLine());
        for (SINHVIEN sv : list){
            if (sv.getMaSV() == maSV){
                System.out.println(sv.toString());
                break;
            }
        }
    }

    public void xoa(Scanner sc, ArrayList<SINHVIEN> list){
        System.out.println("Nhập mã sinh viên muốn xóa: ");
        int maSV = Integer.parseInt(sc.nextLine());
        for (SINHVIEN sv : list){
            if (sv.getMaSV() == maSV){
                list.remove(sv);
                break;
            }
        }
        DAOSinhVien.ghiFile("SinhVien.dat", list);
    }

    public void sua(){

    }
}
