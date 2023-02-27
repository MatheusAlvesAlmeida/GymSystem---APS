import { NgModule } from '@angular/core';
import { CadastroFuncionarioApi } from './api/cadastro-funcionario.api';
import { CadastroFuncionarioFormComponent } from './components/cadastro-funcionario-form/cadastro-funcionario-form.component';
import { CadastroFuncionarioFacade } from './cadastro-funcionario.facade';
import { CadastroFuncionarioComponent } from './pages/cadastro-funcionario.component';
import { CadastroFuncionarioRoutingModule } from './cadastro-funcionario-routing.module';
import { MatCardModule } from '@angular/material/card';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatButtonModule } from '@angular/material/button';
import { FormsModule } from '@angular/forms';

import { CommonModule } from '@angular/common';

@NgModule({
  providers: [CadastroFuncionarioFacade, CadastroFuncionarioApi],
  declarations: [
    CadastroFuncionarioComponent,
    CadastroFuncionarioFormComponent,
  ],
  imports: [
    CommonModule,
    CadastroFuncionarioRoutingModule,
    MatCardModule,
    MatInputModule,
    MatFormFieldModule,
    FormsModule,
    MatDatepickerModule,
    MatButtonModule,
  ],
})
export class CadastroFuncionarioModule {}
