import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastroFuncionarioComponent } from './pages/cadastro-funcionario.component';

const routes: Routes = [
  {
    path: 'login',
    component: CadastroFuncionarioComponent,
    data: {
      id: 'login',
      title: 'CadastroFuncionario',
      icon: 'home',
    },
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CadastroFuncionarioRoutingModule {}
