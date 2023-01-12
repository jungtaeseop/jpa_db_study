package com.jpadb.sts.domian.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.jpadb.sts.domian.entity.Person;

public interface DeleteCascadeRepository extends JpaRepository<Person, Long>, DeleteCascadeRepositoryCustom, QuerydslPredicateExecutor<Person>{

}
