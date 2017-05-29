import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * En esta clase se activa el sonido que reproducira algun elemento de la aplicación
 * o el cambio de escebario si es necesraio
 *Las variables que tiene esta clase son de sonido y mundos debido a lo ya antes mencionado
 * @author (Diego) 
 */
public class prender extends boton
{
    protected int bot=0;
    public int pos=1,ubi;
    GreenfootSound micro= new GreenfootSound("micro.wav");
    GreenfootSound luz= new GreenfootSound("luz.wav");
    
    protected int canal=1;
    GreenfootSound canal1= new GreenfootSound("bebe.wav");
    GreenfootSound canal2= new GreenfootSound("kendal.wav");
    GreenfootSound canal3= new GreenfootSound("pajlp.wav");
    
    GreenfootSound ra1= new GreenfootSound("radio1.wav");
    GreenfootSound ra2= new GreenfootSound("rad.wav");
    GreenfootSound ra3= new GreenfootSound("radio1.wav");
    GreenfootSound aba= new GreenfootSound("abanico.wav");
    /**
     * se inicializa la variable pos en un valor determinado
     */
    public void act() 
    {
        // Add your action code here.
        pos=ubi();
    }    
    /**
     * En este constructor se realiza el cambio de escenario de la televición
     * @param tiene como parametro un valor entero que esto indica en que parte del mundo
     * se encuentra .
     */
     public void pren(int val){
       teleon prendida =new teleon();
        televison apagada=new televison();
        
        if(bot==1&&pos==1){
            Greenfoot.setWorld(prendida);
        }
        if(bot==0&&pos==1){
            apagar();
            Greenfoot.setWorld(apagada);
        }
    }
    /**
     * En este constructor se realiza el encendido del microondas
     * @param tiene como parametro un valor entero que esto indica si estas encendido o
     * apagado el microondas.
     */
     public void prenm(int val){
       ubi=val;
        if(ubi==1){
             micro.play();
        }if(ubi==0){
             micro.stop();
        }
    }
    /**
     * En este constructor se realiza el cambio de escenario de la luz
     * @param tiene como parametro un valor entero que esto indica en que parte del mundo
     * se encuentra .
     */
    public void prenl(int val){
       luzoff luzo =new luzoff();
       luzzon luzof=new luzzon ();
       teleon prendida =new teleon();
       televison apagada=new televison();
        ubi=val;
        if(ubi==0){
            luz.play();
            Greenfoot.delay(3);
            Greenfoot.setWorld(luzo);
        }
        if(ubi==1){
            luz.play();
            Greenfoot.delay(3);
            Greenfoot.setWorld(luzof);
        }
        if(ubi==2){
            Greenfoot.setWorld(prendida);
        }
        if(ubi==3){ 
           Greenfoot.setWorld(apagada);
        }
    }/**
     * En este constructor se realiza el cambio de canal de televisión
     * @param tiene como parametro un valor entero que esto indica encanal se encuentra 
     * y reproducir el sonido que le corresponde.
     */
    public void prend(int val){
        canal=val;
        if(bot==0&&pos==1&&canal==1){
            canal2.pause();
            canal3.pause();
            canal1.play();
        }
        if(bot==0&&pos==1&&canal==2){
            canal1.pause();
            canal3.pause();
            canal2.play();
        }
        if(bot==0&&pos==1&&canal==3){
            canal2.pause();
            canal1.pause();
            canal3.play();
        }
        if(bot==0&&pos==1&&canal==4){
            canal1.pause();
            canal2.pause();
            canal3.pause();
            ra2.pause();
            ra1.pause();
            ra3.pause();
        }
        if(bot==0&&pos==1&&canal==5){
            ra1.pause();
            ra3.pause();
            ra2.play();
        }
        if(bot==0&&pos==1&&canal==6){
            aba.play();
        }
    }
    /**
     * En este constructor se realiza el apagado del sonido
     */
     public void apagar(){
        canal1.stop();
        canal2.stop();
        canal3.stop();
        
    }
}
