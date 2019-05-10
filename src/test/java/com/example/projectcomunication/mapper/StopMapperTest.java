package com.example.projectcomunication.mapper;

import com.example.projectcomunication.dto.StopDto;
import com.example.projectcomunication.entity.Stop;
import com.example.projectcomunication.entity.TransportType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class StopMapperTest {

    @Mock
    StopMapper stopMapper;

    @Test
    public void stopDtoShouldReturnStopEntity (){

        //given
        StopDto stopDto = new StopDto(1L,"Z50", "32.002", "54.040", "bus");
        Stop stopReturnObject = new Stop("Z50", "32.002", "54.040", new TransportType("bus"));

        Mockito.when(stopMapper.dtoToEntity(stopDto)).thenReturn(stopReturnObject);
        //Mockito.when(stopMapper.count(123)).thenReturn(200);

//        given(stopMapper.dtoToEntity(stopDto)).willReturn(stopReturnObject);

        //when
        Stop stop = stopMapper.dtoToEntity(stopDto);
        //int count = stopMapper.count(123);

        //then
        //assertThat(stop, isNotNull());
        //assertEquals(stop, notNull());
//        verify(stopMapper).dtoToEntity(stopDto);

        assertThat(stop);
        Mockito.verify(stopMapper).dtoToEntity(stopDto);

        System.out.println(stop.getName());

//        Assert.assertEquals(200, count);
//        Mockito.verify(stopMapper).count(123);

    }

}
