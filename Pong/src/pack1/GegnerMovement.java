package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class GegnerMovement {
	Timer move;
	public GegnerMovement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {

				if(Var.moveupg == true){

					if(Var.gegnery >=20){
						Var.gegnery -=2;
					}
				}else if(Var.movedowng == true){

					if(Var.gegnery <= Var.screenheight - 200){
						Var.gegnery += 2;
					}
				}

			}

		}, 0, 5);
	}

}
