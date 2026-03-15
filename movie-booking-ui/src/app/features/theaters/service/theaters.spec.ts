import { TestBed } from '@angular/core/testing';

import { Theaters } from './theaters';

describe('Theaters', () => {
  let service: Theaters;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Theaters);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
