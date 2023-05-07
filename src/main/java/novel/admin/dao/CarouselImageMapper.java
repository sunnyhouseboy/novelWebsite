package novel.admin.dao;

import novel.admin.bean.CarouselImage;

import java.util.List;

public interface CarouselImageMapper {

    //根据id查轮播图
    public CarouselImage selectById(int id);

    // 查询所有轮播图
    public List<CarouselImage> selectAll();

    // 插入一条轮播图
    public int insert(CarouselImage carouselImage);

    // 更新一条轮播图记录
    public int update(CarouselImage carouselImage);

    // 删除一条轮播图记录
    public int delete(int id);
}
