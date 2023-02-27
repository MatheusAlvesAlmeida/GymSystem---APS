import { Component, OnInit } from '@angular/core';
// import { LoginFacade } from '../../login.facade';
import { GoogleApiService } from './google-api.service';

// import { ViewChild } from '@angular/core';
// import { Observable } from 'rxjs';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css'],
})
export class LoginFormComponent implements OnInit {
  constructor(
    // private readonly loginFacade: LoginFacade,
    private readonly google: GoogleApiService
  ) {}

  ngOnInit(): void {}
}
