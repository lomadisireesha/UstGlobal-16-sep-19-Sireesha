import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayProductnameComponent } from './display-productname.component';

describe('DisplayProductnameComponent', () => {
  let component: DisplayProductnameComponent;
  let fixture: ComponentFixture<DisplayProductnameComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisplayProductnameComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplayProductnameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
