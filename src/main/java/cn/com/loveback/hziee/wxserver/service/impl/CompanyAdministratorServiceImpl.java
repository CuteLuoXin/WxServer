package cn.com.loveback.hziee.wxserver.service.impl;


import cn.com.loveback.hziee.wxserver.dao.CompanyAdministratorDao;
import cn.com.loveback.hziee.wxserver.entity.CompanyAdministrator;
import cn.com.loveback.hziee.wxserver.service.CompanyAdministratorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (CompanyAdministrator)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service("companyAdministratorService")
public class CompanyAdministratorServiceImpl implements CompanyAdministratorService {
    @Resource
    private CompanyAdministratorDao companyAdministratorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param administratorId 主键
     * @return 实例对象
     */
    @Override
    public CompanyAdministrator queryById(Integer administratorId) {
        return this.companyAdministratorDao.queryById(administratorId);
    }

    /**
     * 分页查询
     *
     * @param companyAdministrator 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<CompanyAdministrator> queryByPage(CompanyAdministrator companyAdministrator, PageRequest pageRequest) {
        long total = this.companyAdministratorDao.count(companyAdministrator);
        return new PageImpl<>(this.companyAdministratorDao.queryAllByLimit(companyAdministrator, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param companyAdministrator 实例对象
     * @return 实例对象
     */
    @Override
    public CompanyAdministrator insert(CompanyAdministrator companyAdministrator) {
        this.companyAdministratorDao.insert(companyAdministrator);
        return companyAdministrator;
    }

    /**
     * 修改数据
     *
     * @param companyAdministrator 实例对象
     * @return 实例对象
     */
    @Override
    public CompanyAdministrator update(CompanyAdministrator companyAdministrator) {
        this.companyAdministratorDao.update(companyAdministrator);
        return this.queryById(companyAdministrator.getAdministratorId());
    }

    /**
     * 通过主键删除数据
     *
     * @param administratorId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer administratorId) {
        return this.companyAdministratorDao.deleteById(administratorId) > 0;
    }
}
