import java.util.ArrayList;
import java.util.Scanner;


public class bookMain {

	public static void main(String[] args) {
		
		ArrayList<books> bookList = new ArrayList<books>();
		books booksObj = new books("Java101","Great book", "Mahder", "Great teacher with great book",50.0);
		books JBcamp = new books("Java202", "Step by Step", "Fee", "Great teacher with great smile", 150.0);
		books Books = new books("Java303", "Advanced", "Nicklas", "Great Proffesor with great smile", 150.0);
		bookList.add(booksObj);
		bookList.add(JBcamp);
		bookList.add(Books);
		String SKU;
				
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the SKU  : ");
		SKU = input.nextLine();
		
		for(int i=0; i<bookList.size();i++){
		
			if(bookList.get(i).getSKU().equalsIgnoreCase(SKU)){
				System.out.println("The book Author is : " + bookList.get(i).getAuthor());
			}
		}
 
		  input.close();
	}
}
