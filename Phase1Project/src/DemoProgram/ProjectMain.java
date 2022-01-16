package DemoProgram;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class ProjectMain {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			welcomeScreen();
			try {
				menuDriven();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}

		
		/*
		 * This function is used to display the welcome screen on the console
		 */
		private static void welcomeScreen() {
			System.out.println("---------------WELCOME TO APPLICATION--------------------- \n");
			
			
		}

		/*
		 * This function is used for keep the menu for user interaction
		 * @throws FileNotFoundException 
		 */
		private static void menuDriven() throws FileNotFoundException {
			Scanner sc = new Scanner(System.in);
			FileDemo obj = new FileDemo();
			int option;
			do {
			System.out.println("Enter your choice which you want to select: \n");
			System.out.println("\t1. Retrieve current filenames in ascending order \n");
			System.out.println("\t2. Business-level operation menu \n");
			System.out.println("\t3. Exit from the application \n");
			
			option=sc.nextInt();
			switch(option) {
			case 1:
				obj.MainFolder();
				break;
			case 2:
				int ch;
			do {
				System.out.println("Enter your choice for Business level operation");
				System.out.println("\t1. Add a file and its content to a directory");
				System.out.println("\t2. Delete a file from a directory");
				System.out.println("\t3. Searching a file and showing its content");
				System.out.println("\t4. Exit from BOL menu");
				
				ch=sc.nextInt();
				switch(ch) {
				case 1:
					obj.AddFile();
					break;
				case 2:
					obj.deleteFile();
					break;
				case 3:
					obj.searchFile();
					break;
				case 4:
					System.out.println("Exited from the Business Level operation...");
					System.out.println("---------------------------------\n");
					break;
				default:
					System.out.println("Invalid Choice");
					break;
				}
			}while(ch!=4);
			break;
			case 3:
				System.out.println("Exiting from the application...");
				break;
			default:
				System.out.println("Invalid choice");
			}

			//System.out.println("Press 0 to continue");
			}while(option!=3);


		}

	}


