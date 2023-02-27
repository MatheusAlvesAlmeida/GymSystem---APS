import { NgModule } from '@angular/core';
import { CadastroFuncionarioApi } from './api/cadastro-funcionario.api';
import { CadastroFuncionarioFormComponent } from './components/cadastro-funcionario-form/cadastro-funcionario-form.component';
import { CadastroFuncionarioFacade } from './cadastro-funcionario.facade';
import { CadastroFuncionarioComponent } from './pages/cadastro-funcionario.component';
import { CadastroFuncionarioRoutingModule } from './cadastro-funcionario-routing.module';
import { CommonModule } from '@angular/common';

@NgModule({
  providers: [CadastroFuncionarioFacade, CadastroFuncionarioApi],
  declarations: [
    CadastroFuncionarioComponent,
    CadastroFuncionarioFormComponent,
  ],
  imports: [CommonModule, CadastroFuncionarioRoutingModule],
})
export class CadastroFuncionarioModule {}
