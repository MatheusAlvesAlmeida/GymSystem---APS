import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';

@Injectable()
export class LoginApi {
  private baseUrl = 'http://localhost:8080/api/funcionarios/login';

  public constructor(private readonly http: HttpClient) {}

  public login(cpf: string, senha: string) {
    const params = new HttpParams().set('cpf', cpf).set('password', senha);
    return this.http
      .post(this.baseUrl, null, {
        params: params,
      })
      .subscribe((response) => {
        return response;
      });
  }
}
