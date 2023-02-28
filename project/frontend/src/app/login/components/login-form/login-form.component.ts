import { Component, OnInit } from '@angular/core';
import { LoginFacade } from '../../login.facade';
import { Router } from '@angular/router';

// import { ViewChild } from '@angular/core';
// import { Observable } from 'rxjs';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css'],
})
export class LoginFormComponent {
  constructor(
    private readonly loginFacade: LoginFacade,
    private router: Router
  ) {}

  cpf: string = '';
  senha: string = '';
  async submit() {
    try {
      const res = await this.loginFacade.login(this.cpf, this.senha);
      if (res) this.router.navigate(['/cadastro-funcionario']);
      // redirect
      
    } catch (error) {
      console.log(error);
    }
    this.clear();
  }
  clear() {
    this.cpf = '';
    this.senha = '';
  }
}
