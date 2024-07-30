public class CustomerService {
    private CustomerRepository repository;
    
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }
    
    public String getCustomer(String id) {
        return repository.findCustomerById(id);
    }
}
