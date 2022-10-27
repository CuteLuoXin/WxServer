package cn.com.loveback.hziee.wxserver.dao;


import cn.com.loveback.hziee.wxserver.entity.StaffRecords;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (StaffRecords)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Mapper
public interface StaffRecordsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param staffId 主键
     * @return 实例对象
     */
    StaffRecords queryById(Integer staffId);

    /**
     * 查询指定行数据
     *
     * @param staffRecords 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<StaffRecords> queryAllByLimit(StaffRecords staffRecords, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param staffRecords 查询条件
     * @return 总行数
     */
    long count(StaffRecords staffRecords);

    /**
     * 新增数据
     *
     * @param staffRecords 实例对象
     * @return 影响行数
     */
    int insert(StaffRecords staffRecords);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<StaffRecords> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<StaffRecords> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<StaffRecords> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<StaffRecords> entities);

    /**
     * 修改数据
     *
     * @param staffRecords 实例对象
     * @return 影响行数
     */
    int update(StaffRecords staffRecords);

    /**
     * 通过主键删除数据
     *
     * @param staffId 主键
     * @return 影响行数
     */
    int deleteById(Integer staffId);

}

