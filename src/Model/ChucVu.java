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
public class ChucVu {

    private String mTenChucVu;
    private int mIDChucVu, mTietGiam;

    public ChucVu(String mTenChucVu) {
        this.mTenChucVu = mTenChucVu;
    }

    public ChucVu() {
    }

    public ChucVu(String mTenChucVu, int mTietGiam) {
        this.mTenChucVu = mTenChucVu;
        this.mTietGiam = mTietGiam;
    }

    public String getmTenChucVu() {
        return mTenChucVu;
    }

    public void setmTenChucVu(String mTenChucVu) {
        this.mTenChucVu = mTenChucVu;
    }

    public int getmIDChucVu() {
        return mIDChucVu;
    }

    public void setmIDChucVu(int mIDChucVu) {
        this.mIDChucVu = mIDChucVu;
    }

    public int getmTietGiam() {
        return mTietGiam;
    }

    public void setmTietGiam(int mTietGiam) {
        this.mTietGiam = mTietGiam;
    }
    

}
