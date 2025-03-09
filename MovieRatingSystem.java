import java.util.Scanner;

public class MovieRatingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompts user for name
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        // Ask for 5 movies and their ratings
        System.out.print("Enter the name of the first movie: ");
        String movie1 = scanner.nextLine();
        int rating1 = getValidRating(scanner, movie1);

        System.out.print("Enter the name of the second movie: ");
        String movie2 = scanner.nextLine();
        int rating2 = getValidRating(scanner, movie2);

        System.out.print("Enter the name of the third movie: ");
        String movie3 = scanner.nextLine();
        int rating3 = getValidRating(scanner, movie3);

        System.out.print("Enter the name of the fourth movie: ");
        String movie4 = scanner.nextLine();
        int rating4 = getValidRating(scanner, movie4);

        System.out.print("Enter the name of the fifth movie: ");
        String movie5 = scanner.nextLine();
        int rating5 = getValidRating(scanner, movie5);

        // Calculates the Average Rating
        double average = (rating1 + rating2 + rating3 + rating4 + rating5) / 5.0;
        System.out.println("\nYour average movie rating is: " + average);

        // Implement Rating Classification using if-else statements
        if (average >= 9) {
            System.out.println("You are a cinephile!");
        } else if (average >= 7) {
            System.out.println("You enjoy movies quite a bit.");
        } else if (average >= 5) {
            System.out.println("You have mixed feelings about movies.");
        } else {
            System.out.println("You are a tough critic!");
        }

        // Check for a Favorite Movie using nested if statements
        boolean foundMasterpiece = (rating1 == 10 || rating2 == 10 || rating3 == 10 || rating4 == 10 || rating5 == 10); // boolean statements to check if any of the ratings of the movies were a 10
        boolean foundDisappointment = (rating1 < 4 || rating2 < 4 || rating3 < 4 || rating4 < 4 || rating5 < 4); // boolean statement to check if any of the ratings for the movies is 4 or below

        if (foundMasterpiece) {
            System.out.println("Wow! You found a masterpiece.");
        }
        if (foundDisappointment) {
            System.out.println("That movie didn’t impress you much.");
        }

        // Identify Consistent Ratings using logical operators
        boolean allHighRatings = (rating1 >= 7 && rating2 >= 7 && rating3 >= 7 && rating4 >= 7 && rating5 >= 7); 
        boolean veryLowRating = (rating1 < 3 || rating2 < 3 || rating3 < 3 || rating4 < 3 || rating5 < 3);

        if (allHighRatings) {
            System.out.println("You seem to enjoy most movies.");
        } else if (veryLowRating) {
            System.out.println("You have strong opinions on movies!");
        }

        // Switch statement to ask for genre preferences
        System.out.print("\nEnter your favorite movie genre (Action, Comedy, Horror, Drama, Sci-Fi): ");
        String genre = scanner.nextLine().toLowerCase();

        switch (genre) {
            case "action":
                System.out.println("You love excitement and thrills!");
                break;
            case "comedy":
                System.out.println("You enjoy a good laugh.");
                break;
            case "horror":
                System.out.println("You have a taste for fear!");
                break;
            case "drama":
                System.out.println("You appreciate deep storytelling.");
                break;
            case "sci-fi":
                System.out.println("You love futuristic and imaginative worlds!");
                break;
            default:
                System.out.println("That's an interesting choice!"); // Used when user inputs an unrecognized genre that was listed above.
        }

        // Conditional Operator for Movie Recommendation
        String recommendedMovie = genre.equals("sci-fi") ? "Interstellar" : "The Dark Knight";
        System.out.println("Based on your preference, you might enjoy: " + recommendedMovie);

        scanner.close();
    }

    // Validating Ratings
    private static int getValidRating(Scanner scanner, String movie) {
        while (true) {
            System.out.print("Rate " + movie + " (1-10): ");
            // Checks when user inputs an integer
            if (scanner.hasNextInt()) {
                int rating = scanner.nextInt();
                scanner.nextLine(); // Consume the leftover newline
                if (rating >= 1 && rating <= 10) {
                    return rating;
                }
            } else {
                scanner.nextLine(); // Consume the invalid input
            }
            System.out.println("Invalid rating. Please enter a number between 1 and 10.");
        }
    }
}
