import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastroFuncionarioFormComponent } from './cadastro-funcionario-form.component';

describe('CadastroFuncionarioComponent', () => {
  let component: CadastroFuncionarioFormComponent;
  let fixture: ComponentFixture<CadastroFuncionarioFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CadastroFuncionarioFormComponent],
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CadastroFuncionarioFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
