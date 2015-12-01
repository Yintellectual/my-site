package com.i2d23.saloon.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Technology {
	
	
	private String name;
	@Id
	private int id;
	@OneToMany(mappedBy="technology", fetch=FetchType.EAGER)
	private List<Article> articles = new ArrayList<Article>();
	@Embedded
	private Image image;
	@Embeddable
	public static class Image{
		public static final float SCALE = 0.5f;
		@Column(name = "url")
		private String url;
		@Column(name = "height")
		private int height;
		@Column(name = "width")
		private int width;
		
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
	}
	
	public List<Article> getArticles(){
		return articles;
	}
	public void setArticles(List<Article> articles){
		this.articles = articles;
	} 
	public void removeArticle(Article article){
		
		Iterator i = articles.iterator();
		while(i.hasNext()){
			if(((Article)i.next()).getId()==article.getId()){
				i.remove();
			}
		}
	}
	public void addArticle(Article article){
		if(!articles.contains(article)){
			articles.add(article);
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Image getImage(){
		return this.image;
	}
	public void setImage(Image image){
		this.image = image;
	}

}
