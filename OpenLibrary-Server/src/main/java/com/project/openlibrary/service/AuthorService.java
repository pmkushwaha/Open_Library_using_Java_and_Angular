package com.project.openlibrary.service;

import java.util.Set;
import com.project.openlibrary.entity.Author;


public interface AuthorService {
	
	public Author addAuthor(Author author);

	public Author updateAuthor(Author author);

	public Set<Author> getAllAuthor();

	public Author getAuthor(Integer authorId);

	public void deleteAuthor(Integer authorId);

}
