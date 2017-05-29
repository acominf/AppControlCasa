import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  En esta clase sirve es hija de la función prender que esto nos permite cambiar el
 *  en canal en el que se encuentra la televisión
 * @author (Diego) 
 */
public class camme extends canal
{   private int ca=1;
    /**
     * Se llama al constructor para que este este a la espera e la acción
     */
    public void act() 
    {
        // Add your action code here.
        bajar();
    }   
    /**
    * En este constructor se realiza unael cambio de canal mediante el teclado
    * presionando la tecla arriba y abajo y estas al momento de ser cambiadas llaman a la funcion
    * padre y si se selecciona una tecla y este ya no tiene mas canalles vuelve al inicio o al
    * final dependeidno que tecla se presiono
    */
    public void bajar(){
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.isKeyDown("down")){
            if(ca>1){
                ca--;
                prend(ca);
            }
            else{
                ca=3;
                prend(ca);
            }
        }
        else if(Greenfoot.isKeyDown("up")){
            if(ca<3){
                ca++;
                prend(ca);
            }
            else{
                ca=1;
                prend(ca);
            }
        }
    }
}
