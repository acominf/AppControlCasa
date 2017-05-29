import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es la creacion del mundo con medidad de 600 x 340 pixeles 
 * no existen variables en este mundo.
 * @author (Diego Pilar) 
 */
public class luzzon extends World
{

    /**
     * Constructor del mundo que simula la aplicacion del
     * microondas creando uns ventana con la medida antes mencionada
     */
    public luzzon()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * En este metodo se crean todos los objetos que estaran dentro de este mundo
     * como lo son los botones
     */
    private void prepare()
    {
        apa_l apa_l = new apa_l();
        addObject(apa_l,398,344);
        regresarinicio regresarinicio = new regresarinicio();
        addObject(regresarinicio,48,44);
    }
}
