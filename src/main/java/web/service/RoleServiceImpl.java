package web.service;

import web.dao.RoleDao;
import web.model.Role;

import java.util.List;

public class RoleServiceImpl implements RoleService{
    private RoleDao roleDao;

    @Override
    public void createRole(Role role) {
        roleDao.createRole(role);
    }

    @Override
    public Role readRole(int id) {
        return roleDao.readRole(id);
    }

    @Override
    public void updateRole(Long id, String role) {
        roleDao.updateRole(id,role);
    }

    @Override
    public void removeRole(int id) {
        roleDao.removeRole(id);
    }

    @Override
    public List<Role> getRoles() {
        return roleDao.getRoles();
    }

    @Override
    public Role getRoleByName(String name) {
        return roleDao.getRoleByName(name);
    }
}
