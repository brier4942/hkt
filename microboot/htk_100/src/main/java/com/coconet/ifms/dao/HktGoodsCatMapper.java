package com.coconet.ifms.dao;



import com.coconet.ifms.vo.HktGoodsCatKey;

public interface HktGoodsCatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_goods_cat
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(HktGoodsCatKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_goods_cat
     *
     * @mbg.generated
     */
    int insert(HktGoodsCatKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hkt_goods_cat
     *
     * @mbg.generated
     */
    int insertSelective(HktGoodsCatKey record);
}