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
class User2 {
     private String modified, stereo_system, customized_detailing, leather_interior, Gps;
   
    
    public User2(String modified, String stereo_system, String customized_detailing, String leather_interior, String Gps )
    {
        this.modified=modified;
        this.stereo_system=stereo_system;
        this.customized_detailing=customized_detailing;
        this.leather_interior=leather_interior;
        this.Gps=Gps;
        
    }
   
    public String getmodified(){
        return modified;
    }
    public String getstereo_system(){
        return stereo_system;
    }
    public String getcustomized_detailing(){
        return customized_detailing;
    }
    public String getleather_interior(){
        return leather_interior;
    }
    public String getGps(){
        return Gps;
    }
    
}
