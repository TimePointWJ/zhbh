package com.jtzh.mapper;

import java.util.List;

import com.jtzh.entity.CODEDangerousEvaulationType;

public abstract interface CODEDangerousEvaulationTypeMapper
{
  public abstract int deleteByPrimaryKey(String paramString);
  
  public abstract int insert(CODEDangerousEvaulationType paramCODEDangerousEvaulationType);
  
  public abstract CODEDangerousEvaulationType selectByPrimaryKey(String paramString);
  
  public abstract List<CODEDangerousEvaulationType> selectAll();
  
  public abstract int updateByPrimaryKey(CODEDangerousEvaulationType paramCODEDangerousEvaulationType);
}


/* Location:              C:\Users\rainb\Desktop\msmis.war!\WEB-INF\classes\com\gbt\dao\CODEDangerousEvaulationTypeMapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */