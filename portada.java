import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es la creacion del mundo con medidad de 970 x 546 pixeles 
 * no existen variables en este mundo,y este crea el acceso princial a la aplicacion.
 * @author (Diego Pilar) 
 */
public class portada extends World
{

    /**
     * Constructor del mundo que simula la aplicacion de la
     * portada creando uns ventana con la medida antes mencionada
     */
    public portada()
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
        regresarinicio regresarinicio = new regresarinicio();
        addObject(regresarinicio,869,194);
        bayu bayu = new bayu();
        addObject(bayu,899,326);
        credit credit = new credit();
        addObject(credit,910,448);
    }
}
