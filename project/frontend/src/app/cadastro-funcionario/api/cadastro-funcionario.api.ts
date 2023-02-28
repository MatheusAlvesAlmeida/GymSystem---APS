import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

// import { retry, map } from 'rxjs/operators';
// import { Observable } from 'rxjs';

@Injectable()
export class CadastroFuncionarioApi {
  private headers = new HttpHeaders({ 'Content-Type': 'application/json' });
  private baseUrl = 'http://localhost:8080/api/funcionarios';

  public constructor(private readonly http: HttpClient) {}

  public cadastrarFuncionario(funcionario: any) {
    console.log(funcionario)
    return this.http.post(this.baseUrl, funcionario).subscribe(res => {
      console.log(res)});
  }
}
