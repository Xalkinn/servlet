package biblio;

import java.util.HashSet;
import java.util.Set;

public class Book {
	int id;
	String title;
	int nbPages;
	String description;
	Set<String> keywords=new HashSet<String>();
	
	
	public Book(int id, String title, int nbPages) {
		super();
		this.id = id;
		this.title = title;
		this.nbPages = nbPages;
	}
	
	public Book() {
		super();
	}
	
	public void add(String... kws){
		for(String keyword:kws)keywords.add(keyword);
	}
	
	public boolean matches(String s){
		for(String kw: keywords)if(kw.toLowerCase().indexOf(s.trim())>=0) return true;
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", nbPages=" + nbPages + ", description=" + description+ ", keywords=" + keywords + "]";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getNbPages() {
		return nbPages;
	}
	
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Set<String> getKeywords() {
		return keywords;
	}
	
	public void setKeywords(Set<String> keywords) {
		this.keywords = keywords;
	}
	
	

}