package cn.com.loveback.hziee.wxserver.dao;


import cn.com.loveback.hziee.wxserver.entity.StaffState;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (StaffState)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Mapper
public interface StaffStateDao {

    /**
     * 通过ID查询单条数据
     *
     * @param stateId 主键
     * @return 实例对象
     */
    StaffState queryById(Integer stateId);

    /**
     * 查询指定行数据
     *
     * @param staffState 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<StaffState> queryAllByLimit(StaffState staffState, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param staffState 查询条件
     * @return 总行数
     */
    long count(StaffState staffState);

    /**
     * 新增数据
     *
     * @param staffState 实例对象
     * @return 影响行数
     */
    int insert(StaffState staffState);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<StaffState> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<StaffState> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<StaffState> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<StaffState> entities);

    /**
     * 修改数据
     *
     * @param staffState 实例对象
     * @return 影响行数
     */
    int update(StaffState staffState);

    /**
     * 通过主键删除数据
     *
     * @param stateId 主键
     * @return 影响行数
     */
    int deleteById(Integer stateId);

}

