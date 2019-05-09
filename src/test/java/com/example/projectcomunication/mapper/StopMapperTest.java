package com.example.projectcomunication.mapper;

import com.example.projectcomunication.dto.StopDto;
import com.example.projectcomunication.entity.Stop;
import com.example.projectcomunication.entity.TransportType;
import com.example.projectcomunication.repository.TransportTypeRepository;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.isNotNull;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class StopMapperTest {

    @Test
    public void stopDtoShouldReturnStopEntity (){
//
//        //given
//        StopDto stopDto = new StopDto("Z50", "32.002", "54.040", 1L);
//        Optional<Stop> optionalStop =
//                Optional.of(new Stop("Z50", "32.002", "54.040", new TransportType("bus")));
////        Stop stop = new Stop("Z50", "32.002", "54.040", transportType);
//        StopMapper stopMapper = mock(StopMapper.class);
//        given(stopMapper.dtoToEntity(stopDto)).willReturn(optionalStop);
//
//        //when
//        Optional<Stop> optionalStop1 = stopMapper.dtoToEntity(stopDto);
//
//        //then
//        verify(stopMapper).dtoToEntity(stopDto);
////        assertThat(optionalStop1.get(), isNotNull());
//
    }

}
