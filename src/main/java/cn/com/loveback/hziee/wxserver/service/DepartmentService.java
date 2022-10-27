package cn.com.loveback.hziee.wxserver.service;

import cn.com.loveback.hziee.wxserver.entity.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * (Department)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service
public interface DepartmentService {

    /**
     * 通过ID查询单条数据
     *
     * @param companyId 主键
     * @return 实例对象
     */
    Department queryById(String companyId);

    /**
     * 分页查询
     *
     * @param department 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Department> queryByPage(Department department, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    Department insert(Department department);

    /**
     * 修改数据
     *
     * @param department 实例对象
     * @return 实例对象
     */
    Department update(Department department);

    /**
     * 通过主键删除数据
     *
     * @param companyId 主键
     * @return 是否成功
     */
    boolean deleteById(String companyId);

}
