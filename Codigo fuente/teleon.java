import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class teleon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class teleon extends World
{
    public int ubi=1;
    /**
     * Constructor for objects of class teleon.
     * 
     */
    public teleon()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(642, 271, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        on_off on_off = new on_off();
        addObject(on_off,562,46);
        volumenmas volumenmas = new volumenmas();
        addObject(volumenmas,605,125);
        volumenmen volumenmen = new volumenmen();
        addObject(volumenmen,524,133);

        on_off.setLocation(507,53);
        on_off.setLocation(523,53);
        apagado apagado2 = new apagado();
        addObject(apagado2,604,54);
        camm camm = new camm();
        addObject(camm,612,212);
        camme camme = new camme();
        addObject(camme,543,222);
        camme.setLocation(531,214);
    }
}
