package com.example.board.entity;

import com.example.board.dto.MemberDTO;
import com.example.board.member.MemberGrade;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="member_table")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String memberId;

    @Column
    private String memberPw;

    @Column
    private String memberNic;

    @Column
    @Enumerated(EnumType.STRING)
    private MemberGrade memberGd;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(memberDTO.getId());
        memberEntity.setMemberId(memberDTO.getMemberId());
        memberEntity.setMemberPw(memberDTO.getMemberPw());
        memberEntity.setMemberNic(memberDTO.getMemberNic());
        memberEntity.setMemberGd(MemberGrade.Bronze);

        return  memberEntity;
    }

}
