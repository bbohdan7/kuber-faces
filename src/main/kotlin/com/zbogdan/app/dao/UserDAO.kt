package com.zbogdan.app.dao

import com.zbogdan.app.models.User
import javax.annotation.PostConstruct
import javax.ejb.Stateless
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Stateless
open class UserDAO : AbstractDAO<User>(User::class.java) {

    @PersistenceContext(unitName = "NbuDS")
    private lateinit var em: EntityManager

    @PostConstruct
    fun init() {
        println("UserDAO has been instantiated")
    }

    override fun getEntityManager(): EntityManager = this.em

}