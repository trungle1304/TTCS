/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author NguyenAnhPhan
 */
public class ThanhToan {

    private int mIDKhoa, mIDBoMon, mDinhMucGG, mGioNCKH;
    private float mMucTTChuan;
    private String mIDGV;

    public ThanhToan() {
    }

    public ThanhToan(int mIDKhoa, int mIDBoMon, int mDinhMucGG, int mGioNCKH, float mMucTTChuan, String mIDGV) {
        this.mIDKhoa = mIDKhoa;
        this.mIDBoMon = mIDBoMon;
        this.mDinhMucGG = mDinhMucGG;
        this.mGioNCKH = mGioNCKH;
        this.mMucTTChuan = mMucTTChuan;
        this.mIDGV = mIDGV;
    }

    public int getmIDKhoa() {
        return mIDKhoa;
    }

    public void setmIDKhoa(int mIDKhoa) {
        this.mIDKhoa = mIDKhoa;
    }

    public int getmIDBoMon() {
        return mIDBoMon;
    }

    public void setmIDBoMon(int mIDBoMon) {
        this.mIDBoMon = mIDBoMon;
    }

    public int getmDinhMucGG() {
        return mDinhMucGG;
    }

    public void setmDinhMucGG(int mDinhMucGG) {
        this.mDinhMucGG = mDinhMucGG;
    }

    public int getmGioNCKH() {
        return mGioNCKH;
    }

    public void setmGioNCKH(int mGioNCKH) {
        this.mGioNCKH = mGioNCKH;
    }

    public float getmMucTTChuan() {
        return mMucTTChuan;
    }

    public void setmMucTTChuan(float mMucTTChuan) {
        this.mMucTTChuan = mMucTTChuan;
    }

    public String getmIDGV() {
        return mIDGV;
    }

    public void setmIDGV(String mIDGV) {
        this.mIDGV = mIDGV;
    }
    
}
