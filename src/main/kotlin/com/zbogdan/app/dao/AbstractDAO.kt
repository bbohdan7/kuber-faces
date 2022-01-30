package com.zbogdan.app.dao

import javax.persistence.EntityManager

abstract class AbstractDAO<T> constructor(private val entityClass: Class<T>) {

    abstract fun getEntityManager(): EntityManager

    open fun all(): List<T> {
        val query = getEntityManager().criteriaBuilder.createQuery()
        query.select(query.from(entityClass))
        return getEntityManager().createQuery(query).resultList as List<T>
    }

    open fun find(id: Int): T = getEntityManager().find(entityClass, id)
}