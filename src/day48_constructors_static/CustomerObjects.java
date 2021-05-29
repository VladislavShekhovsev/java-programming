package day48_constructors_static;

import java.util.ArrayList;

public class CustomerObjects {
    public static void main(String[] args) {

        Customer cs1 = new Customer();
        System.out.println(cs1);// print default values
        cs1.setName("Bod");
        cs1.setId(1);
        System.out.println(cs1);
        Customer cs2 = new Customer("Mike",2);// create object and assign values in same statement
        Customer cs3 = new Customer("john Ward III",4873);
        System.out.println(cs2);
        System.out.println(cs3);
        // Array of customers
        Customer[] todaysCustomers ={cs1,cs2,cs3,new Customer("Bashir",449)};
        //Array list of customer objects
        ArrayList<Customer>customers = new ArrayList<>();
        customers.add(cs1);
        customers.add(cs2);
        customers.add(cs3);
        customers.add(new Customer("Vlad",137));
        customers.add(new Customer("Suleyman",9763));
        customers.add(new Customer("Nasiba",445));
        customers.add(new Customer("Maria",223));
        customers.add(new Customer("Rita",790));
        // print info of first customer object in array and arraylist
         System.out.println(todaysCustomers[0].toString());
        System.out.println(customers.get(0).toString());
        System.out.println(customers);

        for (int i = 0; i <customers.size() ; i++) {
            System.out.println(customers.get(i));
        }
        System.out.println("------------------------------------");
        for (Customer each:
             customers) {
            System.out.println(each);
        }
        for (Customer names:customers
             ) {
            System.out.println(names.getName());

        }
        System.out.println("--------------------------------------------");
        // lambda
        customers.forEach(each-> System.out.println(each.getName()));
    }
}
