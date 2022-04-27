package com.wipro.smjeight.serviceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.wipro.smjeight.model.Data;
import com.wipro.smjeight.model.Dataa;
import com.wipro.smjeight.repo.DataRepository;
import com.wipro.smjeight.service.DataServiceImpl;

@ExtendWith(MockitoExtension.class)
public class DataServiceImplTest {
	
	@Mock
	private DataRepository repo;
	@InjectMocks
	private DataServiceImpl service;
	
	static Dataa testOutput;
	static Data testData;
	static Optional<Integer> num;
	 @BeforeAll
	    static void setVariables() {
	        testOutput = new Dataa("!@#$$",num,true);  
	        testData=new Data();
	        
	 }
	 @Test
	    void retrieveEntryException(UUID id) {
	        List<Data> resultList = new ArrayList<Data>();
	        resultList.add(testData);
	        Mockito.when(repo.findAll()).thenReturn(resultList);
	        assertEquals(service.getByUUID(id),resultList);
	        verify(repo, times(2)).findAll();
	    }
	 

}
