import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../../../../environments/environment';


@Injectable({
providedIn:'root'
})
export class DashboardService{

//baseUrl = environment.apiGateway;

constructor(private http:HttpClient){}

getMovies(){

//return this.http.get(`${this.baseUrl}/movies`);

}

getTheatres(){

//return this.http.get(`${this.baseUrl}/theatres`);

}

getShows(){

//return this.http.get(`${this.baseUrl}/shows`);

}

getBookings(){

//return this.http.get(`${this.baseUrl}/bookings`);

}

}