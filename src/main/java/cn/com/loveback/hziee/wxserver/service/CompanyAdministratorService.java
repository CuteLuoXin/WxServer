package cn.com.loveback.hziee.wxserver.service;

import cn.com.loveback.hziee.wxserver.entity.CompanyAdministrator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * (CompanyAdministrator)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service
public interface CompanyAdministratorService {

    /**
     * 通过ID查询单条数据
     *
     * @param administratorId 主键
     * @return 实例对象
     */
    CompanyAdministrator queryById(Integer administratorId);

    /**
     * 分页查询
     *
     * @param companyAdministrator 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<CompanyAdministrator> queryByPage(CompanyAdministrator companyAdministrator, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param companyAdministrator 实例对象
     * @return 实例对象
     */
    CompanyAdministrator insert(CompanyAdministrator companyAdministrator);

    /**
     * 修改数据
     *
     * @param companyAdministrator 实例对象
     * @return 实例对象
     */
    CompanyAdministrator update(CompanyAdministrator companyAdministrator);

    /**
     * 通过主键删除数据
     *
     * @param administratorId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer administratorId);

}
