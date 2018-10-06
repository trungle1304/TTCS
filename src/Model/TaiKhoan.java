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
public class TaiKhoan {

    private String mUser, mPass;

    public TaiKhoan() {
    }

    public TaiKhoan(String mUser, String mPass) {
        this.mUser = mUser;
        this.mPass = mPass;
    }

    public String getmUser() {
        return mUser;
    }

    public void setmUser(String mUser) {
        this.mUser = mUser;
    }

    public String getmPass() {
        return mPass;
    }

    public void setmPass(String mPass) {
        this.mPass = mPass;
    }

}
