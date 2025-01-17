package com.example.demo.dto;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.model.Usuario;

import java.util.Collection;

public class UsuarioCustomDTO implements UserDetails {

    private String login;
    private String senha;
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
    
    public UsuarioCustomDTO(Usuario usuario) {
        this.login = usuario.getLogin();
        this.senha = usuario.getSenha();
    }
    
    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}