package com.example.andlife.service

import com.example.andlife.entity.Member
import com.example.andlife.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(private val memberRepository: MemberRepository) {
    fun getAllMembers(): List<Member> = memberRepository.findAll()
}