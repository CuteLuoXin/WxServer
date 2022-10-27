package cn.com.loveback.hziee.wxserver.service;


import cn.com.loveback.hziee.wxserver.entity.StaffPosts;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * (StaffPosts)表服务接口
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service
public interface StaffPostsService {

    /**
     * 通过ID查询单条数据
     *
     * @param postsId 主键
     * @return 实例对象
     */
    StaffPosts queryById(Integer postsId);

    /**
     * 分页查询
     *
     * @param staffPosts 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<StaffPosts> queryByPage(StaffPosts staffPosts, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param staffPosts 实例对象
     * @return 实例对象
     */
    StaffPosts insert(StaffPosts staffPosts);

    /**
     * 修改数据
     *
     * @param staffPosts 实例对象
     * @return 实例对象
     */
    StaffPosts update(StaffPosts staffPosts);

    /**
     * 通过主键删除数据
     *
     * @param postsId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer postsId);

}
