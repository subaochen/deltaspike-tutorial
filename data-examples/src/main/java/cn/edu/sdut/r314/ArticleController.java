/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package cn.edu.sdut.r314;

import cn.edu.sdut.r314.repository.ArticleRepository;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Su Baochen <subaochen@126.com>
 */
@Named
@ViewScoped
public class ArticleController implements Serializable
{

    private Article article = new Article();

    @Inject
    private Logger log;

    @Inject
    private ArticleRepository articles;

    @Inject
    private FacesContext facesContext;

    @HttpParam("aid")
    @Inject
    private String aid; // article id

    private List<Article> articleList = null;
    private Date beginDate; // search by beginDate
    private Date endDate; // search by endDate

    public Date getBeginDate()
    {
        return beginDate;
    }

    public void setBeginDate(Date beginDate)
    {
        this.beginDate = beginDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }

    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }

    public List<Article> getArticleList()
    {
        if (articleList != null)
        {
            return articleList;
        } else
        {
            return getAllArticles();
        }
    }

    public void setArticleList(List<Article> articleList)
    {
        this.articleList = articleList;
    }

    public Article getArticle()
    {
        return article;
    }

    public void setArticle(Article article)
    {
        this.article = article;
    }

    public Article findArticleById(Long id)
    {
        article = articles.findBy(id);
        return article;
    }

    public String persist()
    {
        article.setDate(new Date());
        articles.save(article);
        facesContext.addMessage(null, new FacesMessage("article:" + article.getTitle() + " persisted"));
        return "persisted";
    }

    public String delete(Article article)
    {
        articles.attachAndRemove(article);
        facesContext.addMessage(null, new FacesMessage("article:" + article.getTitle() + " deleted"));
        return "deleted";
    }

    public List<Article> getAllArticles()
    {
        return articles.findAll();
    }

    public void loadArticle()
    {
        if (aid != null)
        {
            this.article = findArticleById(Long.valueOf(aid));
        }
    }

    public String search()
    {
        if (this.article.getTitle() != null)
        {
            log.log(Level.INFO, "title:{0},beginDate:{1},endDate:{2}", new Object[]
            {
                article.getTitle(), beginDate, endDate
            });
            if (beginDate != null && endDate != null)
            {
                articleList = articles.findByTitleLikeAndDateBetweenOrderByDateDesc("%" + this.article.getTitle() + "%", beginDate, endDate);
            }
        }
        // reload current page
        return null;
    }

}
