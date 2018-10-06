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
public class Khoa {
    private String mMota,mTenKhoa;
    private int mIDKhoa;

    public Khoa() {
    }

    public Khoa(String mTenKhoa, int mIDKhoa) {
        this.mTenKhoa = mTenKhoa;
        this.mIDKhoa = mIDKhoa;
    }

  

    public Khoa(String mTenKhoa) {
        this.mTenKhoa = mTenKhoa;
    }



    public String getmMota() {
        return mMota;
    }

    public void setmMota(String mMota) {
        this.mMota = mMota;
    }

    public String getmTenKhoa() {
        return mTenKhoa;
    }

    public void setmTenKhoa(String mTenKhoa) {
        this.mTenKhoa = mTenKhoa;
    }

    public int getmIDKhoa() {
        return mIDKhoa;
    }

    public void setmIDKhoa(int mIDKhoa) {
        this.mIDKhoa = mIDKhoa;
    }
    
    
}
