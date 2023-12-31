package com.teamd.tt.todolist.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
public class SelSubTitleListVo {
    private int idSub;
    private String subTitle;
    private boolean finishYn;
    private List<SelCheckListVo> checkList;
}
