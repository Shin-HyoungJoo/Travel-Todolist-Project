package com.teamd.tt.todolist.model.dto;

import lombok.Data;

@Data
public class UpdSubTitleDto {
    private int idSub;
    private String subTitle;
    private boolean finishYn;
}
