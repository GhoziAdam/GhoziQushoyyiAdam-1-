/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan33.userlogin;

/**
 *
 * @author user
 */
public class User {
    String username = "Ghozi";
    String password = "Adam";
    boolean status;
    
    public boolean cekAkun(String userName, String passWord){
        if (userName.equals(username)){
            status = true;
        }
        else if (passWord.equals(password)){
            status = false;
        }
        else {
            status = false;
        }
        return status;
    }
    public void hasilLogin(boolean status,String userName){
        if(status){
            System.out.println("*****Hallo Ghozi " + userName.toUpperCase()+ "*****");
            System.out.println("Selamat Datang di Aplikasi");
        }
        else {
            System.out.println("Ooooops,Username atau Password Anda Salah");
        }
    }
    public void pengechekanLogin(String userName, String passWord){
        System.out.println(cekAkun(userName,passWord));
        hasilLogin(status, userName);
    }
}
