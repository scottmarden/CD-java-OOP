public class ProjectTest {
	public static void main(String[] args){
		Project elevatorPitchTest = new Project("Test Project", "A test of project creation and elevator pitching.");

		System.out.println(elevatorPitchTest.elevatorPitch());
	}
}
