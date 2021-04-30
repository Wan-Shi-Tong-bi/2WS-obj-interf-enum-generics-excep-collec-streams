/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

/**
 *
 * @author jgruenauer17
 */
public class Punkt implements Serializable{
    private int x=0;
 
    public int getX()
    {
         return x;
    }
 
    public void setX(int xwert)
    {
         x=xwert;
    }
}
