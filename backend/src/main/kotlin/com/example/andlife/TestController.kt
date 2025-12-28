package com.example.andlife

import com.example.andlife.entity.Member
import com.example.andlife.service.MemberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val memberService: MemberService
) {

    @GetMapping("/")
    fun test(): String {
        return "드디어 성공했당"
    }

    @GetMapping("/members")
    fun getMembers(): List<Member> {
        return memberService.getAllMembers()
    }

}