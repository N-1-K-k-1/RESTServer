package ru.n1kk1.kotlinREST.system

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import ru.n1kk1.kotlinREST.service.CustomerService


@RestController
@RequestMapping("customers")
class CustomersController(private val customerService: CustomerService) {
    @GetMapping
    fun index() = customerService.all()

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody customer: Customer) = customerService.add(customer)

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.FOUND)
    fun read(@PathVariable id: Long) = customerService.get(id)

    @PutMapping("{id}")
    fun update(@PathVariable id: Long, @RequestBody customer: Customer) = customerService.edit(id,  customer)

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long) = customerService.remove(id)
}