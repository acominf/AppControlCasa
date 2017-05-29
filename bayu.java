import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  En esta clase sirve es hija de la función prender que esto nos permite cambiar el mundo
 * @author (Diego) 
 */
public class bayu extends boton
{
    /**
     * Se llama al constructor para que este este a la espera e la acción.
     */
    public void act() 
    {
        // Add your action code here.
        presionaboton();
    }    
    /**
    * En este constructor se realiza una verificación de que si se presiono el buton al ser
    * verdadera esta llama a la funcion padre con un valor determinado
    */
    public void presionaboton(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)==true){
            band=8;
            cambioesc();
    } 
}
}
