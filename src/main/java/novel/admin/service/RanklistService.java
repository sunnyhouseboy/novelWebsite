package novel.admin.service;

import novel.admin.bean.Ranklist;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RanklistService {
    public List<Ranklist> selectRankListByFirstLabelAndScore(@Param("label") String label, @Param("limit") int limit);
    public List<Ranklist> selectRankListByFirstLabelAndReadNum(@Param("label") String label, @Param("limit") int limit);
    public List<Ranklist> selectRankListByFirstLabelAndCollectNum(@Param("label") String label, @Param("limit") int limit);
    public List<Ranklist> selectRankListByFirstLabelAndRecommendNum(@Param("label") String label, @Param("limit") int limit);
}
