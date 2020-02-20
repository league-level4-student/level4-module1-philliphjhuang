package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void displayZodiac(Zodiac z) {
		switch(z) {
		case ARIES:
			System.out.println("You are Aries");
			break;
		case TAURUS:
			System.out.println("You are Taurus");
			break;
		case GEMINI:
			System.out.println("You are Gemini");
			break;
		case CANCER:
			System.out.println("You are Cancer");
			break;
		case LEO:
			System.out.println("You are Leo");
			break;
		case VIRGO:
			System.out.println("You are Virgo");
			break;
		case LIBRA:
			System.out.println("You are Libra");
			break;
		case SCORPIO:
			System.out.println("You are Scorpio");
			break;
		case SAGITTARIUS:
			System.out.println("You are Sagittarius");
			break;
		case CAPRICORN:
			System.out.println("You are Capricorn");
			break;
		case AQUARIUS:
			System.out.println("You are Aquarius");
			break;
		case PISCES:
			System.out.println("You are Pisces");
			break;
		default:
			System.out.println("You are not anything");
			break;
		}
		
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac z = Zodiac.TAURUS;
		displayZodiac(z);
	}
}
