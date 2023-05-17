package test;

import org.springframework.stereotype.Component;

@Component
public class MariadbArticleDao implements ArticleDao{
//ArticleDao  객체가 Component 가지고 있음 => MariadbArticleDao
	public void insert() {
		System.out.println("mariadb에 저장합니다.");		
	}

}
