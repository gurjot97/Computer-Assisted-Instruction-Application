import java.util.Scanner;
import java.security.SecureRandom;

public class CAI_varying_types_of_problems {

	private static Scanner input = new Scanner(System.in);
	private static SecureRandom randomNumber = new SecureRandom();
	
	public static void main(String[] args) {
		
		boolean reRun = true;
		
		while(reRun != false) {
			
			boolean problemTypeRequirement = false;
			int problemType = 0;
			
			while(problemTypeRequirement != true) {
			
					System.out.println("Please pick a type of arithmetic problem to study:\n" +
								   "Enter \"1\" for only addition problems\n" +
								   "Enter \"2\" for only subtraction problems\n" +
								   "Enter \"3\" for only multiplication problems\n" +
								   "Enter \"4\" for only division problems\n" +
								   "Enter \"5\" for a random mixture of all problem listed above");
					problemType = input.nextInt();
					
					switch(problemType) {
					
					case 1: case 2: case 3: case 4: case 5:
						problemTypeRequirement = true;
						break;
					
					default:
						System.out.println("Sorry, invalid input! Please try again.\n");
						problemTypeRequirement = false;
					}
			}
			
			switch(problemType) {
			
			case 1:
				problemTypeAddition();
				break;
				
			case 2:
				problemTypeSubtraction();
				break;
				
			case 3:
				problemTypeMultiplication();
				break;
				
			case 4:
				problemTypeDivision();
				break;
				
			case 5:
				problemTypeAllRandom();
				break;
			}
			
			System.out.println("Would you like to study another problem type? 'y' or 'n'");
			char choice = input.next().charAt(0);
			
			if(choice == 'y') {
				System.out.println("\n\nProgram has been reset!\n\n");
				reRun = true;
			}
			else if(choice == 'n') {
				System.out.println("\n\nEnd of program!\n\n");
				reRun = false;
			}
		}
	}
	
	public static void problemTypeAddition() {
		
		int counter = 0;
		int numOfCorrectAnswers = 0;
		int numOfIncorrectAnswers = 0;
		int difficulty = 0;
		
		while(difficulty <= 0) {
			
			System.out.println("Please select the problem difficulty " + 
							   "(ex. selecting lvl. \"1\" creates study problems using single digits): ");
			difficulty = input.nextInt();
			
			if(difficulty <= 0) {
				System.out.println("Sorry, invalid input! PLease try again.\n");
			}
		}
			
		while(counter < 10) {
			
			int val1 = generateRandomNumber(difficulty);
			int val2 = generateRandomNumber(difficulty);
			int userAnswer = 0;
			
			int realAnswer = val1 + val2;
			
			boolean answer = false;
			
			while(answer != true) {
				
				System.out.println("How much is " + val1 + " added by " + val2 + "?");
				userAnswer = input.nextInt();
				
				if(userAnswer == realAnswer) {
					responsesToCorrectAnswer();
					numOfCorrectAnswers++;
					answer = true;
				}
				else if(userAnswer != realAnswer) {
					responsesToIncorrectAnswer();
					numOfIncorrectAnswers++;
					answer = false;
				}
			}

			counter++;
		}
		
		finalResults(numOfCorrectAnswers, numOfIncorrectAnswers, counter);
	}
	
	public static void problemTypeSubtraction() {
		
		int counter = 0;
		int numOfCorrectAnswers = 0;
		int numOfIncorrectAnswers = 0;
		int difficulty = 0;
		
		while(difficulty <= 0) {
			
			System.out.println("Please select the problem difficulty " + 
							   "(ex. selecting lvl. \"1\" creates study problems using single digits): ");
			difficulty = input.nextInt();
			
			if(difficulty <= 0) {
				System.out.println("Sorry, invalid input! PLease try again.\n");
			}
		}
			
		while(counter < 10) {
			
			int val1 = generateRandomNumber(difficulty);
			int val2 = generateRandomNumber(difficulty);
			int userAnswer = 0;
			
			int realAnswer = val1 - val2;
			
			boolean answer = false;
			
			while(answer != true) {
				
				System.out.println("How much is " + val1 + " subtracted by " + val2 + "?");
				userAnswer = input.nextInt();
				
				if(userAnswer == realAnswer) {
					responsesToCorrectAnswer();
					numOfCorrectAnswers++;
					answer = true;
				}
				else if(userAnswer != realAnswer) {
					responsesToIncorrectAnswer();
					numOfIncorrectAnswers++;
					answer = false;
				}
			}

			counter++;
		}
		
		finalResults(numOfCorrectAnswers, numOfIncorrectAnswers, counter);
	}
	
	public static void problemTypeMultiplication() {
		
		int counter = 0;
		int numOfCorrectAnswers = 0;
		int numOfIncorrectAnswers = 0;
		int difficulty = 0;
		
		while(difficulty <= 0) {
			
			System.out.println("Please select the problem difficulty " + 
							   "(ex. selecting lvl. \"1\" creates study problems using single digits): ");
			difficulty = input.nextInt();
			
			if(difficulty <= 0) {
				System.out.println("Sorry, invalid input! PLease try again.\n");
			}
		}
			
		while(counter < 10) {
			
			int val1 = generateRandomNumber(difficulty);
			int val2 = generateRandomNumber(difficulty);
			int userAnswer = 0;
			
			int realAnswer = val1 * val2;
			
			boolean answer = false;
			
			while(answer != true) {
				
				System.out.println("How much is " + val1 + " multiplied by " + val2 + "?");
				userAnswer = input.nextInt();
				
				if(userAnswer == realAnswer) {
					responsesToCorrectAnswer();
					numOfCorrectAnswers++;
					answer = true;
				}
				else if(userAnswer != realAnswer) {
					responsesToIncorrectAnswer();
					numOfIncorrectAnswers++;
					answer = false;
				}
			}

			counter++;
		}
		
		finalResults(numOfCorrectAnswers, numOfIncorrectAnswers, counter);
	}
	
	public static void problemTypeDivision() {
		
		int counter = 0;
		int numOfCorrectAnswers = 0;
		int numOfIncorrectAnswers = 0;
		int difficulty = 0;
		
		while(difficulty <= 0) {
			
			System.out.println("Please select the problem difficulty " + 
							   "(ex. selecting lvl. \"1\" creates study problems using single digits): ");
			difficulty = input.nextInt();
			
			if(difficulty <= 0) {
				System.out.println("Sorry, invalid input! PLease try again.\n");
			}
		}
			
		while(counter < 10) {
			
			int val1 = generateRandomNumber(difficulty);
			int val2 = generateRandomNumber(difficulty);
			int userAnswer = 0;
			
			int realAnswer = val1 / val2;
			
			boolean answer = false;
			
			while(answer != true) {
				
				System.out.println("How much is " + val1 + " divided by " + val2 + "?");
				userAnswer = input.nextInt();
				
				if(userAnswer == realAnswer) {
					responsesToCorrectAnswer();
					numOfCorrectAnswers++;
					answer = true;
				}
				else if(userAnswer != realAnswer) {
					responsesToIncorrectAnswer();
					numOfIncorrectAnswers++;
					answer = false;
				}
			}

			counter++;
		}
		
		finalResults(numOfCorrectAnswers, numOfIncorrectAnswers, counter);
	}
	
	public static void problemTypeAllRandom() {
		
		int counter = 0;
		int numOfCorrectAnswers = 0;
		int numOfIncorrectAnswers = 0;
		int difficulty = 0;
		
		while(difficulty <= 0) {
			
			System.out.println("Please select the problem difficulty " + 
							   "(ex. selecting lvl. \"1\" creates study problems using single digits): ");
			difficulty = input.nextInt();
			
			if(difficulty <= 0) {
				System.out.println("Sorry, invalid input! PLease try again.\n");
			}
		}
			
		while(counter < 10) {
			
			int val1 = generateRandomNumber(difficulty);
			int val2 = generateRandomNumber(difficulty);
			int userAnswer = 0;
			int realAnswer = 0;
			
			int randomProblem = 1 + randomNumber.nextInt(4);
			
			switch(randomProblem) {
			
			case 1:
				realAnswer = val1 + val2;
				break;
				
			case 2:
				realAnswer = val1 - val2;
				break;
				
			case 3:
				realAnswer = val1 * val2;
				break;
				
			case 4:
				realAnswer = val1 / val2;
				break;
			}
			
			
			boolean answer = false;
			
			while(answer != true) {
				
				switch(randomProblem) {
				
				case 1:
					System.out.println("How much is " + val1 + " added by " + val2 + "?");
					break;
					
				case 2:
					System.out.println("How much is " + val1 + " subtracted by " + val2 + "?");
					break;
					
				case 3:
					System.out.println("How much is " + val1 + " multiplied by " + val2 + "?");
					break;
					
				case 4:
					System.out.println("How much is " + val1 + " divided by " + val2 + "?");
					break;
				}
				
				userAnswer = input.nextInt();
				
				if(userAnswer == realAnswer) {
					responsesToCorrectAnswer();
					numOfCorrectAnswers++;
					answer = true;
				}
				else if(userAnswer != realAnswer) {
					responsesToIncorrectAnswer();
					numOfIncorrectAnswers++;
					answer = false;
				}
			}

			counter++;
		}
		
		finalResults(numOfCorrectAnswers, numOfIncorrectAnswers, counter);
	}
	
	public static int generateRandomNumber(int difficultyLevel) {
		
		int randomValue = ( (int) (1*(Math.pow(10, difficultyLevel - 1) )) ) + 
					randomNumber.nextInt( (int) (9*(Math.pow(10, difficultyLevel - 1) )) );
		
		return randomValue;
	}
	
	public static void responsesToCorrectAnswer() {
		
		int randomResponse = 1 + randomNumber.nextInt(4);
		
		switch(randomResponse) {
		
		case 1:
			System.out.println("Very good!\n");
			break;
		case 2:
			System.out.println("Excellent!\n");
			break;
		case 3:
			System.out.println("Nice work!\n");
			break;
		case 4:
			System.out.println("Keep up the good work!\n");
			break;
		}
	}
	
	public static void responsesToIncorrectAnswer() {
		
		int randomResponse = 1 + randomNumber.nextInt(4);
		
		switch(randomResponse) {
		
		case 1:
			System.out.println("No. Please try again.\n");
			break;
		case 2:
			System.out.println("Wrong. Try once more.\n");
			break;
		case 3:
			System.out.println("Don't give up!\n");
			break;
		case 4:
			System.out.println("No. Keep trying.\n");
			break;
		}
	}
	
	public static void finalResults(int numOfCorrectAnswers, int numOfIncorrectAnswers, int counter) {
		
		int ratio = (int) (( ( (double) (numOfCorrectAnswers - numOfIncorrectAnswers) / counter))*(100));
		System.out.println("Correct Answers: " + numOfCorrectAnswers +
						 "\nIncorrect Answers: " + numOfIncorrectAnswers +
						 "\nFinal mark: " + ratio + "%");
		
		if(ratio >= 75) {
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
		else if(ratio < 75) {
			System.out.println("Please ask your teacher for extra help.");
		}
	}
}
