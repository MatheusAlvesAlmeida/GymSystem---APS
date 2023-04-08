import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable()
export class TreinoAPI {
    private headers = new HttpHeaders({ 'Content-Type': 'application/json' });
    private baseUrl = 'http://localhost:8080/api/treinos';

    public constructor(private readonly http: HttpClient) { }

    public getTreinos() {
        return this.http.get(this.baseUrl, { headers: this.headers });
    }

    public getTreino(id: number) {
        return this.http.get(`${this.baseUrl}/${id}`, { headers: this.headers });
    }
    
    public createTreino(treino: any) {
        return this.http.post(this.baseUrl, treino, { headers: this.headers });
    }

    public updateTreino(id: number, treino: any) {
        return this.http.put(`${this.baseUrl}/${id}`, treino, { headers: this.headers });
    }

    public deleteTreino(id: number) {
        return this.http.delete(`${this.baseUrl}/${id}`, { headers: this.headers });
    }
}
