package com.project.shoppingmall.Repository;

import com.project.shoppingmall.Entity.Member;
import com.project.shoppingmall.Repository.Custom.MemberCustomRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberCustomRepository {

    Optional<Member> findByName(String name);
}
