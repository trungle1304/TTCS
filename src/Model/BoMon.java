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
public class BoMon {
    private String  mTenBoMon, mTenKhoa;
    private int mIDBoMon;

    public BoMon() {
    }

    public BoMon(String mTenBoMon, String mTenKhoa, int mIDBoMon) {
        this.mTenBoMon = mTenBoMon;
        this.mTenKhoa = mTenKhoa;
        this.mIDBoMon = mIDBoMon;
    }

   

    public BoMon(String mTenBoMon) {
        this.mTenBoMon = mTenBoMon;
    }

    public BoMon(String mTenBoMon, String mTenKhoa) {
        this.mTenBoMon = mTenBoMon;
        this.mTenKhoa = mTenKhoa;
    }

    public int getmIDBoMon() {
        return mIDBoMon;
    }

    public void setmIDBoMon(int mIDBoMon) {
        this.mIDBoMon = mIDBoMon;
    }

 
    public String getmTenBoMon() {
        return mTenBoMon;
    }

    public void setmTenBoMon(String mTenBoMon) {
        this.mTenBoMon = mTenBoMon;
    }

    public String getmTenKhoa() {
        return mTenKhoa;
    }

    public void setmTenKhoa(String mTenKhoa) {
        this.mTenKhoa = mTenKhoa;
    }

    
}
