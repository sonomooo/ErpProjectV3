package erpproject.worksin.domain.member;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MemberTest {

    // 정해둔 규칙을 검증!
    @Test
    void createMember() {
        Member member = new Member("toby@splearn.app", "Toby", "secret");
        assertThat(member.getStatus()).isEqualTo(MemberStatus.PENDING);
    }
}
