import { Component, OnInit } from '@angular/core';
import { Title } from '@angular/platform-browser';

@Component({
  selector: 'app-cadastro-funcionario',
  templateUrl: './cadastro-funcionario.component.html',
  styleUrls: ['./cadastro-funcionario.component.css'],
})
export class CadastroFuncionarioComponent implements OnInit {
  constructor(private titleService: Title) {
    this.titleService.setTitle('CadastroFuncionario');
  }

  ngOnInit(): void {}
}
