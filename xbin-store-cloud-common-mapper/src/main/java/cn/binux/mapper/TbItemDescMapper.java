package cn.binux.mapper;

import java.util.List;
import java.util.Map;

import cn.binux.pojo.TbItemDesc;

/**
 * @Type TbItemDescMapper.java
 * @Desc
 * @author Tb
 * @date 2018-09-18 上午10:59:54
 * @version
 */
public interface TbItemDescMapper {
    int insert(TbItemDesc record);

    TbItemDesc selectByPrimaryKey(Long itemId);

    List<TbItemDesc> selectByCondition(Map<String, Object> condition);

    int update(TbItemDesc record);
}
