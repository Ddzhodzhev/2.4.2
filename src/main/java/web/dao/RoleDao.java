package web.dao;

import web.model.Role;
import java.util.List;

public interface RoleDao {
    void createRole(Role role);

    void updateRole(Role role);

    void removeRole(int id);

    List<Role> getRoles();

    Role getRoleByName(String name);

}