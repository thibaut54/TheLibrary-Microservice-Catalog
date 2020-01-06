package org.thibaut.thelibrary.service.impl;

import org.springframework.stereotype.Service;
import org.thibaut.thelibrary.entity.BookEntity;
import org.thibaut.thelibrary.repository.contract.RepositoryFactory;
import org.thibaut.thelibrary.repository.repository.UserRepository;
import org.thibaut.thelibrary.service.contract.BookService;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class BookServiceImpl extends AbstractService implements BookService {

	public BookServiceImpl(
			RepositoryFactory repositoryFactory,
			UserRepository userRepository,
			EntityManager em ) {
		super( repositoryFactory, userRepository, em );
	}

	@Override
	public String getBookTitle( Integer id ){
		return getRepositoryFactory( ).getBookRepository( ).findById( id ).orElseThrow().getTitle();
	}

	@Override
	public BookEntity getBookById( Integer id ){
		return getRepositoryFactory().getBookRepository().findById( id ).orElseThrow();
	}

	@Override
	public List< BookEntity > getBookByTitle( String title ){
		return getRepositoryFactory().getBookRepository().getBooksByTitleContains( title );
	}


//	public List<BookEntity> getBookByTitle( String title, String authorLastName, String authorFirstName, String style){
//
//		List< AuthorEntity > authors = getRepositoryFactory().getAuthorRepository().getAuthorsByLastNameAndFirstName( authorLastName,  authorFirstName  );
//
////		return getRepositoryFactory().getBookRepository().getBooksByTitleContainsAndAuthorsContainsAndStylesContains( title,  authors,  );
//		return null;
//	}
//
//
//	public Page findBookByTitleAndAuthorAndCategory( Pageable pageable, String bookTitle, List<String> authorsNames, List<String> categories ){
//
//		int pageSize = pageable.getPageSize();
//		int currentPage = pageable.getPageNumber();
//		int startItem = currentPage * pageSize;
//
//		QBook qBook = QBook.book;
//		QAuthor qAuthor = QAuthor.author;
//		QCategory qCategory = QCategory.category1;
//
//		QAtlas qAtlas = QAtlas.atlas;
//		QArea qArea = QArea.area;
//		QCrag qCrag = QCrag.crag;
//		QRoute qRoute = QRoute.route;
//
//		BooleanBuilder booleanBuilder = new BooleanBuilder();
//
//		JPAQueryFactory queryFactory = new JPAQueryFactory( getEm() );
//
//
//		List< ? > result = null;
//
//		/*
//		1 - extract the list of books that contains the requested title
//		2 - filter by author names' list
//		3 - filter by categories' list
//		*/
//
//		if( ! bookTitle.equals( "" )){
//
//			booleanBuilder.and( qBook.title.containsIgnoreCase(bookTitle));
//
//		}
//
//		if( ! authorsNames.isEmpty() ){
//			for ( AuthorEntity author: authorsNames ) {
//
//			}
//			booleanBuilder.and( qAtlas.country.containsIgnoreCase(country) );
//		}
//
//
//		JPAQuery< ? > query = queryFactory.from(qAtlas);
//
//		if(category .equals( "Atlas" )){
//			if( ! city.equals( "" )){
//				query.innerJoin( qAtlas.areas, qArea );
//			}
//			result = query.where(booleanBuilder)
//					         .select(qAtlas)
//					         .fetch();
//		}
//		else if (category .equals( "Area" )){
//			result = query.innerJoin(qAtlas.areas, qArea)
//					         .where(booleanBuilder)
//					         .select(qArea)
//					         .fetch();
//		}
//		else if (category .equals( "Crag" )){
//			result = query.innerJoin(qAtlas.areas, qArea)
//					         .innerJoin(qArea.crags, qCrag)
//					         .where(booleanBuilder)
//					         .select(qCrag)
//					         .fetch();
//		}
//		else if (category .equals( "Route" )){
//			result = query.innerJoin( qAtlas.areas, qArea )
//					         .innerJoin(qArea.crags, qCrag)
//					         .innerJoin( qCrag.routes, qRoute  )
//					         .where(booleanBuilder)
//					         .select(qRoute)
//					         .fetch();
//		}
//
//		List<?> list;
//
//		if (result.size() < startItem) {
//			list = Collections.emptyList();
//		} else {
//			int toIndex = Math.min(startItem + pageSize, result.size());
//			list = result.subList(startItem, toIndex);
//		}
//
//		return new PageImpl(list, PageRequest.of( currentPage, pageSize ), (long)result.size() );
//	}
}
