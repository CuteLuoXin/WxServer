package cn.com.loveback.hziee.wxserver.service;


import cn.com.loveback.hziee.wxserver.entity.StaffRecords;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * (StaffRecords)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service
public interface StaffRecordsService {

    /**
     * 通过ID查询单条数据
     *
     * @param staffId 主键
     * @return 实例对象
     */
    StaffRecords queryById(Integer staffId);

    /**
     * 分页查询
     *
     * @param staffRecords 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<StaffRecords> queryByPage(StaffRecords staffRecords, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param staffRecords 实例对象
     * @return 实例对象
     */
    StaffRecords insert(StaffRecords staffRecords);

    /**
     * 修改数据
     *
     * @param staffRecords 实例对象
     * @return 实例对象
     */
    StaffRecords update(StaffRecords staffRecords);

    /**
     * 通过主键删除数据
     *
     * @param staffId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer staffId);

}
