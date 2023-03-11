import { Injectable } from '@angular/core';
import axios from 'axios';

@Injectable()
export class LoginApi {
  private baseUrl = 'http://localhost:8080/api/funcionarios';

  public constructor() {}

  public async login(cpf: string, senha: string): Promise<any> {
    const url = `${this.baseUrl}/login`;
    try {
      const response = await axios.post(url, {
        cpf: cpf,
        password: senha,
      });
      return response;
    } catch (error: any) {
      console.error(error);
      if (error.response && error.response.status === 401)
        alert('CPF ou senha incorretos');
      return error;
    }
  }
}
