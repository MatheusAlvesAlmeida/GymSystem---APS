import { NgModule } from '@angular/core';
import { LoginApi } from './api/login.api';
import { LoginFormComponent } from './components/login-form/login-form.component';
import { LoginFacade } from './login.facade';
import { LoginComponent } from './pages/login.component';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { LoginRoutingModule } from './login-routing.module';
import { FormsModule } from '@angular/forms';
import { MatCardModule } from '@angular/material/card';
import { CommonModule } from '@angular/common';

@NgModule({
  providers: [LoginFacade, LoginApi],
  declarations: [LoginComponent, LoginFormComponent],
  imports: [
    CommonModule,
    LoginRoutingModule,
    MatFormFieldModule,
    MatButtonModule,
    MatInputModule,
    FormsModule,
    MatCardModule,
  ],
})
export class LoginModule {}
