import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Theatre } from '../models/theatre';

@Injectable({
  providedIn: 'root',
})
export class TheatreService {
  private baseUrl = "http://localhost:8082/theatres";

  constructor(private http: HttpClient) {

  }

  getAll(): Observable<Theatre[]> {
    return this.http.get<Theatre[]>(this.baseUrl);
  }

  add(theatre: Theatre): Observable<any> {
    return this.http.post(this.baseUrl, theatre);
  }

  update(theatre: Theatre, id: number): Observable<any> {
    return this.http.put(`${this.baseUrl}/${id}`, theatre);
  }

  delete(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`);
  }
}
