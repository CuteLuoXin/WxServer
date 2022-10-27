package cn.com.loveback.hziee.wxserver.service;

import cn.com.loveback.hziee.wxserver.entity.Clues;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * (Clues)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service
public interface CluesService {

    /**
     * 通过ID查询单条数据
     *
     * @param cluesId 主键
     * @return 实例对象
     */
    Clues queryById(String cluesId);

    /**
     * 分页查询
     *
     * @param clues 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Clues> queryByPage(Clues clues, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param clues 实例对象
     * @return 实例对象
     */
    Clues insert(Clues clues);

    /**
     * 修改数据
     *
     * @param clues 实例对象
     * @return 实例对象
     */
    Clues update(Clues clues);

    /**
     * 通过主键删除数据
     *
     * @param cluesId 主键
     * @return 是否成功
     */
    boolean deleteById(String cluesId);

}
