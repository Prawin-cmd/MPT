package com.ModelProjectTask.Service;

import javax.naming.NameNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ModelProjectTask.Dao.MPTDao;
import com.ModelProjectTask.Entity.MPT;

@Service
public class MPTService {
	@Autowired
	MPTDao md;

	public String postAll(MPT m) {
		return md.postAll(m);
	}

	public String getName(int id) throws NameNotFoundException {
		if(md.getName(id).startsWith("S")) {
			return md.getName(id);
		} else {
			throw new NameNotFoundException("The Name coresponted to this 'id' Not Start With 'S' ");
		}
	}
}
