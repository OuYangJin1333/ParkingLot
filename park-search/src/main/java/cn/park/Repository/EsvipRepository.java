package cn.park.Repository;

import cn.park.pojo.PilVipUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

public interface EsvipRepository extends ElasticsearchRepository<PilVipUser, Integer> {

}
