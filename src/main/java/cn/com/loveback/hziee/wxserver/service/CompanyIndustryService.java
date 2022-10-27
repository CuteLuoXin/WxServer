package cn.com.loveback.hziee.wxserver.service;


import cn.com.loveback.hziee.wxserver.entity.CompanyIndustry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * (CompanyIndustry)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service
public interface CompanyIndustryService {

    /**
     * 通过ID查询单条数据
     *
     * @param typeId 主键
     * @return 实例对象
     */
    CompanyIndustry queryById(String typeId);

    /**
     * 分页查询
     *
     * @param companyIndustry 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<CompanyIndustry> queryByPage(CompanyIndustry companyIndustry, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param companyIndustry 实例对象
     * @return 实例对象
     */
    CompanyIndustry insert(CompanyIndustry companyIndustry);

    /**
     * 修改数据
     *
     * @param companyIndustry 实例对象
     * @return 实例对象
     */
    CompanyIndustry update(CompanyIndustry companyIndustry);

    /**
     * 通过主键删除数据
     *
     * @param typeId 主键
     * @return 是否成功
     */
    boolean deleteById(String typeId);

}
