import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class apagado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apagado extends prender
{
    /**
     * Act - do whatever the apagado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        apagar();
    }    
    public void apagar(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)==true){
           if(bot==0){
            pos=0;
            pren();
        }
        if(bot==1){
            pos=1;
            pren();
        }
        } 
    }
}
