import { TestBed } from '@angular/core/testing';

import { FinishtypeService } from './finishtype.service';

describe('FinishTypeServiceService', () => {
  let service: FinishtypeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FinishtypeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
