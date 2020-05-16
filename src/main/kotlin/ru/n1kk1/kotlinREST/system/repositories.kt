package ru.n1kk1.kotlinREST.system

import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long>