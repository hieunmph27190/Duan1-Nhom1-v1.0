package service.impl;

import java.util.List;
import java.util.UUID;

import domain.Role;
import repository.RoleRepository;
import service.RoleService;

public class RoleServiceImpl implements RoleService{
	private RoleRepository roleRepository;
	public RoleServiceImpl() {
		roleRepository=new RoleRepository();
	}
	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}
	@Override
	public List<Role> findAll(int first, int size) {
		return roleRepository.findAll(first, size);
	}
	@Override
	public Role findByID(UUID key) {
		return roleRepository.findByID(key);
	}
	@Override
	public void insert(Role entity) throws Exception {
		roleRepository.insert(entity);
	}
	@Override
	public void update(Role entity) throws Exception {
		roleRepository.update(entity);
	}
	@Override
	public void remove(UUID key) throws Exception {
		roleRepository.remove(key);
	}
	@Override
	public Long count() {
		return roleRepository.count();
	}
	
}