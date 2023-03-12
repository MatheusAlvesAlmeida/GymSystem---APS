import { NgModule } from '@angular/core';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomeComponent } from './pages/home.component';
import { HomeRoutingModule } from './home-routing.module';
import { MatCardModule } from '@angular/material/card';

import { CommonModule } from '@angular/common';

@NgModule({
  providers: [],
  declarations: [HomeComponent, NavbarComponent],
  imports: [CommonModule, HomeRoutingModule, MatCardModule],
})
export class HomeModule {}
