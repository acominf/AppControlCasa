import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es la creacion del mundo con medidad de 600 x 340 pixeles 
 * no existen variables en este mundo.
 * @author (Diego Pilar) 
 */
public class teleon extends World
{
    public int ubi=1;
    /**
     * Constructor del mundo que simula la aplicacion del
     * television encendida creando uns ventana con la medida antes mencionada
     */
    public teleon()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 320, 1); 
        prepare();
    }

    /**
     * En este metodo se crean todos los objetos que estaran dentro de este mundo
     * como lo son los botones
     */
    private void prepare()
    {
        on_off on_off = new on_off();
        addObject(on_off,562,46);
        on_off.setLocation(507,53);
        on_off.setLocation(523,53);
        apagado apagado2 = new apagado();
        addObject(apagado2,604,54);
        camme camme = new camme();
        addObject(camme,543,222);
        camme.setLocation(531,214);
        regresarinicio regresarinicio = new regresarinicio();
        addObject(regresarinicio,97,286);
    }
}
