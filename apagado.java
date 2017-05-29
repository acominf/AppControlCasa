import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * En esta clase sirve es hija de la función prender que esto nos permite cambiar el mundo
 * @author (Diego) 
 */
public class apagado extends prender
{
    /**
     * Se llama al constructor para que este este a la espera e la acción
     */
    public void act() 
    {
        // Add your action code here.
        apagar();
    }    
    /**
    * En este constructor se realiza una verificación de que si se presiono el buton al ser
    * verdadera esta llama a la funcion padre con un valor determinado
    */
    public void apagar(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this)==true){
           prend(4);
           prenl(3);  
        } 
    }
}
