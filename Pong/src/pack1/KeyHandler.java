package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Var.moveupg = true;
		
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Var.movedowng = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			Var.moveup = true;

		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			Var.movedown = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Var.moveupg = false;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Var.movedowng = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_W) {
			Var.moveup = false;
		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			Var.movedown = false;
		}
		
	}





}
