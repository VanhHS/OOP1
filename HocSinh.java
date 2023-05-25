public class HocSinh {
    private String maHocSinh;
    private String tenHocSinh;
    private int tuoi;
    private boolean gender;


    public HocSinh() {
        this.maHocSinh = "HS0000";
        this.tenHocSinh = "chua co ten";
        this.tuoi = 0;
        this.gender = true;

    }

    public HocSinh(String maHocSinh) {
        this.maHocSinh = "HS0000";
        this.tenHocSinh = "chua co ten";
        this.tuoi = 0;
        this.gender = true;


    }

    public HocSinh(String maHocSinh, String tenHocSinh) {
        this.maHocSinh = "HS0000";
        this.tenHocSinh = "chua co ten";
        this.tuoi = 0;
        this.gender = true;

    }

    public HocSinh(String maHocSinh, String tenHocSinh, int tuoi, boolean gender) {
        this.maHocSinh = "HS0000";
        this.tenHocSinh = "chua co ten";
        this.tuoi = 0;
        this.gender = true;

    }

    public String getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public String getTenHocSinh() {
        return tenHocSinh;
    }

    public void setTenHocSinh(String tenHocSinh) {
        this.tenHocSinh = tenHocSinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGender() {//Gender mặc định là true
        if (gender) {//Phương thức
            return "Male";
        }
        return "Female";
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}




