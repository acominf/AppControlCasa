import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * En esta clase sirve es hija de la función prender que esto nos permite cambiar el mundo
 * @author (Diego) 
 */
public class apa_l extends prender
{
    /**
     * Se llama al constructor para que este este a la espera e la acción
     */
    public void act() 
    {
        // Add your action code here.
        apal();
    }    
    /**
    * En este constructor se realiza una verificación de que si se presiono el buton al ser
    * verdadera esta llama a la funcion padre con un valor determinado
    */
    public void apal(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)==true){
        prenl(0);
    }
    }
}
