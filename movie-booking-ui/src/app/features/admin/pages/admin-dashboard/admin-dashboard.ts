import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MaterialModule } from '../../../../shared/material.module';
import { DashboardService } from '../../service/dashboard.service';



@Component({
selector:'app-admin-dashboard',
standalone:true,
imports:[CommonModule,MaterialModule],
templateUrl:'./admin-dashboard.html',
styleUrls:['./admin-dashboard.css']
})
export class AdminDashboard implements OnInit{

movies=0;
theatres=0;
shows=0;
bookings=0;

constructor(private dashboardService:DashboardService){}

ngOnInit(){

this.dashboardService.getMovies()
.subscribe((data:any)=> this.movies=data.length);

this.dashboardService.getTheatres()
.subscribe((data:any)=> this.theatres=data.length);

this.dashboardService.getShows()
.subscribe((data:any)=> this.shows=data.length);

this.dashboardService.getBookings()
.subscribe((data:any)=> this.bookings=data.length);

}

}