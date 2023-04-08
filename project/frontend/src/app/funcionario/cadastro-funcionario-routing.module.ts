import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastroFuncionarioComponent } from './pages/cadastro-funcionario.component';

const routes: Routes = [
  {
    path: 'cadastro-funcionario',
    component: CadastroFuncionarioComponent,
    data: {
      id: 'cadastro-funcionario',
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
