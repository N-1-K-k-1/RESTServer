package ru.n1kk1.kotlinREST.service

import org.springframework.stereotype.Service
import ru.n1kk1.kotlinREST.system.Customer
import ru.n1kk1.kotlinREST.system.CustomerRepository

@Service
class CustomerService(private val customerRepository: CustomerRepository) {
    fun all(): Iterable<Customer> = customerRepository.findAll()
    fun get(id: Long): Customer = customerRepository.findById(id).get()
    fun add(customer: Customer): Customer = customerRepository.save(customer)
    fun edit(id: Long, customer: Customer): Customer = customerRepository.save(customer.copy(id = id))
    fun remove(id: Long) = customerRepository.deleteById(id)
}