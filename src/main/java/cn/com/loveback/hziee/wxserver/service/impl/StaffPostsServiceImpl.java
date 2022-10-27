package cn.com.loveback.hziee.wxserver.service.impl;


import cn.com.loveback.hziee.wxserver.dao.StaffPostsDao;
import cn.com.loveback.hziee.wxserver.entity.StaffPosts;
import cn.com.loveback.hziee.wxserver.service.StaffPostsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (StaffPosts)表服务实现类
 *
 * @author makejava
 * @since 2022-10-19 01:24:59
 */
@Service("staffPostsService")
public class StaffPostsServiceImpl implements StaffPostsService {
    @Resource
    private StaffPostsDao staffPostsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param postsId 主键
     * @return 实例对象
     */
    @Override
    public StaffPosts queryById(Integer postsId) {
        return this.staffPostsDao.queryById(postsId);
    }

    /**
     * 分页查询
     *
     * @param staffPosts 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<StaffPosts> queryByPage(StaffPosts staffPosts, PageRequest pageRequest) {
        long total = this.staffPostsDao.count(staffPosts);
        return new PageImpl<>(this.staffPostsDao.queryAllByLimit(staffPosts, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param staffPosts 实例对象
     * @return 实例对象
     */
    @Override
    public StaffPosts insert(StaffPosts staffPosts) {
        this.staffPostsDao.insert(staffPosts);
        return staffPosts;
    }

    /**
     * 修改数据
     *
     * @param staffPosts 实例对象
     * @return 实例对象
     */
    @Override
    public StaffPosts update(StaffPosts staffPosts) {
        this.staffPostsDao.update(staffPosts);
        return this.queryById(staffPosts.getPostsId());
    }

    /**
     * 通过主键删除数据
     *
     * @param postsId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer postsId) {
        return this.staffPostsDao.deleteById(postsId) > 0;
    }
}
