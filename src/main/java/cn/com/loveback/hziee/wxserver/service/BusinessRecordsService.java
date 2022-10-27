package cn.com.loveback.hziee.wxserver.service;

import cn.com.loveback.hziee.wxserver.entity.BusinessRecords;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * (BusinessRecords)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 01:24:58
 */
@Service
public interface BusinessRecordsService {

    /**
     * 通过ID查询单条数据
     *
     * @param recordId 主键
     * @return 实例对象
     */
    BusinessRecords queryById(Integer recordId);

    /**
     * 分页查询
     *
     * @param businessRecords 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<BusinessRecords> queryByPage(BusinessRecords businessRecords, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param businessRecords 实例对象
     * @return 实例对象
     */
    BusinessRecords insert(BusinessRecords businessRecords);

    /**
     * 修改数据
     *
     * @param businessRecords 实例对象
     * @return 实例对象
     */
    BusinessRecords update(BusinessRecords businessRecords);

    /**
     * 通过主键删除数据
     *
     * @param recordId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer recordId);

}
