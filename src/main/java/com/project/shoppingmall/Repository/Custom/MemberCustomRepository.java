package com.project.shoppingmall.Repository.Custom;

import com.project.shoppingmall.ResBody.memberResBody;

public interface MemberCustomRepository {

    memberResBody findByNameOrderByNameDesc(String name);
}
