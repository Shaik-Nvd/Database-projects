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
class User1 {
    
    private String car_model, trade_in;
   
    
    public User1(String car_model, String trade_in )
    {
        this.car_model=car_model;
        this.trade_in=trade_in;
        
    }
   
    public String getcar_model(){
        return car_model;
    }
    public String gettrade_in(){
        return trade_in;
    }
    
    
}
