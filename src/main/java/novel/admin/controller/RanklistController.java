package novel.admin.controller;

import novel.admin.bean.Ranklist;
import novel.admin.service.RanklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ranklist")
public class RanklistController {

    @Autowired
    private RanklistService ranklistService;

    @GetMapping("/{label}/score/{limit}")
    public List<Ranklist> selectRankListByFirstLabelAndScore(@PathVariable("label") String label,@PathVariable("limit") int limit){
        return ranklistService.selectRankListByFirstLabelAndScore(label, limit);
    }

    @GetMapping("/{label}/readNum/{limit}")
    public List<Ranklist> selectRankListByFirstLabelAndReadNum(@PathVariable("label") String label,@PathVariable("limit") int limit){
        return ranklistService.selectRankListByFirstLabelAndReadNum(label,limit);
    }
    @GetMapping("/{label}/collectNum/{limit}")
    public List<Ranklist> selectRankListByFirstLabelAndCollectNum(@PathVariable("label") String label,@PathVariable("limit") int limit){
        return ranklistService.selectRankListByFirstLabelAndCollectNum(label, limit);
    }
    @GetMapping("/{label}/recommendNum/{limit}")
    public List<Ranklist> selectRanklistByFristLabelAndRecommendNum(@PathVariable("label") String label,@PathVariable("limit") int limit){
        return ranklistService.selectRankListByFirstLabelAndRecommendNum(label, limit);
    }
}
