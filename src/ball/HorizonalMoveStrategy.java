package ball;

public class HorizonalMoveStrategy extends DirectionStrategy {
	public void move(Ball ball){
		ball.setxIntervals(Ball.INTERVAL, 0);
		while(true){
			ball.setX(ball.getX()+ball.getXinterval());
			if((ball.getX()<0 && ball.getXinterval()<0) || ball.getX()+Ball.SIZE>BallFrame.WIDTH-15&&ball.getXinterval()>0){
			ball.setxIntervals(-ball.getXinterval(), 0);
			}
			try{
				Thread.sleep(30);
			}catch(InterruptedException e){}
		}
	}
}
