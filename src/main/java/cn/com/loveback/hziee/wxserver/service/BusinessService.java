package cn.com.loveback.hziee.wxserver.service;

import cn.com.loveback.hziee.wxserver.entity.Business;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * (Business)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 01:24:58
 */
@Service
public interface BusinessService {

    /**
     * 通过ID查询单条数据
     *
     * @param businessId 主键
     * @return 实例对象
     */
    Business queryById(Integer businessId);

    /**
     * 分页查询
     *
     * @param business 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Business> queryByPage(Business business, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param business 实例对象
     * @return 实例对象
     */
    Business insert(Business business);

    /**
     * 修改数据
     *
     * @param business 实例对象
     * @return 实例对象
     */
    Business update(Business business);

    /**
     * 通过主键删除数据
     *
     * @param businessId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer businessId);

}
