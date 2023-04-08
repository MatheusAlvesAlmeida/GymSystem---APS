import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable()
export class AlunoAPI {
    private headers = new HttpHeaders({ 'Content-Type': 'application/json' });
    private baseUrl = 'http://localhost:8080/api/alunos';

    public constructor(private readonly http: HttpClient) { }

    public getAlunos() {
        return this.http.get(this.baseUrl);
    }

    public getAluno(id: number) {
        return this.http.get(this.baseUrl + '/' + id);
    }

    public cadastrarAluno(aluno: any) {
        return this.http.post(this.baseUrl, aluno);
    }

    public atualizarAluno(aluno: any) {
        return this.http.put(this.baseUrl, aluno);
    }

    public deletarAluno(id: number) {
        return this.http.delete(this.baseUrl + '/' + id);
    }
}
