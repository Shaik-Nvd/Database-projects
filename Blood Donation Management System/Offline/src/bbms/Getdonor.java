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
class Getdonor {
     public int id;
    public String fname,stat,city,bloodgroup,bottles,contact;
    
    public Getdonor(String fname,int id,String stat,String city,String bloodgroup,String bottles,String contact)
    {
       
        this.fname=fname;
         this.id=id;
        this.stat=stat;
        this.city=city;
        this.bloodgroup=bloodgroup;
        this.bottles=bottles;
        this.contact=contact;
    }
    
    public int getid()
    {
        return id;
    }
    
    public String getname()
    {
        return fname;
    }
        
         public String getstate()
    {
        return stat;
    }
    
     public String getcity()
    {
        return city;
    }     
     
      public String getbg()
    {
        return bloodgroup;
    }
      
       public String getbot()
    {
        return bottles;
    }
       
        public String getcon()
    {
        return contact;
    }
}
