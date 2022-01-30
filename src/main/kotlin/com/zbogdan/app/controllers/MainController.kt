package com.zbogdan.app.controllers

import com.zbogdan.app.dao.UserDAO
import com.zbogdan.app.models.User
import javax.annotation.PostConstruct
import javax.enterprise.context.Dependent
import javax.inject.Inject
import javax.inject.Named

@Named
@Dependent
open class MainController {

    @Inject
    private lateinit var userDao: UserDAO

    open fun getUsers(): List<User> = userDao.all()

    open fun getAppName(): String = "FacesKuber App"
}