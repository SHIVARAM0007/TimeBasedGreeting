// import java.util.Scanner;

// public class GreetingFunctions {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Welcome to the Greeting Program!");
//         System.out.println("Choose a greeting:");
//         System.out.println("1: Morning Greeting");
//         System.out.println("2: Afternoon Greeting");
//         System.out.println("3: Evening Greeting");
//         System.out.println("4: Custom Greeting");
//         System.out.println("5: Exit");
//         System.out.print("Enter your choice: ");

//         int choice = scanner.nextInt();
//         scanner.nextLine(); // Consume the newline character

//         // Call the appropriate function based on the user's choice
//         switch (choice) {
//             case 1:
//                 morningGreeting();
//                 break;
//             case 2:
//                 afternoonGreeting();
//                 break;
//             case 3:
//                 eveningGreeting();
//                 break;
//             case 4:
//                 System.out.print("Enter your name for a custom greeting: ");
//                 String name = scanner.nextLine();
//                 customGreeting(name);
//                 break;
//             case 5:
//                 System.out.println("Goodbye! Have a great day!");
//                 break;
//             default:
//                 System.out.println("Invalid choice! Please try again.");
//         }

//         scanner.close();
//     }

//     // Function for morning greeting
//     public static void morningGreeting() {
//         System.out.println("Good Morning! Have a wonderful day ahead!");
//     }

//     // Function for afternoon greeting
//     public static void afternoonGreeting() {
//         System.out.println("Good Afternoon! Hope you're having a great day!");
//     }

//     // Function for evening greeting
//     public static void eveningGreeting() {
//         System.out.println("Good Evening! Relax and enjoy your evening!");
//     }

//     // Function for custom greeting
//     public static void customGreeting(String name) {
//         System.out.println("Hello, " + name + "! Welcome and have a fantastic day!");
//     }
// }



import java.time.LocalTime;

public class TimeBasedGreeting {
    public static void main(String[] args) {
        // Get the current hour
        int currentHour = LocalTime.now().getHour();

        // Determine the appropriate greeting based on the time
        if (currentHour >= 5 && currentHour < 12) {
            morningGreeting();
        } else if (currentHour >= 12 && currentHour < 17) {
            afternoonGreeting();
        } else if (currentHour >= 17 && currentHour < 21) {
            eveningGreeting();
        } else {
            nightGreeting();
        }
    }

    // Function for morning greeting
    public static void morningGreeting() {
        System.out.println("Good Morning! Have a wonderful day ahead!");
    }

    // Function for afternoon greeting
    public static void afternoonGreeting() {
        System.out.println("Good Afternoon! Hope you're having a productive day!");
    }

    // Function for evening greeting
    public static void eveningGreeting() {
        System.out.println("Good Evening! Relax and enjoy your evening!");
    }

    // Function for night greeting
    public static void nightGreeting() {
        System.out.println("Good Night! Sleep well and sweet dreams!");
    }
}
