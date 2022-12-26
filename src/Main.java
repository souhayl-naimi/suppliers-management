import Repository.SupplierRepository;
import entities.Supplier;
import utils.ConsoleMenu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
         int option;

        //Instantiating the supplier's repository
        SupplierRepository supplierRepository = new SupplierRepository();

        //Instantiating dummy data and feeding the database
        Supplier s1 = new Supplier("A1B2C3","Carrefour","Casablanca");
        Supplier s2 = new Supplier("D4E5F6","Marjane","Bouskoura");
        Supplier s3 = new Supplier("G7H8I9","BIM","Rabat");

        ArrayList<Supplier> dbSuppliers= new ArrayList<Supplier>();
        dbSuppliers.add(s1);
        dbSuppliers.add(s2);
        dbSuppliers.add(s3);

        //Printing the console
        ConsoleMenu cs = new ConsoleMenu();
        cs.ShowMenu();
        Scanner scanner = new Scanner(System.in);
/*        do {
        option = (char) System.in.read();

        switch (option){
            case '1':{
                supplierRepository.listSuppliers(dbSuppliers);
                break;
            }
            case '2':{
                System.out.println("Enter the city's name: ");
                char a = (char) System.in.read();
                System.out.println(a+"1231");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String city = reader.readLine();
                System.out.println(city+"111");
                supplierRepository.listSuppliersByCity(dbSuppliers,city);
            }
            case '3':{

            }
            case '4':{

            }

        }}while(option != 0);*/
      //  option = (char) System.in.read();

        do{
            option = Integer.parseInt(scanner.next());
            if(option == 1){
            supplierRepository.listSuppliers(dbSuppliers);
        } else if(option == 2){
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String city = in.readLine();
                supplierRepository.listSuppliersByCity(dbSuppliers,city);

        }else if(option == 3){

                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

                System.out.printf("Enter the supplier's code:");
                String code = in.readLine();

                System.out.printf("Enter the supplier's designation:");
                String designation = in.readLine();

                System.out.printf("Enter the supplier's city:");
                String city = in.readLine();

                Supplier supplier = new Supplier(code,designation,city);

                dbSuppliers.add(supplier);

                System.out.println(supplier.toString()+"  "+"is added with succes");

        }else if(option == 4){
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                System.out.printf("Enter the supplier's code:");
                String code = in.readLine();
                supplierRepository.deleteSupplier(dbSuppliers,code);

        }}while(option != 0);


    }
}