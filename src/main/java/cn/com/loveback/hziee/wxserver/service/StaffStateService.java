package cn.com.loveback.hziee.wxserver.service;

import cn.com.loveback.hziee.wxserver.entity.StaffState;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * (StaffState)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service
public interface StaffStateService {

    /**
     * 通过ID查询单条数据
     *
     * @param stateId 主键
     * @return 实例对象
     */
    StaffState queryById(Integer stateId);

    /**
     * 分页查询
     *
     * @param staffState 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<StaffState> queryByPage(StaffState staffState, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param staffState 实例对象
     * @return 实例对象
     */
    StaffState insert(StaffState staffState);

    /**
     * 修改数据
     *
     * @param staffState 实例对象
     * @return 实例对象
     */
    StaffState update(StaffState staffState);

    /**
     * 通过主键删除数据
     *
     * @param stateId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer stateId);

}
