/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbms;

/**
 *
 * @author Aaliya
 */
class User {
    public int id;
    public String fname,gender;
    
    public User(String fname,int id,String gender)
    {
       
        this.fname=fname;
         this.id=id;
        this.gender=gender;
    }
    
    public int getid()
    {
        return id;
    }
    
    public String getname()
    {
        return fname;
    }
        
         public String getgender()
    {
        return gender;
    }
}
