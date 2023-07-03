package com.teamd.tt.todolist;

import com.teamd.tt.todolist.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper {
    List<SelRegionVo> selRegion();
    List<SelRegionDetailVo> selDetailRegion();
    int insAddTitle(InsTitleEntity entity );
    String selidRegion(int idRegion);
    String selidRegionDetail(int idRegionDetail);
    int insAddSubTitle(InsSubTitleDto dto);
    int insAddCheckList(IntCheckListDto dto);

}
