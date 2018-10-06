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
public class NCKH {
    private int mSTTNCKH, mTietTH, mTietChuaTH;
    private String mIDGV,mNoiDung;

    public NCKH() {
    }

    public NCKH(int mSTTNCKH, int mTietTH, int mTietChuaTH, String mIDGV, String mNoiDung) {
        this.mSTTNCKH = mSTTNCKH;
        this.mTietTH = mTietTH;
        this.mTietChuaTH = mTietChuaTH;
        this.mIDGV = mIDGV;
        this.mNoiDung = mNoiDung;
    }

    public int getmSTTNCKH() {
        return mSTTNCKH;
    }

    public void setmSTTNCKH(int mSTTNCKH) {
        this.mSTTNCKH = mSTTNCKH;
    }

    public int getmTietTH() {
        return mTietTH;
    }

    public void setmTietTH(int mTietTH) {
        this.mTietTH = mTietTH;
    }

    public int getmTietChuaTH() {
        return mTietChuaTH;
    }

    public void setmTietChuaTH(int mTietChuaTH) {
        this.mTietChuaTH = mTietChuaTH;
    }

    public String getmIDGV() {
        return mIDGV;
    }

    public void setmIDGV(String mIDGV) {
        this.mIDGV = mIDGV;
    }

    public String getmNoiDung() {
        return mNoiDung;
    }

    public void setmNoiDung(String mNoiDung) {
        this.mNoiDung = mNoiDung;
    }
    
}
