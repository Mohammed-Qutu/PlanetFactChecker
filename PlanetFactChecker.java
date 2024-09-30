/*Mohammed Qutu
2/9/24
write methods, write conditionals, generate random numbers, 
and ask the user if the output is correct or incorrect.
 */
import java.util.Scanner;

public class PlanetFactChecker {

    public static void main(String[] args) {
        System.out.println("Random Planet fact will be generated and might be true or false.\n");
        int randomNumber = (int) (Math.random() * 10 + 1);
        boolean result = switchPlanet(randomNumber);
        compare(result);
    }

    public static boolean switchPlanet(int a) {
        switch (a) {
            case 1: {
                System.out.println("Mercury is the smallest planet in our solar system.");
                break;
            }
            case 2: {
                System.out.println("Venus is the hottest planet in our solar system due to its thick atmosphere.");
                break;
            }
            case 3: {
                System.out.println("Jupiter is the largest planet in our solar system.");
                break;
            }
            case 4: {
                System.out.println("Mars has the largest volcano in the solar system, Olympus Mons.");
                break;
            }
            case 5: {
                System.out.println("Neptune is the farthest planet from the Sun in our solar system.");
                break;
            }
            case 6: {
                System.out.println("Pluto is the largest planet in our solar system.");
                break;
            }
            case 7: {
                System.out.println("Earth is the closest planet to the Sun.");
                break;
            }
            case 8: {
                System.out.println("Saturn is a terrestrial planet composed mostly of rock and metal.");
                break;
            }
            case 9: {
                System.out.println("Uranus has a predominantly red coloration due to its surface composition.");
                break;
            }
            case 10: {
                System.out.println("Jupiter is composed mostly of water.");
                break;
            }
            default:
                System.out.println("Invalid");
        }

        // Facts 1-5 are true, 6-10 are false
        if (a >= 1 && a <= 5) {
            return true;
        } else {
            return false;
        }
    }

    public static void compare(boolean result) {
        System.out.println("Is the fact true or false?");
        
        Scanner keyboard = new Scanner(System.in);
        Boolean input = keyboard.nextBoolean();
        
        if (input == result) {
            System.out.println("CORRECT!");
        } else {
            System.out.println("INCORRECT!");
        }
    }
}
