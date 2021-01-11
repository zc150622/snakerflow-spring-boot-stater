package com.github.snakerflow.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.snakerflow.mybatis.entity.HistOrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.snaker.engine.access.QueryFilter;
import org.snaker.engine.entity.HistoryOrder;

import java.util.List;

/**
 * @author zhaocheng
 */

public interface HistOrderMapper extends BaseMapper<HistOrderEntity> {


    List<HistoryOrder> findListPage(Page<HistoryOrder> page, @Param("filter") QueryFilter filter);

    List<HistoryOrder> getCCWorks(Page<HistoryOrder> page, @Param("filter")QueryFilter filter);
}
