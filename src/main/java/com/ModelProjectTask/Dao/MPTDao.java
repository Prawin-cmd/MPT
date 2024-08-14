package com.ModelProjectTask.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ModelProjectTask.Entity.MPT;
import com.ModelProjectTask.Repository.MPTRepository;

@Repository
public class MPTDao {
	@Autowired
	MPTRepository mr;
	
	
	
	public String postAll(MPT m) {
		mr.save(m);
		return "Posted";
	}



	public String getName(int id) {
		return mr.findById(id).get().getName();
	}

}
