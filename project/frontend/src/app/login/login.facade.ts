import { Injectable } from '@angular/core';
import { LoginApi } from './api/login.api';
import { LoginState } from './state/login.state';

@Injectable()
export class LoginFacade {
  public constructor(
    private readonly state: LoginState,
    private readonly api: LoginApi
  ) {}

  public login(cpf: string, senha: string) {
    return this.api.login(cpf, senha);
  }
}
