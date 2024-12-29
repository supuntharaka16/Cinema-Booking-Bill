import java.util.*;
class Movie{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("==================================================================================================");
		System.out.println("||                                                                                               ||");
		System.out.println("||                                                                                               ||");
                System.out.println("||                                             -'%@@%'-                                          ||");
		System.out.println("||                                           '@@@@@@@@@@@'                                       ||");
		System.out.println("||                           %#@@#%         '@@@@@@@@@@@@@'                                      ||");	
		System.out.println("||                         @@@@@@@@@@      @@@@@@@@@@@@@@@@%                                     ||");
		System.out.println("||                        @@@@@@@@@@@@      '@@@@@@@@@@@@@'                                      ||");
		System.out.println("||                         @@@@@@@@@@        '@@@@@@@@@@@'                                       ||");
		System.out.println("||                           %#@@#%            -'%@@%'-                                          ||");
		System.out.println("||                    -#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#-                                    ||");
		System.out.println("||                   '@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'         +%@#                     ||");
		System.out.println("||                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    +#@@@@@@@                     ||");
		System.out.println("||                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                     ||");
		System.out.println("||                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                     ||");
		System.out.println("||                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                     ||");
		System.out.println("||                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                     ||");
		System.out.println("||                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    +#@@@@@@@                     ||");
		System.out.println("||                   '@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@'         +%@#                     ||");
		System.out.println("||                    -#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#-                                    ||");
		System.out.println("||                                  -%@@@++@@@%                                                  ||");
		System.out.println("||                                -@@@%-    %@@@-                                                ||");
		System.out.println("||                               -%%-         -%%-                                               ||");
		System.out.println("||                                                                                               ||");
		System.out.println("||                _____   ________________     _______________   ___________   _________         ||");
		System.out.println("||               /  _  \\/__    __/   ___/    /  ____/    /   \\/  / ___/   \\/   /  _  \\       ||");
		System.out.println("||              / ^   _/    /  / _\\  \\     /  /____/   //       /  _//  /\\_/  /  ___  \\      ||");
		System.out.println("||             /_/ \\_\\   /__/ /_____/     \\____/ _____/__/\\__/____/__/   /__/__/   \\_\\     ||");
		System.out.println("||                                                                                               ||");
		System.out.println("||                                                                                               ||");
		System.out.println("||                                                                                               ||");
		System.out.println("||                                                                                               ||");
		System.out.println("===================================================================================================");
		System.out.print("Enter Date : ");
		String date = input.next();
		System.out.print("Location : ");
		String location = input.next();
		System.out.println();
		System.out.println("                        ___                   _ _        _     __              _____ _ _                    ");
		System.out.println("                       / _ \\___   _______ __(_) |___  _| |___|  |_____       |  ___(_) |_ ____   _____     ");
		System.out.println("                      /  _  \\  \\/  /  _ `  | | /  _`  | '__ \\ /  - _)      |  _| | | | '    \\(__- <     ");
		System.out.println("                     /__/ \\_\\____/\\____ __|_|_\\__ __|_'___/__\\____|      |__|  |_|_|_|__|_/ ____/      ");
		System.out.println("                                                                                                              ");
		System.out.println("                    ========================================================================================= ");
		System.out.println("1) Movie 1 - Hall 1\t 2)Movie 2 - Hall 2");
		System.out.println("3) Movie 3 - Hall 3\t 4)Movie 4 - Hall 4");
		System.out.print("Enter Movie Number :");
		int movie = input.nextInt();
		System.out.println("                                _______                                   ");
		System.out.println("                               |__   __|_                                 ");
		System.out.println("                                  | |  (_)_  __ __  ___                   ");
		System.out.println("                                  | |  | | `_  `_\\/ _ \\                 ");
		System.out.println("                                  | |  | | | | | |   __/                  ");
		System.out.println("                                  |_|  |_| |_| |_|\\___|                   ");
		System.out.println("                      =============================================== ");
		System.out.println("                                          1) 9.00 A.M\n ");
		System.out.println("                                          2) 2.00 A.M \n");
		System.out.println("                                          3) 7.00 A.M");
		System.out.print("Enter Time :");
		String time = input.next();
		System.out.println("                   _____              _                                         ");
		System.out.println("                  /  __ \\           | |                                        ");
		System.out.println("                  | /  \\/_    _  ___| |_ ____   _ ___ ___   __  _ __           ");
		System.out.println("                  | |    | |  |  / __| __/  _ \\| `_  ` _ \\/ _\\ `__|          ");
		System.out.println("                  |\\__/\\ |__|  \\__\\||  (_)  | | | | | |  __/ |              ");
		System.out.println("                   \\___/ \\__,__| __/\\_\\____/|_| |_| |_|\\__|_|              ");
		System.out.println("             ================================================================== ");
		int x = 90;
		System.out.print("name : ");
		String name = input.next();
		System.out.print("phone Number :");
		long phone = input.nextLong();
		System.out.print("Child OR Parent :");
		String child = input.next();
		System.out.print("Number of Tickets :");
		int number = input.nextInt();
		System.out.print("Tax :");
		int taxpercentage = input.nextInt();
		int tax = (taxpercentage * x)/100;
		System.out.println("+=================================================================================================+");
		System.out.println("||                _____   ________________     _______________   ___________   _________         ||");
		System.out.println("||               /  _  \\/__    __/   ___/    /  ____/    /   \\/  / ___/   \\/   /  _  \\       ||");
		System.out.println("||              / ^   _/    /  / _\\  \\     /  /____/   //       /  _//  /\\_/  /  ___  \\      ||");
		System.out.println("||             /_/ \\_\\   /__/ /_____/     \\____/ _____/__/\\__/____/__/   /__/__/   \\_\\     ||");
		System.out.println("||  Date :   "+ date+"                                                 Location :  "+ location+" ||");
                System.out.println("||-----------------------------------------------------------------------------------------------||");
                System.out.println("||                                                                                               ||");
                System.out.println("||                                                                                               ||");
                System.out.println("|| Name             :       " + name + "                                                         ||");
                System.out.println("|| Phone Number     :       " + phone + "                                                        ||");
                System.out.println("|| Child OR Parent  :       " + child  + "                                                       ||");
                System.out.println("|| Number of Tickets:       " + number + "                                                       ||");
                System.out.println("|| Hall             :       " + movie + "                                                        ||");
                System.out.println("|| Tax              :       " + tax + "                                                          ||");
                System.out.println("||                                                                                               ||");
                System.out.println("||                                                                                               ||");
                System.out.println("|| Total Amount     : " +((x * number) + tax) + "                                                   ||");
                System.out.println("||                                                                                               ||");
                System.out.println("||                                                                                               ||");
                System.out.println("+=================================================================================================+");

	}
}