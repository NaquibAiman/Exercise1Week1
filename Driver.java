public class Driver {

	public static void main(String [] arg){
		//Fish actually is a data type
		//Fish nemo; == int x;
		Fish nemo = new Fish();

		nemo.Swim();
		nemo.color = "red"; //tukar value
		nemo.Swim();

		Fish dory = new Fish();

		dory.Swim();
		dory.color = "green";
		dory.Swim();;
	}
}