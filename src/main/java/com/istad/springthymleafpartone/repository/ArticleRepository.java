package com.istad.springthymleafpartone.repository;

import com.istad.springthymleafpartone.model.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleRepository {
    private List<Article> articleList = new ArrayList<>(){{
       add(new Article(120,"ChatGPT","new evolution of promt progamming","https://images.pexels.com/photos/534285/pexels-photo-534285.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",new AuthorRepository().getAllAuthor().get(0)));
       add(new Article(121,"i am khmer i love cambodia ","new evolution of promt progamming","https://images.pexels.com/photos/534169/pexels-photo-534169.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",new AuthorRepository().getAllAuthor().get(1)));
       add(new Article(122,"Okay bro","new evolution of promt progamming","https://images.pexels.com/photos/534169/pexels-photo-534169.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",new AuthorRepository().getAllAuthor().get(2)));
       add(new Article(123,"ChatGPT4","new evolution of promt progamming","https://images.pexels.com/photos/534285/pexels-photo-534285.jpeg?auto=compress&cs=tinysrgb&w=600&lazy=load",new AuthorRepository().getAllAuthor().get(3)));
    }};

    public List<Article> getAllArticle(){
        return articleList;
    }
    public Article getArticleByID(int id){
        return articleList.stream().filter(e->e.getId()==id).findFirst().orElse(null);
    }

    public void addNewArticle(Article article){
        articleList.add(article);
    }
}
