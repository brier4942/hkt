package com.coconet.ifms.dao;



import java.util.List;

import com.coconet.ifms.vo.HktCategory;

public interface HktCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short catId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_category
     *
     * @mbg.generated
     */
    int insert(HktCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_category
     *
     * @mbg.generated
     */
    int insertSelective(HktCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_category
     *
     * @mbg.generated
     */
    List<HktCategory> selectByPrimaryKey(Short catId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(HktCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HktCategory record);
    List<HktCategory> selectByPid(Short pid);
    
    
}