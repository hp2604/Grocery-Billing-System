import java.util.*;
import java.util.Map.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int totalItem;
		Grocery g=new Grocery();
		System.out.println("Enter the number of items");
		totalItem =sc.nextInt();
		g.userProduct(totalItem);

		
	}
}
class Grocery
{
	 Scanner in=new Scanner(System.in);
	 private int cost=0;
	private 
HashMap<Integer,String> item=new HashMap<Integer,String>();
private List price=Arrays.asList(40,20,40,200,50,50,50,50,30,80,90,10,50,640,35,20,40,20,30,35);
 private ArrayList<Integer> products=new ArrayList<Integer>();
 private ArrayList<Integer> quantity=new ArrayList<Integer>();


// adding item 
private void add()
{
	item.put(101,"Sugar");
	item.put(102,"Salt");
	item.put(103,"Rice");
	item.put(104,"Wheat");
    item.put(105,"Dal");
    item.put(106,"Poha");
    item.put(107,"Oil");
    item.put(108,"eggs");
    item.put(109,"peas");
    item.put(110,"peanuts");
    item.put(111,"cashews");
    item.put(112,"almonds");
    item.put(113,"Milk");
    item.put(114,"ghee");
    item.put(115,"buttet");
    item.put(116,"Onion");
    item.put(117,"Tomatoes");
    item.put(118,"Potatoes");
    item.put(119,"Carrots");
    item.put(120,"Cabbage");	
}

// User  Product
public void userProduct(int n)
{
	 add();
	 int record, weight;//store user product
	for(int i=0;i<n;i++)
	{
	   System.out.print("Enter the Code : ");
	   record=in.nextInt();
	   products.add(record);
	   System.out.print("Enter the quantity : ");
	   weight=in.nextInt();
	   quantity.add(weight);
	}
	printBill(n);
	
}
private void printBill(int n)
{
	int key,remain;
	for(int i=0;i<22;i++)
   	{
   		System.out.print("---");
   	}
   	
   	System.out.println();
   	System.out.println("\t \t \t HP Pvt Ltd ");
   	
  	System.out.println();
System.out.println("Item\t\tCode\t\tPiece\t \tAmount");
System.out.println();

   	
   	for(int i=0;i<n;i++)
   	{ 
   	 key=products.get(i);
   	   remain=key%100-1;
    Integer total=(Integer)price.get(remain);
    total=quantity.get(i)*total;

  System.out.println( key+ "\t \t" + item.get(key)  + "\t \t" + quantity.get(i) + "\t \t" + total );
  cost=cost+total;
   	} 
   	System.out.println();
 	System.out.println("Total Price :  " + cost);
 	 System.out.println();
 	 System.out.println("THANK YOU ");
 	 		for(int i=0;i<22;i++)
   	{
   		System.out.print("---");
   	}
}
 
}
