import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DAOSinhVien {
    // Phương thức đọc đối tượng từ file
    public static void ghiFile(String fileName, ArrayList<SINHVIEN> danhSachSinhVien) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName, true))) {
            oos.writeObject(danhSachSinhVien);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Phương thức ghi đối tượng vào file, không ghi đè nếu file đã tồn tại
    public static ArrayList<SINHVIEN> docFile(String fileName) {
        ArrayList<SINHVIEN> danhSachSinhVien = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                danhSachSinhVien.addAll((List<SINHVIEN>) ois.readObject());
            }
        } catch (EOFException e) {
            // Đọc đến cuối file
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return danhSachSinhVien;
    }
}
