import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *   Es la creacion del mundo con medidad de 600 x 340 pixeles 
 * no existen variables en este mundo.
 * @author (Diego Pilar) 
 */
public class televison extends World
{
    public int ubi=1;
    /**
     * Constructor del mundo que simula la aplicacion del
     * television apagada creando uns ventana con la medida antes mencionada
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
     * En este metodo se crean todos los objetos que estaran dentro de este mundo
     * como lo son los botones
     */
    private void prepare()
    {
        setBackground(new GreenfootImage("tele.PNG"));
        on_off on_off = new on_off();
        addObject(on_off,555,58);
        on_off.setLocation(504,56);
        apagado apagado = new apagado();
        addObject(apagado,599,58);
        regresarinicio regresarinicio2 = new regresarinicio();
        addObject(regresarinicio2, 43, 62);
    }
  
}
