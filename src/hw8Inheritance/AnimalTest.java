package hw8Inheritance;

public class AnimalTest {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.animalinfo(); // Animal class is the parent class of Mammal , Reptile and Birds Class
		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

		Mammal mammal = new Mammal();
		mammal.mammalInfo();// Mammal Reptile and birds is a child class of Animal Class
		mammal.animalinfo();
		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalinfo();
		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

		BullDog bullDog = new BullDog();
		bullDog.bulldongInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalinfo();
		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalinfo();
		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

		/*
		 * A derived class "Reptile" , inherits the properties from a single class
		 * parent (Animal) class Example of a single inheritance
		 */

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalinfo();
		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

		Cobra cobra = new Cobra();
		cobra.cobra();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalinfo();
		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

		/*
		 * Cobra extends Snake -> Reptile -> Animal A derived class is created from
		 * another derived class . This is called Multilevel Inheritance
		 */

		Birds birds = new Birds();
		birds.birdsInfo();
		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

		/*
		 * More then one class is created from a single parent class Mammal , Reptile ,
		 * and birds extends to Animal class Examples of Hierarchical Inheritance
		 */

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalinfo();
		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

	}

}
