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
class User {
    private int cust_id;
    private String cust_name, cust_address, postcode, telephone, date;
    private byte[] picture;
    
    public User(int cust_id, String cust_name, String cust_address, String postcode, String telephone, byte[]image, String date )
    {
        this.cust_id=cust_id;
        this.cust_name=cust_name;
        this.cust_address=cust_address;
        this.postcode=postcode;
        this.telephone=telephone;
        this.picture=image;
        this.date=date;
    }
    public int getcust_id(){
     return cust_id;   
    }
    public String getcust_name(){
        return cust_name;
    }
    public String getcust_address(){
        return cust_address;
    }
    public String getpostcode(){
        return postcode;
    }
    public String gettelephone(){
        return telephone;
    }
    public byte[] getImage(){
        return picture;
    }
    public String getDate(){
        return date;
    }
    
}
