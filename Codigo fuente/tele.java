import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tele here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tele extends boton
{
    /**
     * Act - do whatever the tele wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)==true){
            band=1;
            cambioesc();
    }    
}
}