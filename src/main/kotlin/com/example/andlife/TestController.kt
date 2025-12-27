package com.example.andlife

import com.example.andlife.entity.Member
import com.example.andlife.service.MemberService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class TestController(
    private val memberService: MemberService
) {

    @GetMapping("/")
    @ResponseBody
    fun test(): String {
        return "드디어 성공했당"
    }

    @GetMapping("/members")
    fun getMembers(): List<Member> {
        return memberService.getAllMembers()
    }

}