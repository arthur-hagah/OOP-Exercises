
/*Exercise 2
Products Management System in Java
*/


import java.util.ArrayList;
import java.util.Scanner;

class Produto {
	String nome;
	int codigo;
	double preco;

	public Produto(String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;

	}

	public Produto() {

	}

}


public class ProductManagement
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		
		int option = 0;
		while(option!=4) {
			System.out.println("Option 1: Add new product");
			System.out.println("Option 2: View products list");
			System.out.println("Option 3: Remove product");

			System.out.println("Option 4: Exit");
			option = teclado.nextInt();
			teclado.nextLine();
			/*Opt 1 > add new product
			Verify wheter product code alreadu exists in the system. If so, error message.
			*/
        int produtorepetido = 0;
			if(option==1) {
				System.out.println("Inform product name");
				String nome1 = teclado.nextLine();
				System.out.println("Inform product code");
				int codigo1 = teclado.nextInt();
				System.out.println("Inform product price");
				double preco1 = teclado.nextDouble();
                
                for(int idx=0; idx<produtos.size(); idx++) {
                    if(produtos.get(idx).codigo==codigo1){
                        System.out.println("Error, code already exists.");
                        produtorepetido = 1;
                        break;
                       
                    }
                }
                 if(produtorepetido==0){
//If code not repeated, create new object Produto with supplied data and add on ArrayList;

				Produto prod1 = new Produto(nome1,codigo1,preco1);
				produtos.add(prod1);
				System.out.println("Product added");
				
/*Opt 2: View product list
*/

}
			}//end of option 1
			if(option==2) {
			if(produtos.size()<1){
			    System.out.println("Empty list");
			}
			else{
				for(int i=0; i<produtos.size(); i++) {
				    System.out.println("Product: "+(i+1));
				    System.out.println("Description: "+produtos.get(i).nome);
				    System.out.println("Code: "+produtos.get(i).codigo);
				    System.out.println("R$ "+produtos.get(i).preco);
				    System.out.println(" ");
				}
			}
					
		}
		/* Option 3: Remove product:
*/
		if(option==3) {
			System.out.println("Inform the code of the product to be removed");
			int cod3 = teclado.nextInt();
			for(int i=0; i<produtos.size(); i++) {
			    if(produtos.get(i).codigo==cod3) {
			        produtos.remove(i);
			        System.out.println("Product removed");
			        System.out.println();
			        
			    }
			}
            if(produtos.size()<1){
                System.out.println("Empty list: Nothing else to remove."); //informa que a lista está vazia quando remove ultimo produto ou se nao tiver produtos
            }
		}
		
		
		
		if(option==4) {
			System.out.println("Good to have you here. See you soon.");

		}
	}
}
}