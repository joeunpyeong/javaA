package pack01_new;

import java.util.Scanner;

public class UserJob {
	Scanner sc = new Scanner(System.in);
	Status[] state;
	void inspect() {}
	
}

class NormalJob extends UserJob {
	void inspect() {
		
	}

}

	class WarriorJob extends NormalJob {
		void inspect() {

	}

	}	

	class Archer extends NormalJob {
		void inspect() {

	}
	}

	class WizardJob extends NormalJob {
		void inspect() {

	}

	}

	class HealerJob extends NormalJob {
		void inspect() {

	}

	}

	
	
	
	
	
class HiddenJob extends UserJob {
	void inspect() {
		
	}
}
	class DragonKnite extends HiddenJob {
		void inspect() {
			
		}

	}