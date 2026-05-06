import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * TitleScreen
 * 
 * @Kimi
 * @May 6
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2,200);
        prepare();
    }

    public void act() 
    {    
        if(Greenfoot.isKeyDown("space")) 

        { 
            MyWorld gameWorld = new MyWorld(); 
            Greenfoot.setWorld(gameWorld) ;
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,502,105);
        Label label = new Label("Use \u2190 and \u2192 to Move", 12);
        addObject(label,209,268);
        label.setLocation(200,268);
        label.setLocation(220,264);
        removeObject(label);
        Label label4 = new Label("Use <-- and --> to Move", 50);
        addObject(label4,304,255);
        label.setLocation(344,235);
        Label label2 = new Label("Press <space> to start", 50);
        addObject(label2,326,330);
        label2.setLocation(324,308);
        label.setLocation(310,233);
        label2.setLocation(292,306);
    }
}