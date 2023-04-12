public class HocSinhClass {
    private String maHocSinh;
    private String tenHocSinh;
    private int tuoi;
    private boolean gender;

    public hocSinh() {
        this.maHocSinh = "HS0000";
        this.tenHocSinh = "chua co ten";
        this.tuoi = 0;
        this.gender = true;

    }

    public hocSinh(String maHocSinh) {
        this.maHocSinh = "HS0000";
        this.tenHocSinh = "chua co ten";
        this.tuoi = 0;
        this.gender = true;


    }

    public hocSinh(String maHocSinh, String tenHocSinh) {
        this.maHocSinh = "HS0000";
        this.tenHocSinh = "chua co ten";
        this.tuoi = 0;
        this.gender = true;

    }

    public hocSinh(String maHocSinh, String tenHocSinh, int tuoi, boolean gender) {
        this.maHocSinh = "HS0000";
        this.tenHocSinh = "chua co ten";
        this.tuoi = 0;
        this.gender = true;

    }

    public String getmaHocSinh

    {
        return maHocSinh;
    }

    public void setmaHocSinh(String maHocSinh) {
        this.masHocSinh = maHocSinh;
    }

    public String getten

    {
        return ten;
    }

    public void set

    ten(String ten) {
        this.ten = ten;
    }

    public int gettuoi

    {
        return tuoi;
    }

    public void settuoi(Int tuoi)
 this.tuoi=tuoi;
}
    public boolean isgioiTinh{
        return gioiTinh;
        }
public void set gioiTinh(Boolean gioi tinh)
        this.gioiTinh=gioiTinh;
        }

        }


        class Test {
            public static void main(String[] args) {
                HocSinhClass hocSinhClass = new HocSinhClass("hihi");
            }
        }
