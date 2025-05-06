/*Exercise 1
Register system for users in Java

*/


import java.util.ArrayList;
import java.util.Scanner;

class Usuario{
    String nome;
    String email;
    String senha;

public Usuario(String nome, String email, String senha){
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    
}

public Usuario(){
    
}

}


public class RegisterSystem
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Usuario> usuarios = new ArrayList<>();
	
//Opt 1: Cadastro de novo usuário;
        int option = 0;
        while(option!=3){
        System.out.println("Option 1: Register new user");
//Opt 2:  Login;
        System.out.println("Option 2:  Login");
//Opt 3: Exit.
		System.out.println("Opt 3: Exit");
		 option = teclado.nextInt();
		teclado.nextLine();
	//	For Opt 1 (Register new user):
      
        if(option==1){
            System.out.println("Inform your username");
            String nome1 = teclado.nextLine();
            System.out.println("Inform your email");
            String email1 = teclado.nextLine();
            System.out.println("Inform your password");
            String senha1 = teclado.nextLine();
            
        Usuario user1 = new Usuario(nome1,email1,senha1);
        usuarios.add(user1);

        System.out.println("User added");
     
	}
	    if(option==2){
	        //Solicite ao usuário que insira seu email e senha; 
	        System.out.println("Inform your email");
	        String email2 = teclado.nextLine();
	        System.out.println("Inform your password");
	        String pass2 = teclado.nextLine();
	        if(usuarios.size()<1){
	            System.out.println("User not found");
	            } 
	       
	        for(int i=0;i<usuarios.size();i++){
	        if(usuarios.get(i).email.equals(email2)){ 
	            if(usuarios.get(i).senha.equals(pass2)){
	                int valor1=2;
	                while(valor1!=0){
	                System.out.println("Welcome!");
	                System.out.println("What do you want to do?");
	                System.out.println("1 - Edit data");
	                System.out.println("2 - View data");
	                System.out.println("3 - Exit");
	                int opcao = teclado.nextInt();
	                if(opcao==3){ //Opt 3: Exit.
	                    break;
	                }
	                else if(opcao==2){ //Opt 2: View account data;

	                    System.out.println("User: " + usuarios.get(i).nome);
	                    System.out.println("Email: " + usuarios.get(i).email);
	                    System.out.println("Password: " + usuarios.get(i).senha);
	                    
	                System.out.println("Do you want to exit the program?");
	                System.out.println("For yes, type 0;");
	                System.out.println("To remain on the program, type 1;");
	                valor1=teclado.nextInt();
	                }
	                else if(opcao==1){ //Opt 1: Edit account data;
	                 
	                    System.out.println("Which data do you want to edit?");
	                    System.out.println("1 - Username");
	                    System.out.println("2 - Email");
	                    System.out.println("3 - Password");
	                    int escolha2 = teclado.nextInt();
	                    teclado.nextLine();
	                    if(escolha2==1){
	                        System.out.println("Type your new user:");
	                        usuarios.get(i).nome = teclado.nextLine();
	                        System.out.println("Your new username is: " +usuarios.get(i).nome);
	                    }
	                    else if(escolha2==2){
	                    System.out.println("Type your new email");
	                    usuarios.get(i).email = teclado.nextLine();
	                    System.out.println("Your new email is: " +usuarios.get(i).email);
	                }
	                     else if(escolha2==3){
	                    System.out.println("Type your new password");
	                    usuarios.get(i).senha = teclado.nextLine();
	                    System.out.println("Your new password is: " +usuarios.get(i).senha);
	                }
	                System.out.println("Do you want to exit the program?");
	                System.out.println("For yes, type 0;");
	                System.out.println("To remain on the program, type 1;");
	                valor1=teclado.nextInt();
	                }
	            }
	                break;
	            }
	            System.out.println("Password incorrect");
	        }
	        else{
	            System.out.println("User incorrect");
	        }
	    }//fim for
	    }//fim if option 2
        }
	    if(option==3){
	        System.out.println("Good to have you here. See you soon.");
	        
	    }
	}
}
