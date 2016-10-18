/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.r314.repository;

import cn.edu.sdut.r314.Article;
import java.util.Date;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

/**
 *
 * @author subaochen<subaochen@126.com>
 */
@Repository
public interface ArticleRepository extends EntityRepository<Article,Long>
{
    List<Article> findByTitleLike(String title);
    List<Article> findByTitleLikeAndDateBetweenOrderByDateDesc(String title,Date begin,Date end);
}
