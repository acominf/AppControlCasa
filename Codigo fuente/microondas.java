import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class microondas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class microondas extends boton
{
    /**
     * Act - do whatever the microondas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        presionaboton();
    } 
    public void presionaboton(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)==true){
            band=4;
            cambioesc();
    } 
}
}
