import { Injectable } from '@angular/core';
import { CadastroFuncionarioApi } from './api/cadastro-funcionario.api';
import { CadastroFuncionarioState } from './state/cadastro-funcionario.state';

@Injectable()
export class CadastroFuncionarioFacade {
  public constructor(
    private readonly state: CadastroFuncionarioState,
    private readonly api: CadastroFuncionarioApi
  ) {}

  public login(user: string) {
    return this.api.login(user);
  }
}
