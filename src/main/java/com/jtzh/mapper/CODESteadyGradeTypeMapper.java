package com.jtzh.mapper;

import java.util.List;

import com.jtzh.entity.CODESteadyGradeType;

public abstract interface CODESteadyGradeTypeMapper
{
  public abstract int deleteByPrimaryKey(String paramString);
  
  public abstract int insert(CODESteadyGradeType paramCODESteadyGradeType);
  
  public abstract CODESteadyGradeType selectByPrimaryKey(String paramString);
  
  public abstract List<CODESteadyGradeType> selectAll();
  
  public abstract int updateByPrimaryKey(CODESteadyGradeType paramCODESteadyGradeType);
}


/* Location:              C:\Users\rainb\Desktop\msmis.war!\WEB-INF\classes\com\gbt\dao\CODESteadyGradeTypeMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */