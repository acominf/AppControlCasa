import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class on_off here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class on_off extends prender
{
    /**
     * Act - do whatever the on_off wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        prender();
    
    }
    public void prender(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)==true){
           if(bot==0){
            bot=1;
            pren();
            
        }
        if(bot==1){
            bot=0;
            pren();
        }
        } 
    }
}
