package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("writeArticleService") 
//writeArticleService 로 객체이름 재정의 해
//xml에서 writeArticleService로 가져올수 있는이유
public class WriteArticleServiceImpl implements WriteArticleService{
    private ArticleDao dao; 
    @Autowired
    public WriteArticleServiceImpl(ArticleDao dao) {
    	//생성자에 (ArticleDao) 객체  넣어줘?
    	this.dao = dao;
    }
	public void write(Article article) {
		dao.insert();		
	}
}
