package com.teamd.tt.calender.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SelInfoDto {
    private int idTitle;
    private String title;
    private String startDate;
    private String endDate;
}
