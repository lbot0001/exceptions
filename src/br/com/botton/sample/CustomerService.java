package br.com.botton.sample;

import br.com.botton.exceptions.exception.NameNotFoundException;
import br.com.botton.sample.entity.Customer;

public class CustomerService {

    public Customer findByName(String name) throws NameNotFoundException{

        if("".equals(name)){
            throw new NameNotFoundException("Name empty");
        }
        return new Customer(name);

    }

    public static void main(String[] args) {

        CustomerService obj = new CustomerService();

        try {

            Customer cus = obj.findByName("");

        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }

    }
}
