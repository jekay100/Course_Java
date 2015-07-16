package day11;
/**
 * AudoR8是跑车，是汽车
 * @author user
 *也是也是也是
 */
public class AudiR8 extends Car
	implements Roadster,Vehicle{

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("能量回收式刹车");
	}

	public int getMaxSpeed() {
		// TODO Auto-generated method stub
		return 380;
	}

}
