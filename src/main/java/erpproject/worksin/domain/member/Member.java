package erpproject.worksin.domain.member;

import lombok.Getter;

@Getter
public class Member {

    String email;

    String nickName;

    String passwordHash;

    MemberStatus status;

    public Member(String email, String nickName, String passwordHash) {
        this.email = email;
        this.nickName = nickName;
        this.passwordHash = passwordHash;
        this.status = MemberStatus.PENDING;
    }
}
