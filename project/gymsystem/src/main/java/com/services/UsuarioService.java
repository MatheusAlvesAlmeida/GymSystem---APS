package com.services;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsuarios() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarioRepository.findAll().forEach(usuarios::add);
        return usuarios;
    }

    public Usuario getUsuario(String cpf) {
        return usuarioRepository.findById(cpf).get();
    }

    public void addUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void updateUsuario(String cpf, Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void deleteUsuario(String cpf) {
        usuarioRepository.deleteById(cpf);
    }
}
