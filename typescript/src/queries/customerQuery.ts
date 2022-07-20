import { CustomerRepository } from "../repositories/customerRepository";

export function customerQuery(customerRepository: CustomerRepository) {
  return {
    getCustomer: (id: number) => {
      return customerRepository.getById(id);
    }
  };
}
