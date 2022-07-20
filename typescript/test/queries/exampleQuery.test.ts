import { mock } from "jest-mock-extended";
import { CustomerRepository } from "../../src/repositories/customerRepository";
import { Customer } from "../../src/model/customer";
import { customerQuery } from "../../src/queries/customerQuery";

const SOME_ID = 1;

describe("ExampleQuery", () => {
  const mockCustomerRepository = mock<CustomerRepository>();

  it("should return the mocked customer using jest-mock-extended", () => {
    const expectedCustomer: Customer = { id: SOME_ID, name: "Michael" };
    mockCustomerRepository.getById.mockReturnValue(expectedCustomer);

    const customer = customerQuery(mockCustomerRepository).getCustomer(SOME_ID);
    expect(customer).toEqual(expectedCustomer);
  });
});
