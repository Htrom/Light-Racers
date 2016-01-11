package gamesetup;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import entities.Player;

public class GameState extends BasicGameState{

	Player player;
	
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		
		player = new Player(50, 50, 500, 1, 500);
		
	}

	public void update(GameContainer gc, StateBasedGame arg1, int arg2) throws SlickException {
		detectArrowKeys(gc);
		player.move();
	}
	
	public void render(GameContainer gc, StateBasedGame arg1, Graphics g) throws SlickException {
		player.draw(g);
	}

	
	public void detectArrowKeys(GameContainer gc) throws SlickException{
        
	     Input input = gc.getInput();
	     boolean move = false;
		 if(input.isKeyDown(Input.KEY_UP)){
			 player.setDir("up");
			 move = true;
		 }
		 if(input.isKeyDown(Input.KEY_DOWN)){
			 player.setDir("down");
			 move = true;
		 }
		 if(move == false){
			 player.setDir("stopped");
		 }
		 
		 if(input.isKeyDown(Input.KEY_LEFT)){
			 player.convert("slower");
		 }
		 
		 if(input.isKeyDown(Input.KEY_RIGHT)){
			 player.convert("faster");
		 }
	}
	
	public int getID() {
		return 0;
	}

}
