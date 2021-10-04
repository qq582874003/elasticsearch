package com.michael.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * desc
 *
 * @author wangc 2021-10-03
 * @since 1.0.0
 */
@Repository
public interface ProductDao extends ElasticsearchRepository<Product, Long> {

}
