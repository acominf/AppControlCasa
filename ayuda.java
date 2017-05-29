import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es la creacion del mundo con medidad de 970 x 546 pixeles 
 * solo consiste en una imagen creada con el texto incluida en el
 * no existen variables en este mundo.
 */
public class ayuda extends World
{

    /**
     *Constructor del mundo que simula la aplicacion el recuadro de 
     * ayuda creando uns ventana con la medida antes mencionada
     */
    public ayuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(970, 456, 1); 
        prepare();
    }

    /**
     * En este metodo se crean todos los objetos que estaran dentro de este mundo
     * como lo son los botones
     */
    private void prepare()
    {
        bportada bportada = new bportada();
        addObject(bportada,929,418);
    }
}
