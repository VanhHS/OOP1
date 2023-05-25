public class Mobile {
    String maDienThoai;
    String hangSanXuat;
    String mau;
    int doDai;
    int doRong;
    int doDay;
    int mucNangLuong;
    public Mobile(){

    }

    public Mobile(String hangSanXuat) {
        this.hangSanXuat="Chưa có tên";
    }
    public Mobile(String hangSanXuat, String mau){
        this.hangSanXuat="Nokia";
        this.mau="mau xanh";
    }
    public Mobile(String hangSanXuat, String maDienThoai,String mau,int doDai,int doRong,int doDay,int mucNangLuong){
        this.hangSanXuat="Nokia";
        this.mau="mau xanh";
        this.maDienThoai="null";
        this.doDai=0;
        this.doRong=0;
        this.doDay=0;
        this.mucNangLuong=0;
    }

    public String getMaDienThoai() {
        return maDienThoai;
    }

    public void setMaDienThoai(String maDienThoai) {
        this.maDienThoai = maDienThoai;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getDoDai() {
        return doDai;
    }

    public void setDoDai(int doDai) {
        this.doDai = doDai;
    }

    public int getDoRong() {
        return doRong;
    }

    public void setDoRong(int doRong) {
        this.doRong = doRong;
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
        if(mucNangLuong < 0 || mucNangLuong > 100){
            return;
        }
        this.mucNangLuong = mucNangLuong;
    }
}
