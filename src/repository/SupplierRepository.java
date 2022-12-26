package repository;

import entities.Supplier;

import java.util.List;

public class SupplierRepository {

     public void listSuppliers(List<Supplier> suppliers){
         for(Supplier s : suppliers){
             System.out.println(s.toString());
         }
     };

    public void addSupplier(Supplier supplier, List<Supplier> suppliers){
        suppliers.add(supplier);
         System.out.println("Added with succes!");
     }

    public void deleteSupplier(List<Supplier> suppliers, String supplierCode){
        suppliers.removeIf(s -> s.getCode().equals(supplierCode));
        System.out.println("Removed with succes!");
     }

    public void listSuppliersByCity(List<Supplier> suppliers, String city){
        for(Supplier s : suppliers){
            if(s.getCity().equals(city)){
                System.out.println(s.toString());
            }
        }
    }

}
