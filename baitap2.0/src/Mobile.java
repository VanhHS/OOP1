public class Mobile {
    private String maDienThoai;
    private String hangSanXuat;
    private String mauSac;
    private int chieuRong;
    private int chieuDai;
    private int doDay;
    private int mucNangLuong;

    public Mobile(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Mobile(String hangSanXuat, String mauSac) {
        this.hangSanXuat = hangSanXuat;
    }

    public Mobile(String maDienThoai, String hangSanXuat, String mauSac, int chieuRong, int chieuDai, int doDay, int mucNangLuong) {
        this.maDienThoai = maDienThoai;
        this.hangSanXuat = hangSanXuat;
        this.mauSac = mauSac;
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai;
        this.doDay = doDay;
        this.mucNangLuong = mucNangLuong;
    }

    public String getMaDienThoai() {
        return maDienThoai;
    }

    public void setMaDienThoai(String maDienThoai) {
        this.maDienThoai = maDienThoai;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getDoDay() {
        return doDay;
    }

    public void setDoDay(int doDay) {
        this.doDay = doDay;
    }

    public int getMucNangLuong() {
        return mucNangLuong;
    }

    public void setMucNangLuong(int mucNangLuong) {
        if (mucNangLuong <= 100 && 0 < mucNangLuong )
        this.mucNangLuong = mucNangLuong;
    }

    public Mobile() {
        this.hangSanXuat = "nokia";
        this.mauSac = "mau xanh";
        this.chieuRong = 30;
        this.chieuDai= 60;
        this.doDay= 60;
        this.mucNangLuong= 60;
    }
}

