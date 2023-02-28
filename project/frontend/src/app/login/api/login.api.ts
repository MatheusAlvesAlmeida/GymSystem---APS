import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable()
export class LoginApi {
  private headers = new HttpHeaders({ 'Content-Type': 'application/json' });
  private baseUrl = 'http://localhost:8080/api/funcionarios/login';

  public constructor(private readonly http: HttpClient) {}

  public login(cpf: string, senha: string) {
    return this.http.post(this.baseUrl + { cpf: cpf, password: senha }, {
      headers: this.headers,
    });
  }
}
