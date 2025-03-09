# Movie-Rating-System
Lab for ITSE-2321

# Movie-Rating-System
Lab for ITSE-2321

I asked myself how would I get movie names and ratings, so I used Scanner to get the user name, movie and ratings, which are then stored for further use. Then I calculated the average of the stored ratings which then prints a line with the user's movie rating average. Using that average, I used an if-else statement to reply to the user depending on their average rating. Then I inserted boolean statements to check if any ratings were equal to 10 or less than 4 then it would go to the nested if statements. The next one also uses boolean statements to check if all 5 movies are either high ratings or low ratings. The if-else statement afterwards would then print depending on which boolean statement comes back true. Then the code would ask you what your favorite movie genre is. Using a switch statement makes it simple to decide among multiple options. Using a conditional operator, everything other than "sci-fi" it would print "The Dark Knight" based on what you chose as your genre. The last bit validates the ratings of the user's inputs for each movie. It ensures that the user enters an integer(rating) for each movie. 



The way I like to think of nested if statements is that if the first if statement is true then it would go to the next if statement to also check if that is true. This can check for multiple levels of conditions to be checked.
While an if-else statement handles a single condition with two distinct paths, true or false.
Switch statements can be considered faster and more readable than nested if-else statements. If-else statements require the compiler to check each statement to determine if the conditions are met.
The conditional operator simplifies decision-making by allowing you to write clear condtional expressions in a single line which helps get rid of the need for an if-else statement. This makes the code more compact and easier to read. 
A short-circuit evaluation is a feature of the logical && and || operators. It makes the evaluation of the expression stop as soon as the result is determined. This makes logical expressions more efficient by stopping as soon as an outcome is calculated. 
