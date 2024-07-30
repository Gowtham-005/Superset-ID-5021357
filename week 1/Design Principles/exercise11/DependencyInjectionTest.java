public class DependencyInjectionTest {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);
        
        String customer = service.getCustomer("12345");
        System.out.println(customer);
    }
}
