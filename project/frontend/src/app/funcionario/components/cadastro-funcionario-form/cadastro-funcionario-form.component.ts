import { Component, OnInit } from '@angular/core';
import { CadastroFuncionarioFacade } from '../../cadastro-funcionario.facade';
// import { ViewChild } from '@angular/core';
// import { Observable } from 'rxjs';

@Component({
  selector: 'app-cadastro-funcionario-form',
  templateUrl: './cadastro-funcionario-form.component.html',
  styleUrls: ['./cadastro-funcionario-form.component.css'],
})
export class CadastroFuncionarioFormComponent implements OnInit {
  cpf: string = '';
  senha: string = '';
  nome: string = '';
  telefone: string = '';
  dataNascimento: string = '';
  email: string = '';
  cargo: string = '';
  salario: number = 0;
  dataAdmissao: string = '';

  constructor(
    private readonly cadastroFuncionarioFacade: CadastroFuncionarioFacade
  ) {}

  ngOnInit(): void {}
  async cadastrarFuncionario() {
    const funcionario = {
      cpf: this.cpf,
      senha: this.senha,
      nome: this.nome,
      telefone: this.telefone,
      dataNascimento: this.dataNascimento,
      email: this.email,
      cargo: this.cargo,
      salario: this.salario,
      dataAdmissao: this.dataAdmissao,
    };
    const result = await
      this.cadastroFuncionarioFacade.cadastrarFuncionario(funcionario);
    console.log(result);
  }
}
