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
public class GiangDay {

    private int mSTT, mDVHT, mTietQC, mTietTG;
    private String mIDGV, mHocKy, mChuyenNganh, mTenMon, mLop, mKhoaHoc, mNamHoc;

    public GiangDay() {
    }

    public GiangDay(int mDVHT, int mTietQC, int mTietTG, String mIDGV, String mHocKy, String mChuyenNganh, String mTenMon, String mLop, String mKhoaHoc, String mNamHoc) {
        this.mDVHT = mDVHT;
        this.mTietQC = mTietQC;
        this.mTietTG = mTietTG;
        this.mIDGV = mIDGV;
        this.mHocKy = mHocKy;
        this.mChuyenNganh = mChuyenNganh;
        this.mTenMon = mTenMon;
        this.mLop = mLop;
        this.mKhoaHoc = mKhoaHoc;
        this.mNamHoc = mNamHoc;
    }
    

    public GiangDay(int mSTT, int mDVHT, int mTietQC, int mTietTG, String mIDGV, String mHocKy, String mChuyenNganh, String mTenMon, String mLop, String mKhoaHoc, String mNamHoc) {
        this.mSTT = mSTT;
        this.mDVHT = mDVHT;
        this.mTietQC = mTietQC;
        this.mTietTG = mTietTG;
        this.mIDGV = mIDGV;
        this.mHocKy = mHocKy;
        this.mChuyenNganh = mChuyenNganh;
        this.mTenMon = mTenMon;
        this.mLop = mLop;
        this.mKhoaHoc = mKhoaHoc;
        this.mNamHoc = mNamHoc;
    }

    public int getmSTT() {
        return mSTT;
    }

    public void setmSTT(int mSTT) {
        this.mSTT = mSTT;
    }

    public int getmDVHT() {
        return mDVHT;
    }

    public void setmDVHT(int mDVHT) {
        this.mDVHT = mDVHT;
    }

    public int getmTietQC() {
        return mTietQC;
    }

    public void setmTietQC(int mTietQC) {
        this.mTietQC = mTietQC;
    }

    public int getmTietTG() {
        return mTietTG;
    }

    public void setmTietTG(int mTietTG) {
        this.mTietTG = mTietTG;
    }

    public String getmIDGV() {
        return mIDGV;
    }

    public void setmIDGV(String mIDGV) {
        this.mIDGV = mIDGV;
    }

    public String getmHocKy() {
        return mHocKy;
    }

    public void setmHocKy(String mHocKy) {
        this.mHocKy = mHocKy;
    }

    public String getmChuyenNganh() {
        return mChuyenNganh;
    }

    public void setmChuyenNganh(String mChuyenNganh) {
        this.mChuyenNganh = mChuyenNganh;
    }

    public String getmTenMon() {
        return mTenMon;
    }

    public void setmTenMon(String mTenMon) {
        this.mTenMon = mTenMon;
    }

    public String getmLop() {
        return mLop;
    }

    public void setmLop(String mLop) {
        this.mLop = mLop;
    }

    public String getmKhoaHoc() {
        return mKhoaHoc;
    }

    public void setmKhoaHoc(String mKhoaHoc) {
        this.mKhoaHoc = mKhoaHoc;
    }

    public String getmNamHoc() {
        return mNamHoc;
    }

    public void setmNamHoc(String mNamHoc) {
        this.mNamHoc = mNamHoc;
    }
    
}
