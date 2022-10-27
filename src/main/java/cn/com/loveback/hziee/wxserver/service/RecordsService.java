package cn.com.loveback.hziee.wxserver.service;


import cn.com.loveback.hziee.wxserver.entity.Records;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * (Records)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service
public interface RecordsService {

    /**
     * 通过ID查询单条数据
     *
     * @param recordsId 主键
     * @return 实例对象
     */
    Records queryById(Integer recordsId);

    /**
     * 分页查询
     *
     * @param records 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Records> queryByPage(Records records, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param records 实例对象
     * @return 实例对象
     */
    Records insert(Records records);

    /**
     * 修改数据
     *
     * @param records 实例对象
     * @return 实例对象
     */
    Records update(Records records);

    /**
     * 通过主键删除数据
     *
     * @param recordsId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer recordsId);

}
