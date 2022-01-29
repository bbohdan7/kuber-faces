package com.zbogdan.app.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
data class User(
    @Id @Column(name = "id") var id: Int? = null,

    @Column(name = "firstname") var firstName: String? = null,

    @Column(name = "lastname") var lastName: String? = null,

    @Column(name = "email") var email: String? = null
)