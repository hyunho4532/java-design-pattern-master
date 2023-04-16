package duck_design_chapter.design_puzzle;

public class KnifeBehavior implements WeaponBehavior {
	@Override
	public void useWeapon() {
		System.out.println("칼로 베는 행동");	
	}
}