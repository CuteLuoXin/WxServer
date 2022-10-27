package cn.com.loveback.hziee.wxserver.service.impl;


import cn.com.loveback.hziee.wxserver.dao.BusinessDao;
import cn.com.loveback.hziee.wxserver.entity.Business;
import cn.com.loveback.hziee.wxserver.service.BusinessService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Business)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 01:24:58
 */
@Service("businessService")
public class BusinessServiceImpl implements BusinessService {
    @Resource
    private BusinessDao businessDao;

    /**
     * 通过ID查询单条数据
     *
     * @param businessId 主键
     * @return 实例对象
     */
    @Override
    public Business queryById(Integer businessId) {
        return this.businessDao.queryById(businessId);
    }

    /**
     * 分页查询
     *
     * @param business 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Business> queryByPage(Business business, PageRequest pageRequest) {
        long total = this.businessDao.count(business);
        return new PageImpl<>(this.businessDao.queryAllByLimit(business, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param business 实例对象
     * @return 实例对象
     */
    @Override
    public Business insert(Business business) {
        this.businessDao.insert(business);
        return business;
    }

    /**
     * 修改数据
     *
     * @param business 实例对象
     * @return 实例对象
     */
    @Override
    public Business update(Business business) {
        this.businessDao.update(business);
        return this.queryById(business.getBusinessId());
    }

    /**
     * 通过主键删除数据
     *
     * @param businessId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer businessId) {
        return this.businessDao.deleteById(businessId) > 0;
    }
}
