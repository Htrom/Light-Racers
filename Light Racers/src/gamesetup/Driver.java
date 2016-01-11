package gamesetup;

 
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Creates display and runs game
 * @author HARRY
 *
 */
public class Driver extends StateBasedGame {
     
    public static final int LENGTH = 800;
    public static final int HEIGHT = 600;

	public int STATE = 1;
	
    public Driver(String title) {
 
        super(title);
 
    }
 
    public static void main(String[] args) throws SlickException {
    	Renderer.setLineStripRenderer(Renderer.QUAD_BASED_LINE_STRIP_RENDERER);
    	Renderer.getLineStripRenderer().setLineCaps(true);
        AppGameContainer app = new AppGameContainer(new Driver("DarkSouls2D"));
        app.setDisplayMode(LENGTH, HEIGHT, false);
        app.setAlwaysRender(true);
        app.setShowFPS(true);
        app.setTargetFrameRate(60);
        app.start();
    }
    
    /**
     * adds states to class
     */
    public void initStatesList(GameContainer container) throws SlickException {
        this.addState(new GameState());
    }
}