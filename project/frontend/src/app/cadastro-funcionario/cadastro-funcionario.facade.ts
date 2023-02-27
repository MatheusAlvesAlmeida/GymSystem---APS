import { Injectable } from '@angular/core';
import { CadastroFuncionarioApi } from './api/cadastro-funcionario.api';
import { CadastroFuncionarioState } from './state/cadastro-funcionario.state';

@Injectable()
export class CadastroFuncionarioFacade {
  public constructor(private readonly api: CadastroFuncionarioApi) {}

  public cadastrarFuncionario(funcionario: Object) {
    return this.api.cadastrarFuncionario(funcionario);
  }
}
