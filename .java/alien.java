import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class alien here.
 * 
 * @Caroline Kirkconnell (CarolineKirkconnell8@gmail.com)
 * @final
 */
public class alien extends Actor
{
    /**
     * Act - do whatever the alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(2);
        
        if(isTouching(spaceship.class))
        {
            removeTouching(spaceship.class);
            Greenfoot.playSound("scream!.wav");
            Greenfoot.stop();
        }   
       
        if(isAtEdge())
        {
            turn(17);
        }    
    }   
}
