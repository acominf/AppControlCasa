import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class televison here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class televison extends World
{
    public int ubi;
    /**
     * Constructor for objects of class televison.
     * 
     */
    public televison()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 320, 1);
        ubi=1;
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setBackground(new GreenfootImage("tele.PNG"));
        volumenmas volumenmas = new volumenmas();
        addObject(volumenmas,599,143);
        volumenmen volumenmen = new volumenmen();
        addObject(volumenmen,511,152);
        on_off on_off = new on_off();
        addObject(on_off,555,58);
        on_off.setLocation(504,56);
        apagado apagado = new apagado();
        addObject(apagado,599,58);
        camm camm2 = new camm();
        addObject(camm2,605,242);
        camme camme2 = new camme();
        addObject(camme2,527,250);
        camme2.setLocation(519,246);
    }
  
}
