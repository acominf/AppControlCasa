import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  Es la creacion del mundo con medidad de 600 x 340 pixeles 
 * no existen variables en este mundo.
 * @author (Diego Pilar) 
 */
public class luzoff extends World
{
    public int ubi=2;
    /**
     * Constructor del mundo que simula la aplicacion del
     * microondas creando uns ventana con la medida antes mencionada
     */
    public luzoff()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground(new GreenfootImage("luzoff.png"));
        prepare();
    }

    /**
     *  En este metodo se crean todos los objetos que estaran dentro de este mundo
     * como lo son los botones
     */
    private void prepare()
    {

        regresarinicio regresarinicio = new regresarinicio();
        addObject(regresarinicio,60,52);
        pre_l pre_l = new pre_l();
        addObject(pre_l,332,371);
    }
}
