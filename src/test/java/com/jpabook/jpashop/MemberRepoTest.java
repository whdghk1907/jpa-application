package com.jpabook.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MemberRepoTest {

    @Autowired
    MemberRepo memberRepo;

    @Test
    public void testMember() throws Exception {
        //given
        Member member = new Member();
        member.setUsername("test");

        //when
        Long save = memberRepo.save(member);
        Member findMember = memberRepo.find(save);

        //then
        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
        Assertions.assertThat(findMember.getUsername()).isEqualTo(member.getUsername());

    }

}
