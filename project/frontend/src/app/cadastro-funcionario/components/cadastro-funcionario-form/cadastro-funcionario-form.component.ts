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
  constructor(
    private readonly cadastroFuncionarioFacade: CadastroFuncionarioFacade
  ) {}

  ngOnInit(): void {}
}
