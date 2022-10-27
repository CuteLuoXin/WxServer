package cn.com.loveback.hziee.wxserver.service.impl;


import cn.com.loveback.hziee.wxserver.dao.CompanyTypeDao;
import cn.com.loveback.hziee.wxserver.entity.CompanyType;
import cn.com.loveback.hziee.wxserver.service.CompanyTypeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (CompanyType)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service("companyTypeService")
public class CompanyTypeServiceImpl implements CompanyTypeService {
    @Resource
    private CompanyTypeDao companyTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param typeId 主键
     * @return 实例对象
     */
    @Override
    public CompanyType queryById(String typeId) {
        return this.companyTypeDao.queryById(typeId);
    }

    /**
     * 分页查询
     *
     * @param companyType 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<CompanyType> queryByPage(CompanyType companyType, PageRequest pageRequest) {
        long total = this.companyTypeDao.count(companyType);
        return new PageImpl<>(this.companyTypeDao.queryAllByLimit(companyType, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param companyType 实例对象
     * @return 实例对象
     */
    @Override
    public CompanyType insert(CompanyType companyType) {
        this.companyTypeDao.insert(companyType);
        return companyType;
    }

    /**
     * 修改数据
     *
     * @param companyType 实例对象
     * @return 实例对象
     */
    @Override
    public CompanyType update(CompanyType companyType) {
        this.companyTypeDao.update(companyType);
        return this.queryById(companyType.getTypeId());
    }

    /**
     * 通过主键删除数据
     *
     * @param typeId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String typeId) {
        return this.companyTypeDao.deleteById(typeId) > 0;
    }
}
