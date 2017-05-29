import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es la creacion del mundo con medidad de 600 x 340 pixeles 
 * no existen variables en este mundo.
 * @author (Diego Pilar) 
 */
public class microondasoff extends World
{

    /**
     * Constructor del mundo que simula la aplicacion del
     * microondas
     */
    public microondasoff()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 340, 1); 
        setBackground(new GreenfootImage("microondasoff.png"));
        prepare();
    }

    /**
     * En este metodo se crean todos los objetos que estaran dentro de este mundo
     * como lo son los botones
     */
    private void prepare()
    {
        on_m on_m = new on_m();
        addObject(on_m,568,43);
        regresarinicio regresarinicio = new regresarinicio();
        addObject(regresarinicio,30,29);
    }
}
