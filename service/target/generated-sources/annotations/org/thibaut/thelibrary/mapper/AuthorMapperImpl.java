package org.thibaut.thelibrary.mapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.thibaut.thelibrary.dto.AuthorDTO;
import org.thibaut.thelibrary.dto.AuthorDTO.AuthorDTOBuilder;
import org.thibaut.thelibrary.dto.BookDTO;
import org.thibaut.thelibrary.dto.BookDTO.BookDTOBuilder;
import org.thibaut.thelibrary.dto.CategoryDTO;
import org.thibaut.thelibrary.dto.CategoryDTO.CategoryDTOBuilder;
import org.thibaut.thelibrary.dto.CoordinatesDTO;
import org.thibaut.thelibrary.dto.CoordinatesDTO.CoordinatesDTOBuilder;
import org.thibaut.thelibrary.dto.EditorDTO;
import org.thibaut.thelibrary.dto.EditorDTO.EditorDTOBuilder;
import org.thibaut.thelibrary.dto.LibraryDTO;
import org.thibaut.thelibrary.dto.LibraryDTO.LibraryDTOBuilder;
import org.thibaut.thelibrary.dto.LoanDTO;
import org.thibaut.thelibrary.dto.LoanDTO.LoanDTOBuilder;
import org.thibaut.thelibrary.dto.RoleDTO;
import org.thibaut.thelibrary.dto.RoleDTO.RoleDTOBuilder;
import org.thibaut.thelibrary.dto.UserDTO;
import org.thibaut.thelibrary.dto.UserDTO.UserDTOBuilder;
import org.thibaut.thelibrary.entity.AuthorEntity;
import org.thibaut.thelibrary.entity.AuthorEntity.AuthorEntityBuilder;
import org.thibaut.thelibrary.entity.BookEntity;
import org.thibaut.thelibrary.entity.BookEntity.BookEntityBuilder;
import org.thibaut.thelibrary.entity.CategoryEntity;
import org.thibaut.thelibrary.entity.CategoryEntity.CategoryEntityBuilder;
import org.thibaut.thelibrary.entity.CoordinatesEntity;
import org.thibaut.thelibrary.entity.CoordinatesEntity.CoordinatesEntityBuilder;
import org.thibaut.thelibrary.entity.EditorEntity;
import org.thibaut.thelibrary.entity.EditorEntity.EditorEntityBuilder;
import org.thibaut.thelibrary.entity.LibraryEntity;
import org.thibaut.thelibrary.entity.LibraryEntity.LibraryEntityBuilder;
import org.thibaut.thelibrary.entity.LoanEntity;
import org.thibaut.thelibrary.entity.LoanEntity.LoanEntityBuilder;
import org.thibaut.thelibrary.entity.RoleEntity;
import org.thibaut.thelibrary.entity.RoleEntity.RoleEntityBuilder;
import org.thibaut.thelibrary.entity.UserEntity;
import org.thibaut.thelibrary.entity.UserEntity.UserEntityBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-24T12:22:56+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.3 (Oracle Corporation)"
)
public class AuthorMapperImpl implements AuthorMapper {

    private final DatatypeFactory datatypeFactory;

    public AuthorMapperImpl() {
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        }
        catch ( DatatypeConfigurationException ex ) {
            throw new RuntimeException( ex );
        }
    }

    @Override
    public AuthorDTO authorToDTO(AuthorEntity authorEntity) {
        if ( authorEntity == null ) {
            return null;
        }

        AuthorDTOBuilder authorDTO = AuthorDTO.builder();

        authorDTO.id( authorEntity.getId() );
        authorDTO.firstName( authorEntity.getFirstName() );
        authorDTO.lastName( authorEntity.getLastName() );
        authorDTO.nationality( authorEntity.getNationality() );
        authorDTO.bookList( bookEntityListToBookDTOList( authorEntity.getBookList() ) );

        return authorDTO.build();
    }

    @Override
    public List<AuthorDTO> authorToDTOList(List<AuthorEntity> authorEntityList) {
        if ( authorEntityList == null ) {
            return null;
        }

        List<AuthorDTO> list = new ArrayList<AuthorDTO>( authorEntityList.size() );
        for ( AuthorEntity authorEntity : authorEntityList ) {
            list.add( authorToDTO( authorEntity ) );
        }

        return list;
    }

    @Override
    public AuthorEntity bookToEntity(AuthorDTO authorDTO) {
        if ( authorDTO == null ) {
            return null;
        }

        AuthorEntityBuilder authorEntity = AuthorEntity.builder();

        authorEntity.id( authorDTO.getId() );
        authorEntity.firstName( authorDTO.getFirstName() );
        authorEntity.lastName( authorDTO.getLastName() );
        authorEntity.nationality( authorDTO.getNationality() );
        authorEntity.bookList( bookDTOListToBookEntityList( authorDTO.getBookList() ) );

        return authorEntity.build();
    }

    @Override
    public List<AuthorEntity> authorToEntityList(List<AuthorDTO> authorDTOList) {
        if ( authorDTOList == null ) {
            return null;
        }

        List<AuthorEntity> list = new ArrayList<AuthorEntity>( authorDTOList.size() );
        for ( AuthorDTO authorDTO : authorDTOList ) {
            list.add( bookToEntity( authorDTO ) );
        }

        return list;
    }

    private static LocalDate xmlGregorianCalendarToLocalDate( XMLGregorianCalendar xcal ) {
        if ( xcal == null ) {
            return null;
        }

        return LocalDate.of( xcal.getYear(), xcal.getMonth(), xcal.getDay() );
    }

    private XMLGregorianCalendar jodaDateTimeToXmlGregorianCalendar( DateTime dt ) {
        if ( dt == null ) {
            return null;
        }
        return datatypeFactory.newXMLGregorianCalendar(
            dt.getYear(),
            dt.getMonthOfYear(),
            dt.getDayOfMonth(),
            dt.getHourOfDay(),
            dt.getMinuteOfHour(),
            dt.getSecondOfMinute(),
            dt.getMillisOfSecond(),
            dt.getZone().getOffset( null ) / 60000 );
    }

    private XMLGregorianCalendar localDateToXmlGregorianCalendar( LocalDate localDate ) {
        if ( localDate == null ) {
            return null;
        }

        return datatypeFactory.newXMLGregorianCalendarDate(
            localDate.getYear(),
            localDate.getMonthValue(),
            localDate.getDayOfMonth(),
            DatatypeConstants.FIELD_UNDEFINED );
    }

    private static DateTime xmlGregorianCalendarToJodaDateTime( XMLGregorianCalendar xcal ) {
        if ( xcal == null ) {
            return null;
        }

        if ( xcal.getYear() != DatatypeConstants.FIELD_UNDEFINED
            && xcal.getMonth() != DatatypeConstants.FIELD_UNDEFINED
            && xcal.getDay() != DatatypeConstants.FIELD_UNDEFINED
            && xcal.getHour() != DatatypeConstants.FIELD_UNDEFINED
            && xcal.getMinute() != DatatypeConstants.FIELD_UNDEFINED
        ) {
            if ( xcal.getSecond() != DatatypeConstants.FIELD_UNDEFINED
                && xcal.getMillisecond() != DatatypeConstants.FIELD_UNDEFINED
                && xcal.getTimezone() != DatatypeConstants.FIELD_UNDEFINED ) {
                return new DateTime( xcal.getYear(),
                    xcal.getMonth(),
                    xcal.getDay(),
                    xcal.getHour(),
                    xcal.getMinute(),
                    xcal.getSecond(),
                    xcal.getMillisecond(),
                    DateTimeZone.forOffsetMillis( xcal.getTimezone() * 60000 )
                );
            }
            else if ( xcal.getSecond() != DatatypeConstants.FIELD_UNDEFINED
                && xcal.getMillisecond() != DatatypeConstants.FIELD_UNDEFINED ) {
                return new DateTime( xcal.getYear(),
                    xcal.getMonth(),
                    xcal.getDay(),
                    xcal.getHour(),
                    xcal.getMinute(),
                    xcal.getSecond(),
                    xcal.getMillisecond()
                );
            }
            else if ( xcal.getSecond() != DatatypeConstants.FIELD_UNDEFINED
                && xcal.getTimezone() != DatatypeConstants.FIELD_UNDEFINED ) {
                return new DateTime( xcal.getYear(),
                    xcal.getMonth(),
                    xcal.getDay(),
                    xcal.getHour(),
                    xcal.getMinute(),
                    xcal.getSecond(),
                    DateTimeZone.forOffsetMillis( xcal.getTimezone() * 60000 )
                );
            }
            else if ( xcal.getSecond() != DatatypeConstants.FIELD_UNDEFINED ) {
                return new DateTime( xcal.getYear(),
                    xcal.getMonth(),
                    xcal.getDay(),
                    xcal.getHour(),
                    xcal.getMinute(),
                    xcal.getSecond()
                );
            }
            else if ( xcal.getTimezone() != DatatypeConstants.FIELD_UNDEFINED ) {
                return new DateTime( xcal.getYear(),
                    xcal.getMonth(),
                    xcal.getDay(),
                    xcal.getHour(),
                    xcal.getMinute(),
                    DateTimeZone.forOffsetMillis( xcal.getTimezone() * 60000 )
                );
            }
            else {
                return new DateTime( xcal.getYear(),
                    xcal.getMonth(),
                    xcal.getDay(),
                    xcal.getHour(),
                    xcal.getMinute()
                );
            }
        }
        return null;
    }

    protected CategoryDTO categoryEntityToCategoryDTO(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        CategoryDTOBuilder categoryDTO = CategoryDTO.builder();

        categoryDTO.id( categoryEntity.getId() );
        categoryDTO.category( categoryEntity.getCategory() );

        return categoryDTO.build();
    }

    protected List<CategoryDTO> categoryEntityListToCategoryDTOList(List<CategoryEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<CategoryDTO> list1 = new ArrayList<CategoryDTO>( list.size() );
        for ( CategoryEntity categoryEntity : list ) {
            list1.add( categoryEntityToCategoryDTO( categoryEntity ) );
        }

        return list1;
    }

    protected EditorDTO editorEntityToEditorDTO(EditorEntity editorEntity) {
        if ( editorEntity == null ) {
            return null;
        }

        EditorDTOBuilder editorDTO = EditorDTO.builder();

        editorDTO.id( editorEntity.getId() );
        editorDTO.name( editorEntity.getName() );
        editorDTO.coordinates( coordinatesEntityToCoordinatesDTO( editorEntity.getCoordinates() ) );

        return editorDTO.build();
    }

    protected CoordinatesDTO coordinatesEntityToCoordinatesDTO(CoordinatesEntity coordinatesEntity) {
        if ( coordinatesEntity == null ) {
            return null;
        }

        CoordinatesDTOBuilder coordinatesDTO = CoordinatesDTO.builder();

        coordinatesDTO.id( coordinatesEntity.getId() );
        coordinatesDTO.street( coordinatesEntity.getStreet() );
        coordinatesDTO.streetNumber( coordinatesEntity.getStreetNumber() );
        coordinatesDTO.additionalInformation( coordinatesEntity.getAdditionalInformation() );
        coordinatesDTO.city( coordinatesEntity.getCity() );
        coordinatesDTO.postalCode( coordinatesEntity.getPostalCode() );
        coordinatesDTO.phone( coordinatesEntity.getPhone() );
        coordinatesDTO.email( coordinatesEntity.getEmail() );
        coordinatesDTO.editor( editorEntityToEditorDTO( coordinatesEntity.getEditor() ) );
        coordinatesDTO.library( libraryEntityToLibraryDTO( coordinatesEntity.getLibrary() ) );

        return coordinatesDTO.build();
    }

    protected LibraryDTO libraryEntityToLibraryDTO(LibraryEntity libraryEntity) {
        if ( libraryEntity == null ) {
            return null;
        }

        LibraryDTOBuilder libraryDTO = LibraryDTO.builder();

        libraryDTO.id( libraryEntity.getId() );
        libraryDTO.name( libraryEntity.getName() );
        libraryDTO.coordinates( coordinatesEntityToCoordinatesDTO( libraryEntity.getCoordinates() ) );

        return libraryDTO.build();
    }

    protected List<LibraryDTO> libraryEntityListToLibraryDTOList(List<LibraryEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<LibraryDTO> list1 = new ArrayList<LibraryDTO>( list.size() );
        for ( LibraryEntity libraryEntity : list ) {
            list1.add( libraryEntityToLibraryDTO( libraryEntity ) );
        }

        return list1;
    }

    protected RoleDTO roleEntityToRoleDTO(RoleEntity roleEntity) {
        if ( roleEntity == null ) {
            return null;
        }

        RoleDTOBuilder roleDTO = RoleDTO.builder();

        roleDTO.id( roleEntity.getId() );
        roleDTO.role( roleEntity.getRole() );

        return roleDTO.build();
    }

    protected List<RoleDTO> roleEntityListToRoleDTOList(List<RoleEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<RoleDTO> list1 = new ArrayList<RoleDTO>( list.size() );
        for ( RoleEntity roleEntity : list ) {
            list1.add( roleEntityToRoleDTO( roleEntity ) );
        }

        return list1;
    }

    protected List<LoanDTO> loanEntityListToLoanDTOList(List<LoanEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<LoanDTO> list1 = new ArrayList<LoanDTO>( list.size() );
        for ( LoanEntity loanEntity : list ) {
            list1.add( loanEntityToLoanDTO( loanEntity ) );
        }

        return list1;
    }

    protected UserDTO userEntityToUserDTO(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDTOBuilder userDTO = UserDTO.builder();

        userDTO.id( userEntity.getId() );
        userDTO.password( userEntity.getPassword() );
        userDTO.firstName( userEntity.getFirstName() );
        userDTO.lastName( userEntity.getLastName() );
        userDTO.userName( userEntity.getUserName() );
        userDTO.registrationDate( userEntity.getRegistrationDate() );
        userDTO.roleList( roleEntityListToRoleDTOList( userEntity.getRoleList() ) );
        userDTO.coordinates( coordinatesEntityToCoordinatesDTO( userEntity.getCoordinates() ) );
        userDTO.loanList( loanEntityListToLoanDTOList( userEntity.getLoanList() ) );

        return userDTO.build();
    }

    protected LoanDTO loanEntityToLoanDTO(LoanEntity loanEntity) {
        if ( loanEntity == null ) {
            return null;
        }

        LoanDTOBuilder loanDTO = LoanDTO.builder();

        loanDTO.id( loanEntity.getId() );
        loanDTO.startDate( xmlGregorianCalendarToJodaDateTime( localDateToXmlGregorianCalendar( loanEntity.getStartDate() ) ) );
        loanDTO.returned( loanEntity.isReturned() );
        loanDTO.initialEndDate( xmlGregorianCalendarToJodaDateTime( localDateToXmlGregorianCalendar( loanEntity.getInitialEndDate() ) ) );
        loanDTO.extendedEndDate( xmlGregorianCalendarToJodaDateTime( localDateToXmlGregorianCalendar( loanEntity.getExtendedEndDate() ) ) );
        loanDTO.user( userEntityToUserDTO( loanEntity.getUser() ) );

        return loanDTO.build();
    }

    protected BookDTO bookEntityToBookDTO(BookEntity bookEntity) {
        if ( bookEntity == null ) {
            return null;
        }

        BookDTOBuilder bookDTO = BookDTO.builder();

        bookDTO.id( bookEntity.getId() );
        bookDTO.title( bookEntity.getTitle() );
        bookDTO.categorieList( categoryEntityListToCategoryDTOList( bookEntity.getCategorieList() ) );
        bookDTO.language( bookEntity.getLanguage() );
        bookDTO.isbn( bookEntity.getIsbn() );
        bookDTO.publicationDate( bookEntity.getPublicationDate() );
        bookDTO.numberOfPages( bookEntity.getNumberOfPages() );
        bookDTO.authorList( authorToDTOList( bookEntity.getAuthorList() ) );
        bookDTO.librarieList( libraryEntityListToLibraryDTOList( bookEntity.getLibrarieList() ) );
        bookDTO.editor( editorEntityToEditorDTO( bookEntity.getEditor() ) );
        bookDTO.loanList( loanEntityListToLoanDTOList( bookEntity.getLoanList() ) );

        return bookDTO.build();
    }

    protected List<BookDTO> bookEntityListToBookDTOList(List<BookEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<BookDTO> list1 = new ArrayList<BookDTO>( list.size() );
        for ( BookEntity bookEntity : list ) {
            list1.add( bookEntityToBookDTO( bookEntity ) );
        }

        return list1;
    }

    protected CategoryEntity categoryDTOToCategoryEntity(CategoryDTO categoryDTO) {
        if ( categoryDTO == null ) {
            return null;
        }

        CategoryEntityBuilder categoryEntity = CategoryEntity.builder();

        categoryEntity.id( categoryDTO.getId() );
        categoryEntity.category( categoryDTO.getCategory() );

        return categoryEntity.build();
    }

    protected List<CategoryEntity> categoryDTOListToCategoryEntityList(List<CategoryDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<CategoryEntity> list1 = new ArrayList<CategoryEntity>( list.size() );
        for ( CategoryDTO categoryDTO : list ) {
            list1.add( categoryDTOToCategoryEntity( categoryDTO ) );
        }

        return list1;
    }

    protected EditorEntity editorDTOToEditorEntity(EditorDTO editorDTO) {
        if ( editorDTO == null ) {
            return null;
        }

        EditorEntityBuilder editorEntity = EditorEntity.builder();

        editorEntity.id( editorDTO.getId() );
        editorEntity.name( editorDTO.getName() );
        editorEntity.coordinates( coordinatesDTOToCoordinatesEntity( editorDTO.getCoordinates() ) );

        return editorEntity.build();
    }

    protected CoordinatesEntity coordinatesDTOToCoordinatesEntity(CoordinatesDTO coordinatesDTO) {
        if ( coordinatesDTO == null ) {
            return null;
        }

        CoordinatesEntityBuilder coordinatesEntity = CoordinatesEntity.builder();

        coordinatesEntity.id( coordinatesDTO.getId() );
        coordinatesEntity.street( coordinatesDTO.getStreet() );
        coordinatesEntity.streetNumber( coordinatesDTO.getStreetNumber() );
        coordinatesEntity.additionalInformation( coordinatesDTO.getAdditionalInformation() );
        coordinatesEntity.city( coordinatesDTO.getCity() );
        coordinatesEntity.postalCode( coordinatesDTO.getPostalCode() );
        coordinatesEntity.phone( coordinatesDTO.getPhone() );
        coordinatesEntity.email( coordinatesDTO.getEmail() );
        coordinatesEntity.editor( editorDTOToEditorEntity( coordinatesDTO.getEditor() ) );
        coordinatesEntity.library( libraryDTOToLibraryEntity( coordinatesDTO.getLibrary() ) );

        return coordinatesEntity.build();
    }

    protected LibraryEntity libraryDTOToLibraryEntity(LibraryDTO libraryDTO) {
        if ( libraryDTO == null ) {
            return null;
        }

        LibraryEntityBuilder libraryEntity = LibraryEntity.builder();

        libraryEntity.id( libraryDTO.getId() );
        libraryEntity.name( libraryDTO.getName() );
        libraryEntity.coordinates( coordinatesDTOToCoordinatesEntity( libraryDTO.getCoordinates() ) );

        return libraryEntity.build();
    }

    protected List<LibraryEntity> libraryDTOListToLibraryEntityList(List<LibraryDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<LibraryEntity> list1 = new ArrayList<LibraryEntity>( list.size() );
        for ( LibraryDTO libraryDTO : list ) {
            list1.add( libraryDTOToLibraryEntity( libraryDTO ) );
        }

        return list1;
    }

    protected RoleEntity roleDTOToRoleEntity(RoleDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        RoleEntityBuilder roleEntity = RoleEntity.builder();

        roleEntity.id( roleDTO.getId() );
        roleEntity.role( roleDTO.getRole() );

        return roleEntity.build();
    }

    protected List<RoleEntity> roleDTOListToRoleEntityList(List<RoleDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<RoleEntity> list1 = new ArrayList<RoleEntity>( list.size() );
        for ( RoleDTO roleDTO : list ) {
            list1.add( roleDTOToRoleEntity( roleDTO ) );
        }

        return list1;
    }

    protected List<LoanEntity> loanDTOListToLoanEntityList(List<LoanDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<LoanEntity> list1 = new ArrayList<LoanEntity>( list.size() );
        for ( LoanDTO loanDTO : list ) {
            list1.add( loanDTOToLoanEntity( loanDTO ) );
        }

        return list1;
    }

    protected UserEntity userDTOToUserEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.id( userDTO.getId() );
        userEntity.password( userDTO.getPassword() );
        userEntity.firstName( userDTO.getFirstName() );
        userEntity.lastName( userDTO.getLastName() );
        userEntity.userName( userDTO.getUserName() );
        userEntity.registrationDate( userDTO.getRegistrationDate() );
        userEntity.roleList( roleDTOListToRoleEntityList( userDTO.getRoleList() ) );
        userEntity.coordinates( coordinatesDTOToCoordinatesEntity( userDTO.getCoordinates() ) );
        userEntity.loanList( loanDTOListToLoanEntityList( userDTO.getLoanList() ) );

        return userEntity.build();
    }

    protected LoanEntity loanDTOToLoanEntity(LoanDTO loanDTO) {
        if ( loanDTO == null ) {
            return null;
        }

        LoanEntityBuilder loanEntity = LoanEntity.builder();

        loanEntity.id( loanDTO.getId() );
        loanEntity.startDate( xmlGregorianCalendarToLocalDate( jodaDateTimeToXmlGregorianCalendar( loanDTO.getStartDate() ) ) );
        loanEntity.returned( loanDTO.isReturned() );
        loanEntity.initialEndDate( xmlGregorianCalendarToLocalDate( jodaDateTimeToXmlGregorianCalendar( loanDTO.getInitialEndDate() ) ) );
        loanEntity.extendedEndDate( xmlGregorianCalendarToLocalDate( jodaDateTimeToXmlGregorianCalendar( loanDTO.getExtendedEndDate() ) ) );
        loanEntity.user( userDTOToUserEntity( loanDTO.getUser() ) );

        return loanEntity.build();
    }

    protected BookEntity bookDTOToBookEntity(BookDTO bookDTO) {
        if ( bookDTO == null ) {
            return null;
        }

        BookEntityBuilder bookEntity = BookEntity.builder();

        bookEntity.id( bookDTO.getId() );
        bookEntity.title( bookDTO.getTitle() );
        bookEntity.categorieList( categoryDTOListToCategoryEntityList( bookDTO.getCategorieList() ) );
        bookEntity.language( bookDTO.getLanguage() );
        bookEntity.isbn( bookDTO.getIsbn() );
        bookEntity.publicationDate( bookDTO.getPublicationDate() );
        bookEntity.numberOfPages( bookDTO.getNumberOfPages() );
        bookEntity.authorList( authorToEntityList( bookDTO.getAuthorList() ) );
        bookEntity.librarieList( libraryDTOListToLibraryEntityList( bookDTO.getLibrarieList() ) );
        bookEntity.editor( editorDTOToEditorEntity( bookDTO.getEditor() ) );
        bookEntity.loanList( loanDTOListToLoanEntityList( bookDTO.getLoanList() ) );

        return bookEntity.build();
    }

    protected List<BookEntity> bookDTOListToBookEntityList(List<BookDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<BookEntity> list1 = new ArrayList<BookEntity>( list.size() );
        for ( BookDTO bookDTO : list ) {
            list1.add( bookDTOToBookEntity( bookDTO ) );
        }

        return list1;
    }
}
