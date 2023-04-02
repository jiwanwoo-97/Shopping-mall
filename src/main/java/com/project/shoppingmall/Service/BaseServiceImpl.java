package com.project.shoppingmall.Service;

import com.project.shoppingmall.Entity.Member;
import com.project.shoppingmall.Repository.MemberRepository;
import com.project.shoppingmall.ResBody.memberResBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BaseServiceImpl implements BaseService{

    @Autowired
    private MemberRepository memberRepository;


    @Override
    @Transactional
    public memberResBody createMain() {
        String name ="지완우";
        Member member = memberRepository.findByName(name).orElse(null);
        return memberRepository.findByNameOrderByNameDesc(name);
    }
}
