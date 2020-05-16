package ru.n1kk1.kotlinREST.system

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "customer")
@JacksonXmlRootElement(localName = "Customer")
data class Customer(
        @JacksonXmlProperty
        @Column(name = "firstName", length = 200)
        val firstName: String? = null,

        @JacksonXmlProperty
        @Column(name = "lastName", length = 1000)
        val lastName: String? = null,

        @JacksonXmlProperty
        @Column(name = "salary")
        val salary: Long = 0,

        @JacksonXmlProperty
        @Column(name = "city", length = 1000)
        val city: String? = null,

        @JacksonXmlProperty
        @Column(name = "country", length = 200)
        val country: String? = null,

        @JacksonXmlProperty
        @Column(name = "email", length = 1000)
        val email: String? = null,

        @JacksonXmlProperty(isAttribute = true)
        @Id
        @Column(name = "id")
        val id: Long = 0L
)