package org.thibaut.thelibrary.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.thibaut.thelibrary.dto.CoordinatesDTO;
import org.thibaut.thelibrary.dto.CoordinatesDTO.CoordinatesDTOBuilder;
import org.thibaut.thelibrary.dto.EditorDTO;
import org.thibaut.thelibrary.dto.EditorDTO.EditorDTOBuilder;
import org.thibaut.thelibrary.dto.LibraryDTO;
import org.thibaut.thelibrary.dto.LibraryDTO.LibraryDTOBuilder;
import org.thibaut.thelibrary.entity.CoordinatesEntity;
import org.thibaut.thelibrary.entity.CoordinatesEntity.CoordinatesEntityBuilder;
import org.thibaut.thelibrary.entity.EditorEntity;
import org.thibaut.thelibrary.entity.EditorEntity.EditorEntityBuilder;
import org.thibaut.thelibrary.entity.LibraryEntity;
import org.thibaut.thelibrary.entity.LibraryEntity.LibraryEntityBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-24T11:17:42+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.3 (Oracle Corporation)"
)
public class EditorMapperImpl implements EditorMapper {

    @Override
    public EditorDTO editorToDTO(EditorEntity editorEntity) {
        if ( editorEntity == null ) {
            return null;
        }

        EditorDTOBuilder editorDTO = EditorDTO.builder();

        editorDTO.id( editorEntity.getId() );
        editorDTO.name( editorEntity.getName() );
        editorDTO.coordinates( coordinatesEntityToCoordinatesDTO( editorEntity.getCoordinates() ) );

        return editorDTO.build();
    }

    @Override
    public List<EditorDTO> editorToDTOList(List<EditorEntity> editorEntityList) {
        if ( editorEntityList == null ) {
            return null;
        }

        List<EditorDTO> list = new ArrayList<EditorDTO>( editorEntityList.size() );
        for ( EditorEntity editorEntity : editorEntityList ) {
            list.add( editorToDTO( editorEntity ) );
        }

        return list;
    }

    @Override
    public EditorEntity editorToEntity(EditorDTO editorDTO) {
        if ( editorDTO == null ) {
            return null;
        }

        EditorEntityBuilder editorEntity = EditorEntity.builder();

        editorEntity.id( editorDTO.getId() );
        editorEntity.name( editorDTO.getName() );
        editorEntity.coordinates( coordinatesDTOToCoordinatesEntity( editorDTO.getCoordinates() ) );

        return editorEntity.build();
    }

    @Override
    public List<EditorEntity> editorToEntityList(List<EditorDTO> editorDTOList) {
        if ( editorDTOList == null ) {
            return null;
        }

        List<EditorEntity> list = new ArrayList<EditorEntity>( editorDTOList.size() );
        for ( EditorDTO editorDTO : editorDTOList ) {
            list.add( editorToEntity( editorDTO ) );
        }

        return list;
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
        coordinatesDTO.editor( editorToDTO( coordinatesEntity.getEditor() ) );
        coordinatesDTO.library( libraryEntityToLibraryDTO( coordinatesEntity.getLibrary() ) );

        return coordinatesDTO.build();
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
        coordinatesEntity.editor( editorToEntity( coordinatesDTO.getEditor() ) );
        coordinatesEntity.library( libraryDTOToLibraryEntity( coordinatesDTO.getLibrary() ) );

        return coordinatesEntity.build();
    }
}
