import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class estereo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class estereo extends boton
{
    /**
     * Act - do whatever the estereo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public void act() 
    {
        presionaboton();
    }
   public void presionaboton(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)==true){
            band=2;
            cambioesc();
    } 
}
} 
