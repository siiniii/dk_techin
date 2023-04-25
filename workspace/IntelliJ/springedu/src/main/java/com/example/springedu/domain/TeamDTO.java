package com.example.springedu.domain;

import lombok.Data;

import java.util.List;

@Data
public class TeamDTO {
    private String teamName;
    private List<TeamMemberVO> teamMember;
}
