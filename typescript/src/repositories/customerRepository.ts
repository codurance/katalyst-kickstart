import { Customer } from "../model/customer";

export class CustomerRepository {
  getById = (id: number): Customer => {
    return { id, name: "James" };
  };
}
