import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FinishtypeListComponent } from './finishtype-list.component';

describe('FinishtypeListComponent', () => {
  let component: FinishtypeListComponent;
  let fixture: ComponentFixture<FinishtypeListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FinishtypeListComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FinishtypeListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
