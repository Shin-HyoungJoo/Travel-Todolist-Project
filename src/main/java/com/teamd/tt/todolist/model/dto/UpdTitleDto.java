package com.teamd.tt.todolist.model.dto;

import lombok.Data;

@Data
public class UpdTitleDto {
    private int idTitle;
    private int idRegionDetail;
    private int idRegion;
    private String startDate;
    private String endDate;
    private String calColor;
}
