package cn.com.loveback.hziee.wxserver.dao;


import cn.com.loveback.hziee.wxserver.entity.Clues;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Clues)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Mapper
public interface CluesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cluesId 主键
     * @return 实例对象
     */
    Clues queryById(String cluesId);

    /**
     * 查询指定行数据
     *
     * @param clues 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Clues> queryAllByLimit(Clues clues, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param clues 查询条件
     * @return 总行数
     */
    long count(Clues clues);

    /**
     * 新增数据
     *
     * @param clues 实例对象
     * @return 影响行数
     */
    int insert(Clues clues);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Clues> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Clues> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Clues> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Clues> entities);

    /**
     * 修改数据
     *
     * @param clues 实例对象
     * @return 影响行数
     */
    int update(Clues clues);

    /**
     * 通过主键删除数据
     *
     * @param cluesId 主键
     * @return 影响行数
     */
    int deleteById(String cluesId);

}

