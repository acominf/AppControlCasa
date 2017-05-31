import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class camm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class camm extends canal
{
    /**
     * Act - do whatever the camm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        subir();
    } 
    public void subir(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)==true){
            if(canal<3){
                canal++;
                prend();
            }
            else{
                canal=1;
                prend();
            }
        } 
    }
}
