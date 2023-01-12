package com.jpadb.sts.domian.repository;

import javax.persistence.EntityManager;

import com.querydsl.jpa.impl.JPAQueryFactory;

public class DeleteCascadeRepositoryImpl implements DeleteCascadeRepositoryCustom{

	private final JPAQueryFactory queryFactory;
	
	public DeleteCascadeRepositoryImpl(EntityManager em) {
		this.queryFactory = new JPAQueryFactory(em);
	}
}
