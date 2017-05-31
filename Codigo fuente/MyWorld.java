import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(970, 546, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setBackground(new GreenfootImage("casa-inteligente.png"));
        tele tele = new tele();
        addObject(tele,240,319);
        tele.setLocation(232,311);
        estereo estereo = new estereo();
        addObject(estereo,70,452);
        estereo.setLocation(65,442);
        luz luz = new luz();
        addObject(luz,505,154);
        luz.setLocation(499,149);
        microondas microondas = new microondas();
        addObject(microondas,909,248);
        microondas.setLocation(899,241);
    }
    
}
