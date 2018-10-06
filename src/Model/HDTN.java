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
public class HDTN {
 private String mTenSV, mKhoaHoc, mIDGV ;
 private int mSTTTN, mSoNguoiHD, mTietQuiDoi;

    public HDTN() {
    }

    public HDTN(String mTenSV, String mKhoaHoc, String mIDGV, int mSTTTN, int mSoNguoiHD, int mTietQuiDoi) {
        this.mTenSV = mTenSV;
        this.mKhoaHoc = mKhoaHoc;
        this.mIDGV = mIDGV;
        this.mSTTTN = mSTTTN;
        this.mSoNguoiHD = mSoNguoiHD;
        this.mTietQuiDoi = mTietQuiDoi;
    }

    
    public String getmTenSV() {
        return mTenSV;
    }

    public void setmTenSV(String mTenSV) {
        this.mTenSV = mTenSV;
    }

    public String getmKhoaHoc() {
        return mKhoaHoc;
    }

    public void setmKhoaHoc(String mKhoaHoc) {
        this.mKhoaHoc = mKhoaHoc;
    }

    public String getmIDGV() {
        return mIDGV;
    }

    public void setmIDGV(String mIDGV) {
        this.mIDGV = mIDGV;
    }

    public int getmSTTTN() {
        return mSTTTN;
    }

    public void setmSTTTN(int mSTTTN) {
        this.mSTTTN = mSTTTN;
    }

    public int getmSoNguoiHD() {
        return mSoNguoiHD;
    }

    public void setmSoNguoiHD(int mSoNguoiHD) {
        this.mSoNguoiHD = mSoNguoiHD;
    }

    public int getmTietQuiDoi() {
        return mTietQuiDoi;
    }

    public void setmTietQuiDoi(int mTietQuiDoi) {
        this.mTietQuiDoi = mTietQuiDoi;
    }
 
}
