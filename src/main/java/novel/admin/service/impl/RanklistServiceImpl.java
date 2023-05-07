package novel.admin.service.impl;

import novel.admin.bean.Ranklist;
import novel.admin.dao.RanklistMapper;
import novel.admin.service.RanklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RanklistServiceImpl implements RanklistService {

    @Autowired
    private RanklistMapper ranklistMapper;
    @Override
    public List<Ranklist> selectRankListByFirstLabelAndScore(String label, int limit) {
        return ranklistMapper.selectRankListByFirstLabelAndScore(label,limit);
    }

    @Override
    public List<Ranklist> selectRankListByFirstLabelAndReadNum(String label, int limit) {
        return ranklistMapper.selectRankListByFirstLabelAndReadNum(label,limit);
    }

    @Override
    public List<Ranklist> selectRankListByFirstLabelAndCollectNum(String label, int limit) {
        return ranklistMapper.selectRankListByFirstLabelAndCollectNum(label,limit);
    }

    @Override
    public List<Ranklist> selectRankListByFirstLabelAndRecommendNum(String label, int limit) {
        return ranklistMapper.selectRankListByFirstLabelAndRecommendNum(label, limit);
    }
}
