package main.java.com.treino.api;

@FeignClient(name = "aluno-service")
public interface AlunoClient {
    @GetMapping("/alunos/{id}")
    Aluno getAluno(@PathVariable("id") String id);
}
