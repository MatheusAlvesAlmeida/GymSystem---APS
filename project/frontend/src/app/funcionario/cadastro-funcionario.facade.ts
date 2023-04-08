import { Injectable } from '@angular/core';
import { CadastroFuncionarioApi } from './api/funcionario.api';
import { CadastroFuncionarioState } from './state/cadastro-funcionario.state';

@Injectable()
export class CadastroFuncionarioFacade {
  public constructor(private readonly api: CadastroFuncionarioApi) {}

  public cadastrarFuncionario(funcionario: any) {
    return this.api.cadastrarFuncionario(funcionario);
  }
}
