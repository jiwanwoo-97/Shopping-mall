package com.project.shoppingmall.Repository.Impl;


import com.project.shoppingmall.Entity.QMember;
import com.project.shoppingmall.Repository.Custom.MemberCustomRepository;
import com.project.shoppingmall.ResBody.memberResBody;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import static com.project.shoppingmall.Entity.QMember.member;

@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberCustomRepository {

    private final JPAQueryFactory queryFactory;

    @Override
    public memberResBody findByNameOrderByNameDesc(String name) {
        return queryFactory.select(Projections.bean(memberResBody.class
                , member.id.as("id")
                , member.name.as("name")))
                .from(member)
                .where(nameEq(name))
                .orderBy(member.id.desc())
                .fetchOne();
    }

    private BooleanExpression nameEq(String name){
        return member.name.eq(name);
    }
}
