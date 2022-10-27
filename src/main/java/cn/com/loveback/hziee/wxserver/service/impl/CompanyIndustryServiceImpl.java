package cn.com.loveback.hziee.wxserver.service.impl;


import cn.com.loveback.hziee.wxserver.dao.CompanyIndustryDao;
import cn.com.loveback.hziee.wxserver.entity.CompanyIndustry;
import cn.com.loveback.hziee.wxserver.service.CompanyIndustryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (CompanyIndustry)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service("companyIndustryService")
public class CompanyIndustryServiceImpl implements CompanyIndustryService {
    @Resource
    private CompanyIndustryDao companyIndustryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param typeId 主键
     * @return 实例对象
     */
    @Override
    public CompanyIndustry queryById(String typeId) {
        return this.companyIndustryDao.queryById(typeId);
    }

    /**
     * 分页查询
     *
     * @param companyIndustry 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<CompanyIndustry> queryByPage(CompanyIndustry companyIndustry, PageRequest pageRequest) {
        long total = this.companyIndustryDao.count(companyIndustry);
        return new PageImpl<>(this.companyIndustryDao.queryAllByLimit(companyIndustry, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param companyIndustry 实例对象
     * @return 实例对象
     */
    @Override
    public CompanyIndustry insert(CompanyIndustry companyIndustry) {
        this.companyIndustryDao.insert(companyIndustry);
        return companyIndustry;
    }

    /**
     * 修改数据
     *
     * @param companyIndustry 实例对象
     * @return 实例对象
     */
    @Override
    public CompanyIndustry update(CompanyIndustry companyIndustry) {
        this.companyIndustryDao.update(companyIndustry);
        return this.queryById(companyIndustry.getTypeId());
    }

    /**
     * 通过主键删除数据
     *
     * @param typeId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String typeId) {
        return this.companyIndustryDao.deleteById(typeId) > 0;
    }
}
