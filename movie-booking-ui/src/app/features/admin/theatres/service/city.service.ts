import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { City } from '../models/theatre';

@Injectable({
  providedIn: 'root',
})
export class CityService {
  private baseUrl = "http://localhost:8082/cities";

  constructor(private http: HttpClient) { }

  getAllCities(): Observable<City[]> {
    return this.http.get<City[]>(this.baseUrl);
  }
}
