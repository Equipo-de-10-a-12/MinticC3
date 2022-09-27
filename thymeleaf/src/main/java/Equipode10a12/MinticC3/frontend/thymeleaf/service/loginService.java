package Equipode10a12.MinticC3.frontend.thymeleaf.service;
import Equipode10a12.MinticC3.frontend.thymeleaf.entity.empleado;
import Equipode10a12.MinticC3.frontend.thymeleaf.repository.IempleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service("userDetailsService")

public class loginService implements UserDetailsService {

    @Autowired
    private IempleadoRepository usuario;

    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        empleado emp = usuario.findByUsername(username);

        if(emp == null){
            throw new UsernameNotFoundException(username);
        }
        var roles = new ArrayList<GrantedAuthority>();
        roles.add(new SimpleGrantedAuthority( emp.getNombre()));
        return new User(emp.getNombre(), emp.getClave(), roles);
    }

        }


