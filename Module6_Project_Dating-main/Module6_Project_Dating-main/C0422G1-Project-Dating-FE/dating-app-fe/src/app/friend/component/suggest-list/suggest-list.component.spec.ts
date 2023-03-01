import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SuggestListComponent } from './suggest-list.component';

describe('SuggestListComponent', () => {
  let component: SuggestListComponent;
  let fixture: ComponentFixture<SuggestListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SuggestListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SuggestListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
