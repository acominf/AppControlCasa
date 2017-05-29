import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es la creacion del mundo con medidad de 600 x 340 pixeles 
 * no existen variables en este mundo.
 * @author (Diego Pilar) 
 */
public class creditos extends World
{

    /**
     * Constructor del mundo que simula la aplicacion del
     * television apagada creando uns ventana con la medida antes mencionada
     */
    public creditos()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(970, 546, 1); 
        prepare();
    }

    /**
     * En este metodo se crean todos los objetos que estaran dentro de este mundo
     * como lo son los botones
     */
    private void prepare()
    {
        bportada bportada2 = new bportada();
        addObject(bportada2,71,54);
    }
}
