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
    date = "2020-01-24T14:30:46+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.3 (Oracle Corporation)"
)
public class CoordinatesMapperImpl implements CoordinatesMapper {

    @Override
    public CoordinatesDTO coordionatesToDTO(CoordinatesEntity coordionatesEntity) {
        if ( coordionatesEntity == null ) {
            return null;
        }

        CoordinatesDTOBuilder coordinatesDTO = CoordinatesDTO.builder();

        coordinatesDTO.id( coordionatesEntity.getId() );
        coordinatesDTO.street( coordionatesEntity.getStreet() );
        coordinatesDTO.streetNumber( coordionatesEntity.getStreetNumber() );
        coordinatesDTO.additionalInformation( coordionatesEntity.getAdditionalInformation() );
        coordinatesDTO.city( coordionatesEntity.getCity() );
        coordinatesDTO.postalCode( coordionatesEntity.getPostalCode() );
        coordinatesDTO.phone( coordionatesEntity.getPhone() );
        coordinatesDTO.email( coordionatesEntity.getEmail() );
        coordinatesDTO.editor( editorEntityToEditorDTO( coordionatesEntity.getEditor() ) );
        coordinatesDTO.library( libraryEntityToLibraryDTO( coordionatesEntity.getLibrary() ) );

        return coordinatesDTO.build();
    }

    @Override
    public List<CoordinatesDTO> coordionatesToDTOList(List<CoordinatesEntity> coordionatesEntityList) {
        if ( coordionatesEntityList == null ) {
            return null;
        }

        List<CoordinatesDTO> list = new ArrayList<CoordinatesDTO>( coordionatesEntityList.size() );
        for ( CoordinatesEntity coordinatesEntity : coordionatesEntityList ) {
            list.add( coordionatesToDTO( coordinatesEntity ) );
        }

        return list;
    }

    @Override
    public CoordinatesEntity coordionatesToEntity(CoordinatesDTO coordionatesDTO) {
        if ( coordionatesDTO == null ) {
            return null;
        }

        CoordinatesEntityBuilder coordinatesEntity = CoordinatesEntity.builder();

        coordinatesEntity.id( coordionatesDTO.getId() );
        coordinatesEntity.street( coordionatesDTO.getStreet() );
        coordinatesEntity.streetNumber( coordionatesDTO.getStreetNumber() );
        coordinatesEntity.additionalInformation( coordionatesDTO.getAdditionalInformation() );
        coordinatesEntity.city( coordionatesDTO.getCity() );
        coordinatesEntity.postalCode( coordionatesDTO.getPostalCode() );
        coordinatesEntity.phone( coordionatesDTO.getPhone() );
        coordinatesEntity.email( coordionatesDTO.getEmail() );
        coordinatesEntity.editor( editorDTOToEditorEntity( coordionatesDTO.getEditor() ) );
        coordinatesEntity.library( libraryDTOToLibraryEntity( coordionatesDTO.getLibrary() ) );

        return coordinatesEntity.build();
    }

    @Override
    public List<CoordinatesEntity> coordionatesToEntityList(List<CoordinatesDTO> coordionatesDTOList) {
        if ( coordionatesDTOList == null ) {
            return null;
        }

        List<CoordinatesEntity> list = new ArrayList<CoordinatesEntity>( coordionatesDTOList.size() );
        for ( CoordinatesDTO coordinatesDTO : coordionatesDTOList ) {
            list.add( coordionatesToEntity( coordinatesDTO ) );
        }

        return list;
    }

    protected EditorDTO editorEntityToEditorDTO(EditorEntity editorEntity) {
        if ( editorEntity == null ) {
            return null;
        }

        EditorDTOBuilder editorDTO = EditorDTO.builder();

        editorDTO.id( editorEntity.getId() );
        editorDTO.name( editorEntity.getName() );
        editorDTO.coordinates( coordionatesToDTO( editorEntity.getCoordinates() ) );

        return editorDTO.build();
    }

    protected LibraryDTO libraryEntityToLibraryDTO(LibraryEntity libraryEntity) {
        if ( libraryEntity == null ) {
            return null;
        }

        LibraryDTOBuilder libraryDTO = LibraryDTO.builder();

        libraryDTO.id( libraryEntity.getId() );
        libraryDTO.name( libraryEntity.getName() );
        libraryDTO.coordinates( coordionatesToDTO( libraryEntity.getCoordinates() ) );

        return libraryDTO.build();
    }

    protected EditorEntity editorDTOToEditorEntity(EditorDTO editorDTO) {
        if ( editorDTO == null ) {
            return null;
        }

        EditorEntityBuilder editorEntity = EditorEntity.builder();

        editorEntity.id( editorDTO.getId() );
        editorEntity.name( editorDTO.getName() );
        editorEntity.coordinates( coordionatesToEntity( editorDTO.getCoordinates() ) );

        return editorEntity.build();
    }

    protected LibraryEntity libraryDTOToLibraryEntity(LibraryDTO libraryDTO) {
        if ( libraryDTO == null ) {
            return null;
        }

        LibraryEntityBuilder libraryEntity = LibraryEntity.builder();

        libraryEntity.id( libraryDTO.getId() );
        libraryEntity.name( libraryDTO.getName() );
        libraryEntity.coordinates( coordionatesToEntity( libraryDTO.getCoordinates() ) );

        return libraryEntity.build();
    }
}
