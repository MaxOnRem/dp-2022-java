import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UmlEndComponent } from './uml-end.component';

describe('UmlEndComponent', () => {
  let component: UmlEndComponent;
  let fixture: ComponentFixture<UmlEndComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UmlEndComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UmlEndComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
