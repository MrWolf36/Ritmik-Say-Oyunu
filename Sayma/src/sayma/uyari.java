/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sayma;

import javax.swing.JOptionPane;

/**
 *
 * @author Kerem
 */
public class uyari {
    public static void uyari(String str){
        String msg;
    
    switch(str){
        case "bosluk":
            msg="Lütfen Sayı ve Artış Miktarı Kutularını Doldurunuz";
            break;
        case "hata":
            msg="Hatalı Giriş Yaptınız Lütfen Kontrol Ediniz";
            break;
        default:
            msg=str;
    }
        JOptionPane.showMessageDialog(null, msg,"DİKKAT!",JOptionPane.WARNING_MESSAGE);
    }       
}
