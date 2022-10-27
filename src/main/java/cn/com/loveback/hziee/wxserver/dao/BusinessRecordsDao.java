package cn.com.loveback.hziee.wxserver.dao;


import cn.com.loveback.hziee.wxserver.entity.BusinessRecords;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (BusinessRecords)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-19 01:24:58
 */
@Mapper
public interface BusinessRecordsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param recordId 主键
     * @return 实例对象
     */
    BusinessRecords queryById(Integer recordId);

    /**
     * 查询指定行数据
     *
     * @param businessRecords 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<BusinessRecords> queryAllByLimit(BusinessRecords businessRecords, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param businessRecords 查询条件
     * @return 总行数
     */
    long count(BusinessRecords businessRecords);

    /**
     * 新增数据
     *
     * @param businessRecords 实例对象
     * @return 影响行数
     */
    int insert(BusinessRecords businessRecords);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BusinessRecords> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BusinessRecords> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BusinessRecords> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<BusinessRecords> entities);

    /**
     * 修改数据
     *
     * @param businessRecords 实例对象
     * @return 影响行数
     */
    int update(BusinessRecords businessRecords);

    /**
     * 通过主键删除数据
     *
     * @param recordId 主键
     * @return 影响行数
     */
    int deleteById(Integer recordId);

}

