package com.wipro.smjeight.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.smjeight.model.Data;
import com.wipro.smjeight.repo.DataRepository;

@Service
public class DataServiceImpl implements DataService {
	@Autowired
	public DataRepository repo;

	@Override
	public Data createData(Data data) {
		
		return repo.save(data);
	}

	@Override
	public Optional<Data> getByUUID(UUID id) {
		
		return repo.findById(id);
	}

	

}
