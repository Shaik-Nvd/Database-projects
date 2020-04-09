/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logins;

/**
 *
 * @author ADMIN
 */
class User3 {
     private String tax, subtotal, total;
   
    
    public User3(String tax, String subtotal, String total )
    {
        this.tax=tax;
        this.subtotal=subtotal;
        this.total=total;
    }
   
    public String gettax(){
        return tax;
    }
    public String getsubtotal(){
        return subtotal;
    }
    public String gettotal(){
        return total;
    }
    
}
