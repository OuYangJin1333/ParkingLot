package cn.park.service.impl;

import cn.park.mapper.ChargeMapper;
import cn.park.repository.ChargeRepository;
import cn.park.service.ChargeService;
import cn.park.vo.Charge;
import io.swagger.models.auth.In;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChargeServiceImpl implements ChargeService {
    @Resource
    @Qualifier(value = "chargeMapper")
    ChargeMapper chargeMapper;
    @Autowired
    ChargeRepository chargeRepository;

    @Override
    public Page<Charge> findListByEs(Integer pageNumber, Integer pageSize, Charge charge) {
        BoolQueryBuilder builder = QueryBuilders.boolQuery();
        /*builder.must(QueryBuilders.fuzzyQuery("partName", "野马停车场"));
        */
        builder.must(QueryBuilders.termQuery("partName","野马"));
        PageRequest page = new PageRequest(0, 10);

        NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
        nativeSearchQueryBuilder.withQuery(builder);
        nativeSearchQueryBuilder.withPageable(page);
        NativeSearchQuery query = nativeSearchQueryBuilder.build();
        Page<Charge> chargePage = chargeRepository.search(query);
        return chargePage;
    }

    @Override
    public void deleteAll() {
        chargeRepository.deleteAll();
    }

    @Override
    public void importAll() {
        List<Charge> list = chargeMapper.findList();
        for (Charge charge : list) {
            chargeRepository.save(charge);
        }
    }
    /*private SearchQuery getEntitySearchQuery(int pageNumber, int pageSize, Charge charge) {

        *//*QueryBuilder beginTime  = QueryBuilders.ma*//*

        FunctionScoreQueryBuilder cnameBuild = QueryBuilders.functionScoreQuery(cname);
        FunctionScoreQueryBuilder anameBuild = QueryBuilders.functionScoreQuery(aname);
        FunctionScoreQueryBuilder partNameBuild = QueryBuilders.functionScoreQuery(partName);
        FunctionScoreQueryBuilder carNumberBuild = QueryBuilders.functionScoreQuery(carNumber);
        FunctionScoreQueryBuilder payTypeBuild = QueryBuilders.functionScoreQuery(payType);
        // 设置分页
        Pageable pageable = new PageRequest(pageNumber, pageSize);
        return new NativeSearchQueryBuilder()
                .withPageable(pageable)
                .withQuery(cnameBuild)
                .withQuery(anameBuild)
                .withQuery(partNameBuild)
                .withQuery(carNumberBuild)
                *//*.withQuery(payTypeBuild)*//*
                .build();
    }*/
}
