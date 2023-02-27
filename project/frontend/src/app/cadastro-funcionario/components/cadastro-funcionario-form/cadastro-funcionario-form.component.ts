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
  nome: string = '';
  dataNascimento: string = '01/01/2000';
  salario: number = 0;
  cpf: string = '';

  constructor(
    private readonly cadastroFuncionarioFacade: CadastroFuncionarioFacade
  ) {}

  ngOnInit(): void {}
  cadastrarFuncionario() {
    const funcionario = {
      nome: this.nome,
      dataNascimento: this.dataNascimento,
      salario: this.salario,
      cpf: this.cpf,
    };
    const result =
      this.cadastroFuncionarioFacade.cadastrarFuncionario(funcionario);
    console.log(result);
  }
}
