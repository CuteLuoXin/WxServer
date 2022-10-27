package cn.com.loveback.hziee.wxserver.dao;

import cn.com.loveback.hziee.wxserver.entity.WxUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (WxUser)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-22 21:39:33
 */
@Mapper
public interface WxUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param telnum 主键
     * @return 实例对象
     */
    WxUser queryById(String telnum);

    /**
     * 查询指定行数据
     *
     * @param wxUser   查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<WxUser> queryAllByLimit(WxUser wxUser, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param wxUser 查询条件
     * @return 总行数
     */
    long count(WxUser wxUser);

    /**
     * 新增数据
     *
     * @param wxUser 实例对象
     * @return 影响行数
     */
    int insert(WxUser wxUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<WxUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<WxUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<WxUser> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<WxUser> entities);

    /**
     * 修改数据
     *
     * @param wxUser 实例对象
     * @return 影响行数
     */
    int update(WxUser wxUser);

    /**
     * 通过主键删除数据
     *
     * @param telnum 主键
     * @return 影响行数
     */
    int deleteById(String telnum);

}

