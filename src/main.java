import java.util.Scanner;

import gudusoft.gsqlparser.EDbVendor;
import gudusoft.gsqlparser.TGSqlParser;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TGSqlParser sqlparser = new TGSqlParser(EDbVendor.dbvoracle);
		boolean cont = true;
		Scanner scan = new Scanner(System.in);
		String userInput;
		String [] command;
		int adfjklsfjd = 10;
		while(cont){
			userInput = scan.nextLine();
			command = userInput.split(" ");
			
			if(command[0].equals("CREATE")){
				System.out.println("Creating Table...");
				CreateTable ct = new CreateTable(userInput);
				ct.create();				
			}
			else if(command[0].equals("DROP")){
				System.out.println("Dropping Table");
			}
			else if(command[0].equals("SELECT")){
				
			} else if(command[0].equals("INSERT")){
				
			} else if(command[0].equals("DELETE")){
				
			} else if(command[0].equals("UPDATE")){
				
			} else if(command[0].equals("HELP")){
				if(command[1].equals("TABLES")){
					// Print out Table
				} else if(command[1].equals("DESCRIBE")){
					
				} else {
					// HELP CMD
				}
				
			} else if(command[0].equals("QUIT")){
				System.out.println("Quitting...");
				System.exit(0);
			}
			
		}
		
				
	}

}
