package läxa_v49;

import java.util.Scanner;
import java.util.jar.Attributes.Name;


public class läxa_v49 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		// 100 tal i intervallet [0-9]
		int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};


		// 100 namn
		String[] names = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};
	
		// Initierar en räknare som används senare
		int counter = 0;
		
		input.close();
		
		
		//1//int x = uppgift1(numbers);
		//1//System.out.println(x);
		//2//System.out.println(uppgift2(names));
		//3//uppgift3(numbers);
		//4//uppgift4(names);
		//5//System.out.println(uppgift5(numbers));
	   //6//System.out.println(uppgift6(names));
		System.out.println(uppgift7(names));
	}
		
	public static int uppgift1(int[] numbers) {
		
	int counter = 0;
	for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] == 3){
				
				counter++;
			}
		}
		
		
		
		return counter;
		}

	public static int uppgift2(String[]names) {
		int counter = 0;
		for (int i = 0; i < names.length; i++) {
			
			if (names[i].equals("Tam") || names [i].equals("Tam")    ) {
				counter++;
			}
			
		}
		return counter;
		
		
		
	}
	//Vilket nummer finns det flest respektive minst utav i numbers?
	public static void uppgift3(int[]numbers) {
		
		int [] tal = new int[10];
		int counter = 0;
		for (int i = 0; i < 10; i++) {
			counter =0;
			for(int j = 0; j < numbers.length; j++ ) {
				if (numbers[j] == i){
				tal[i]=counter ++;
				}
			}
		}
		
		for (int i = 0; i < tal.length; i++) {
			System.out.println(i + " finns: " + tal[i] + "ggr ");
		}
		
	}	
	//På vilket index finns namnet Drusilla i names?
	public static void uppgift4(String[]names) {
		int counter = 0;
		for (int i = 0; i < names.length; i++) {
			counter ++;
			if(names[i].equals("Drusilla")) {
				System.out.println(counter);
			}
		}
	
		
	}
	
	

	public static int uppgift5(int[]numbers) {
	int counter = 0;
		for (int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] % 2 == 0) {
				counter +=numbers[1];
				
			}
		}
		return counter;
		
	}
	
	public static int uppgift6(String[]names) {
	int counter = 0;
	 
	for (int i = 0; i < names.length; i++) {
		if(names[i].charAt(0) == 'L')
			counter ++;
		}
		

		
	
	return counter;
	}
	
	public static int uppgift7(String[]names) {
		int counter = 0;
		
		for (int i = 0; i < names.length; i++) {
			if(names[i].length() == 5)
			counter ++;
		}

		return counter;
	}

	
}	
	















