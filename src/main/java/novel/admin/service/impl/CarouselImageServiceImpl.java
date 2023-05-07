package novel.admin.service.impl;

import novel.admin.bean.CarouselImage;
import novel.admin.service.CarouselImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarouselImageServiceImpl implements CarouselImageService {
    @Autowired
    private CarouselImageService carouseIImage;

    @Override
    public CarouselImage selectById(int id) {
        return carouseIImage.selectById(id);
    }

    @Override
    public List<CarouselImage> selectAll() {
        return carouseIImage.selectAll();
    }

    @Override
    public int insert(CarouselImage carouselImage) {
        return carouseIImage.insert(carouselImage);
    }

    @Override
    public int update(CarouselImage carouselImage) {
        return carouseIImage.update(carouselImage);
    }

    @Override
    public int delete(int id) {
        return carouseIImage.delete(id);
    }
}
