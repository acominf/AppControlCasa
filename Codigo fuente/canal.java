import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class canal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class canal extends prender
{
    protected int canal=1;
   GreenfootSound canal1= new GreenfootSound("bebedinosaurio.wav");
   GreenfootSound canal2= new GreenfootSound("kendalyken.wav");
   GreenfootSound canal3= new GreenfootSound("pajaroloco.wav");
    /**
     * Act - do whatever the canal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        prend();
    }    
    public void prend(){
        apagar();
        if(bot==0&&pos==1&&canal==1){
            canal2.pause();
            canal3.pause();
            canal1.play();
        }
        if(bot==0&&pos==1&&canal==2){
            canal1.pause();
            canal3.pause();
            canal2.play();
        }
        if(bot==0&&pos==1&&canal==3){
            canal2.pause();
            canal1.pause();
            canal3.play();
        }
    }
    public void apagar(){
        canal1.pause();
        canal2.pause();
        canal3.pause();
    }
    
}
