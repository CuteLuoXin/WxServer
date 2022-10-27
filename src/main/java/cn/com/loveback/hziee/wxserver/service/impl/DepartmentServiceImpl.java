package cn.com.loveback.hziee.wxserver.service.impl;


import cn.com.loveback.hziee.wxserver.dao.DepartmentDao;
import cn.com.loveback.hziee.wxserver.entity.Department;
import cn.com.loveback.hziee.wxserver.service.DepartmentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Department)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentDao departmentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param companyId 主键
     * @return 实例对象
     */
    @Override
    public Department queryById(String companyId) {
        return this.departmentDao.queryById(companyId);
    }

    /**
     * 分页查询
     *
     * @param department 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Department> queryByPage(Department department, PageRequest pageRequest) {
        long total = this.departmentDao.count(department);
        return new PageImpl<>(this.departmentDao.queryAllByLimit(department, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    @Override
    public Department insert(Department department) {
        this.departmentDao.insert(department);
        return department;
    }

    /**
     * 修改数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    @Override
    public Department update(Department department) {
        this.departmentDao.update(department);
        return this.queryById(department.getCompanyId());
    }

    /**
     * 通过主键删除数据
     *
     * @param companyId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String companyId) {
        return this.departmentDao.deleteById(companyId) > 0;
    }
}
