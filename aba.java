import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aba extends boton
{
    /**
    *  se realiza una verificación de que si se presiono el buton al ser
    * verdadera esta llama a la funcion padre con un valor determinado
    */
    public void act() 
    {
        // Add your action code here.
           MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)==true){
            band=5;
            cambioesc();
    }  
    }    
}
