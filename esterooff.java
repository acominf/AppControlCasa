import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es la creacion del mundo con medidad de 600 x 340 pixeles 
 * no existen variables en este mundo.
 */
public class esterooff extends World
{

    /**
     * Constructor del mundo que simula la aplicacion del
     * estereo creando uns ventana con la medida antes mencionada
     * 
     */
    public esterooff()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600,320, 1); 
        setBackground(new GreenfootImage("radio.png"));
        prepare();
    }

    /**
     *En este metodo se crean todos los objetos que estaran dentro de este mundo
     * como lo son los botones
     */
    private void prepare()
    {
        regresarinicio regresarinicio = new regresarinicio();
        addObject(regresarinicio,64,54);
        apar apar = new apar();
        addObject(apar,70,148);
        prer prer = new prer();
        addObject(prer,159,155);
        prer.setLocation(155,147);
    }
}
