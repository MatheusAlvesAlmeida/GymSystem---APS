import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({ providedIn: 'root' })
export class CadastroFuncionarioState {
  private loading: BehaviorSubject<boolean> = new BehaviorSubject(
    false as boolean
  );

  public isLoading() {
    return this.loading.asObservable();
  }

  public setLoading(loading: boolean) {
    this.loading.next(loading);
  }

  // public getUser() {
  //   return this.expensesTable.asObservable();
  // }

  // public setUser(user: string) {
  //   this.expensesTable.next(user);
  // }
}
