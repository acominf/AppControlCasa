import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class camme here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class camme extends canal
{
    /**
     * Act - do whatever the camme wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        bajar();
    }   
    public void bajar(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)==true){
            if(canal>1){
                canal--;
                prend();
            }
            else{
                canal=3;
                prend();
            }
        }
    }
}
