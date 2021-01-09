package ch08;

public class DVa implements Attack, Movement {

	@Override
	public void left() {
		System.out.println("디바가 왼쪽으로 이동합니다.");
	}

	@Override
	public void right() {
		System.out.println("디바가 오른쪽으로 이동합니다.");
		
	}

	@Override
	public void forward() {
		System.out.println("디바가 앞으로 이동합니다.");
	}

	@Override
	public void backward() {
		System.out.println("디바가 후진합니다.");
		
	}

	@Override
	public void attack() {
		System.out.println("디바가 융합포로 공격합니다.");
	}

	@Override
	public void skill() {
		System.out.println("디바가 방어 매트릭스를 사용합니다.");
	}

	@Override
	public void specialSkill() {
		System.out.println("디바가 궁극기인 자폭을 사용합니다.");
	}

}
