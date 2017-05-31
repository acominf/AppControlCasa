import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class television here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boton extends Actor
{
    public int  band;
    private int mouse,pos;
    /**
     * Act - do whatever the television wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        posicion(band);
        //cambioesc();
    } 
    public void cambioesc(){
        televison conttel =new televison();
        esterooff estereo=new esterooff();
        luzoff luz=new luzoff();
        microondasoff micro=new microondasoff();
        switch(band ){
            case 1:
                Greenfoot.setWorld(conttel);
                posicion(band);
                break;
            case 2:
                Greenfoot.setWorld(estereo);
                break;
            case 3:
                Greenfoot.setWorld(luz);
                break;
            case 4:
                Greenfoot.setWorld(micro);
                break;
        }
    }
    public void posicion(int valor){
        pos=valor;
    }
}
