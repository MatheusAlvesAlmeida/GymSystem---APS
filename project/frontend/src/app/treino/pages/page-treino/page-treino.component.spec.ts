import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PageTreinoComponent } from './page-treino.component';

describe('PageTreinoComponent', () => {
  let component: PageTreinoComponent;
  let fixture: ComponentFixture<PageTreinoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PageTreinoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PageTreinoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
