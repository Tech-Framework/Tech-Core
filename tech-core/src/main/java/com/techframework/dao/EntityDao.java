package com.techframework.dao;

import java.util.List;

import com.techframework.criteria.Criteria;
import com.techframework.entity.Entity;
import com.techframework.key.Key;

public interface EntityDao <E extends Entity, S extends Criteria, K extends Key> {

	Entity find(Key key);	
	List<Entity> search(Criteria criteria);
	Integer insert(Entity entity);
	Integer update(Entity entity);
	Integer delete(Entity entity);
	
}
