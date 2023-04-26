package com.example.springedu.controller;
import com.example.springedu.domain.TeamDTO;
import com.example.springedu.domain.TeamMemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class MyTeamController {

    @RequestMapping(value = "/myteam", produces = "application/json; charset=utf-8")  // text/json
    @ResponseBody
    public TeamDTO getMyTeam() {
        TeamDTO team = new TeamDTO();
        ArrayList<TeamMemberVO> teamMemberInfo = new ArrayList<>();
        teamMemberInfo.add(new TeamMemberVO("홍종민","제이","피자"));
        teamMemberInfo.add(new TeamMemberVO("김예원","에스터","토레타"));
        teamMemberInfo.add(new TeamMemberVO("이권석","첸","제육"));
        teamMemberInfo.add(new TeamMemberVO("이승인","모나","곱창"));
        team.setTeamName("crew.z");
        team.setTeamMember(teamMemberInfo);
        return team;
    }
}
