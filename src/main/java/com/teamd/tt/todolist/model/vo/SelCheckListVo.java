package com.teamd.tt.todolist.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Data
public class SelCheckListVo {
    private int idCheck;
    private String checkTitle;
    private boolean finishYn;
}
