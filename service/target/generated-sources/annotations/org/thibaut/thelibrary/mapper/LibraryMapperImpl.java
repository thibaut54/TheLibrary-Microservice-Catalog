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
    date = "2020-01-23T09:16:52+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_211 (Oracle Corporation)"
)
public class LibraryMapperImpl implements LibraryMapper {

    @Override
    public LibraryDTO libraryToDTO(LibraryEntity libraryEntity) {
        if ( libraryEntity == null ) {
            return null;
        }

        LibraryDTOBuilder libraryDTO = LibraryDTO.builder();

        libraryDTO.id( libraryEntity.getId() );
        libraryDTO.name( libraryEntity.getName() );
        libraryDTO.coordinates( coordinatesEntityToCoordinatesDTO( libraryEntity.getCoordinates() ) );

        return libraryDTO.build();
    }

    @Override
    public List<LibraryDTO> libraryToDTOList(List<LibraryEntity> libraryEntityList) {
        if ( libraryEntityList == null ) {
            return null;
        }

        List<LibraryDTO> list = new ArrayList<LibraryDTO>( libraryEntityList.size() );
        for ( LibraryEntity libraryEntity : libraryEntityList ) {
            list.add( libraryToDTO( libraryEntity ) );
        }

        return list;
    }

    @Override
    public LibraryEntity libraryToEntity(LibraryDTO libraryDTO) {
        if ( libraryDTO == null ) {
            return null;
        }

        LibraryEntityBuilder libraryEntity = LibraryEntity.builder();

        libraryEntity.id( libraryDTO.getId() );
        libraryEntity.name( libraryDTO.getName() );
        libraryEntity.coordinates( coordinatesDTOToCoordinatesEntity( libraryDTO.getCoordinates() ) );

        return libraryEntity.build();
    }

    @Override
    public List<LibraryEntity> libraryToEntityList(List<LibraryDTO> libraryDTOList) {
        if ( libraryDTOList == null ) {
            return null;
        }

        List<LibraryEntity> list = new ArrayList<LibraryEntity>( libraryDTOList.size() );
        for ( LibraryDTO libraryDTO : libraryDTOList ) {
            list.add( libraryToEntity( libraryDTO ) );
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
        coordinatesDTO.library( libraryToDTO( coordinatesEntity.getLibrary() ) );

        return coordinatesDTO.build();
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
        coordinatesEntity.library( libraryToEntity( coordinatesDTO.getLibrary() ) );

        return coordinatesEntity.build();
    }
}
