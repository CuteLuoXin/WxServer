package cn.com.loveback.hziee.wxserver.dao;


import cn.com.loveback.hziee.wxserver.entity.CompanyType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (CompanyType)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Mapper
public interface CompanyTypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param typeId 主键
     * @return 实例对象
     */
    CompanyType queryById(String typeId);

    /**
     * 查询指定行数据
     *
     * @param companyType 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<CompanyType> queryAllByLimit(CompanyType companyType, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param companyType 查询条件
     * @return 总行数
     */
    long count(CompanyType companyType);

    /**
     * 新增数据
     *
     * @param companyType 实例对象
     * @return 影响行数
     */
    int insert(CompanyType companyType);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CompanyType> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CompanyType> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CompanyType> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CompanyType> entities);

    /**
     * 修改数据
     *
     * @param companyType 实例对象
     * @return 影响行数
     */
    int update(CompanyType companyType);

    /**
     * 通过主键删除数据
     *
     * @param typeId 主键
     * @return 影响行数
     */
    int deleteById(String typeId);

}

