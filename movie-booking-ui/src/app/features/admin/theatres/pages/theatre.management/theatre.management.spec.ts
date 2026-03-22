import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TheatreManagement } from './theatre.management';

describe('TheatreManagement', () => {
  let component: TheatreManagement;
  let fixture: ComponentFixture<TheatreManagement>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TheatreManagement],
    }).compileComponents();

    fixture = TestBed.createComponent(TheatreManagement);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
