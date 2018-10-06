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
public class GiangVien {

    private String mIDGV, mTenGV, mGioiTinh, mTenKhoa, mTenBM, mTenChucVu, mHocHam;
    private int mNamSinh;
    private float mLuongTN;

    public GiangVien(String mIDGV, String mTenGV, String mGioiTinh, String mTenKhoa, String mTenBM, String mTenChucVu, String mHocHam, int mNamSinh, float mLuongTN) {
        this.mIDGV = mIDGV;
        this.mTenGV = mTenGV;
        this.mGioiTinh = mGioiTinh;
        this.mTenKhoa = mTenKhoa;
        this.mTenBM = mTenBM;
        this.mTenChucVu = mTenChucVu;
        this.mHocHam = mHocHam;
        this.mNamSinh = mNamSinh;
        this.mLuongTN = mLuongTN;
    }

    public GiangVien() {
    }

    public String getmIDGV() {
        return mIDGV;
    }

    public void setmIDGV(String mIDGV) {
        this.mIDGV = mIDGV;
    }

    public String getmTenGV() {
        return mTenGV;
    }

    public void setmTenGV(String mTenGV) {
        this.mTenGV = mTenGV;
    }

    public String getmGioiTinh() {
        return mGioiTinh;
    }

    public void setmGioiTinh(String mGioiTinh) {
        this.mGioiTinh = mGioiTinh;
    }

    public String getmTenKhoa() {
        return mTenKhoa;
    }

    public void setmTenKhoa(String mTenKhoa) {
        this.mTenKhoa = mTenKhoa;
    }

    public String getmTenBM() {
        return mTenBM;
    }

    public void setmTenBM(String mTenBM) {
        this.mTenBM = mTenBM;
    }

    public String getmTenChucVu() {
        return mTenChucVu;
    }

    public void setmTenChucVu(String mTenChucVu) {
        this.mTenChucVu = mTenChucVu;
    }

    public String getmHocHam() {
        return mHocHam;
    }

    public void setmHocHam(String mHocHam) {
        this.mHocHam = mHocHam;
    }

    public int getmNamSinh() {
        return mNamSinh;
    }

    public void setmNamSinh(int mNamSinh) {
        this.mNamSinh = mNamSinh;
    }

    public float getmLuongTN() {
        return mLuongTN;
    }

    public void setmLuongTN(float mLuongTN) {
        this.mLuongTN = mLuongTN;
    }
    
}
