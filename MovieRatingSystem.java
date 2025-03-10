import java.util.Scanner;

public class MovieRatingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompts user for name
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        // Setting up array
        String[] movies = new String[5];
        int[] ratings = new int[5];

        // Ask for 5 movies and their ratings
        System.out.print("Enter the name of the first movie: ");
        movies[0] = scanner.nextLine();
        ratings[0] = getValidRating(scanner, movies[0]);

        System.out.print("Enter the name of the second movie: ");
        movies[1] = scanner.nextLine();
        ratings[1] = getValidRating(scanner, movies[1]);

        System.out.print("Enter the name of the third movie: ");
        movies[2] = scanner.nextLine();
        ratings[2] = getValidRating(scanner, movies[2]);

        System.out.print("Enter the name of the fourth movie: ");
        movies[3] = scanner.nextLine();
        ratings[3] = getValidRating(scanner, movies[3]);

        System.out.print("Enter the name of the fifth movie: ");
        movies[4] = scanner.nextLine();
        ratings[4] = getValidRating(scanner, movies[4]);

        // Calculates the Average Rating
        double average = (ratings[0] + ratings[1] + ratings[2] + ratings[3] + ratings[4]) / 5.0;
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
        boolean foundMasterpiece = (ratings[0] == 10 || ratings[1] == 10 || ratings[2] == 10 || ratings[3] == 10 || ratings[4] == 10); // boolean statements to check if any of the ratings of the movies were a 10
        boolean foundDisappointment = (ratings[0] < 4 || ratings[1] < 4 || ratings[2] < 4 || ratings[3] < 4 || ratings[4] < 4); // boolean statement to check if any of the ratings for the movies is 4 or below

        if (foundMasterpiece) {
            if (ratings[0] == 10) {
                System.out.println("Wow! You found a masterpiece: " + movies[0] + " with a rating of " + ratings[0]);
            }
            if (ratings[1] == 10) {
                System.out.println("Wow! You found a masterpiece: " + movies[1] + " with a rating of " + ratings[1]);
            }
            if (ratings[2] == 10) {
                System.out.println("Wow! You found a masterpiece: " + movies[2] + " with a rating of " + ratings[2]);
            }
            if (ratings[3] == 10) {
                System.out.println("Wow! You found a masterpiece: " + movies[3] + " with a rating of " + ratings[3]);
            }
            if (ratings[4] == 10) {
                System.out.println("Wow! You found a masterpiece: " + movies[4] + " with a rating of " + ratings[4]);
            }
        }

        if (foundDisappointment) {
            if (ratings[0] < 4) {
                System.out.println("That movie didn't impress you much: " + movies[0] + " with a rating of " + ratings[0]);
            }
            if (ratings[1] < 4) {
                System.out.println("That movie didn't impress you much: " + movies[1] + " with a rating of " + ratings[1]);
            }
            if (ratings[2] < 4) {
                System.out.println("That movie didn't impress you much: " + movies[2] + " with a rating of " + ratings[2]);
            }
            if (ratings[3] < 4) {
                System.out.println("That movie didn't impress you much: " + movies[3] + " with a rating of " + ratings[3]);
            }
            if (ratings[4] < 4) {
                System.out.println("That movie didn't impress you much: " + movies[4] + " with a rating of " + ratings[4]);
            }
        }

        // Identify Consistent Ratings using logical operators
        boolean allHighRatings = (ratings[0] >= 7 && ratings[1] >= 7 && ratings[2] >= 7 && ratings[3] >= 7 && ratings[4] >= 7); 
        boolean veryLowRating = (ratings[0] < 3 || ratings[1] < 3 || ratings[2] < 3 || ratings[3] < 3 || ratings[4] < 3);

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
