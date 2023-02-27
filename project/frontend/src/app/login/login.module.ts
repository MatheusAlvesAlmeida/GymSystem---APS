import { NgModule } from '@angular/core';
import { LoginApi } from './api/login.api';
import { LoginFormComponent } from './components/login-form/login-form.component';
import { LoginFacade } from './login.facade';
import { LoginComponent } from './pages/login.component';
import { LoginRoutingModule } from './login-routing.module';
import { CommonModule } from '@angular/common';

@NgModule({
  providers: [LoginFacade, LoginApi],
  declarations: [LoginComponent, LoginFormComponent],
  imports: [CommonModule, LoginRoutingModule],
})
export class LoginModule {}
