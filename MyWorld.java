import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es la creacion del mundo con medidad de 970 x 546 pixeles 
 * no existen variables en este mundo.
 * @author (Diego Pilar) 
 */
public class MyWorld extends World
{
    
    /**
     * Constructor del mundo que simula la aplicacion del
     * de la portada pirncipal despues de la portada
     * creando uns ventana con la medida antes mencionada
     */
    public MyWorld()
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
        setBackground(new GreenfootImage("casa-inteligente.png"));
        tele tele = new tele();
        addObject(tele,240,319);
        tele.setLocation(232,311);
        estereo estereo = new estereo();
        addObject(estereo,70,452);
        estereo.setLocation(65,442);
        luz luz = new luz();
        addObject(luz,505,154);
        luz.setLocation(499,149);
        microondas microondas = new microondas();
        addObject(microondas,909,248);
        microondas.setLocation(899,241);
        aba aba = new aba();
        addObject(aba,705,217);
        aba.setLocation(699,211);
        bportada bportada = new bportada();
        addObject(bportada,649,517);
    }
    
}
