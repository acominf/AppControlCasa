import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Este actor es el padre de varios actores que realizan el metodo mediante un sitch
 *en este metodo existen  3 tipos de variables.
 * @author (Diego) 
 */
public class boton extends Actor
{
    public int  band;
    private int mouse,pos;
    /**
     * Al momento de abrir este boton se realiza automaticamente la accion que se 
     * describe adentro
     */
    public void act() 
    {
        posicion(band);
        //cambioesc();
    } 
    /**
     * Este metodo coniste en varias variables internas que le permiten realizar el
     * cambio de escenario sin importarcual sea la opcion que entre 
     */
    public void cambioesc(){
        televison conttel =new televison();
        esterooff estereo=new esterooff();
        luzoff luz=new luzoff();
        microondasoff micro=new microondasoff();
        MyWorld inicio=new MyWorld();
        abanico abanico=new abanico();
        creditos credito=new creditos();
        portada portad=new portada();
        ayuda help=new ayuda();
        
        switch(band ){
            case 0:
                 Greenfoot.setWorld(inicio);
                 posicion(band);
                 break;
            case 1:
                Greenfoot.setWorld(conttel);
                posicion(band);
                break;
            case 2:
                Greenfoot.setWorld(estereo);
                break;
            case 3:
                Greenfoot.setWorld(luz);
                break;
            case 4:
                Greenfoot.setWorld(micro);
                break;
            case 5:
                Greenfoot.setWorld(abanico);
                break;
            case 6:
                Greenfoot.setWorld(credito);
                break;
            case 7:
                Greenfoot.setWorld(portad);
                break;
            case 8:
                Greenfoot.setWorld(help);
                break;
        }
    }
    /**
     *En este metodo se iguala la posicion en en valor que se le da por parametro
     *@param tiene como parametro un dato de forma entera.
     */
    public void posicion(int valor){
        pos=valor;
    }
    /**
     *@return este metodo regresa la ubicación en la cual se encuentra
     */
    public int ubi(){
        return band;
    }
}
