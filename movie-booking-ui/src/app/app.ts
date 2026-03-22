import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { AdminDashboard } from "./features/admin/pages/admin-dashboard/admin-dashboard";
import { AddMovie } from "./features/admin/movies/pages/add-movie/add-movie";
import { TheatreManagement } from "./features/admin/theatres/pages/theatre.management/theatre.management";

@Component({
  selector: 'app-root',
  imports: [TheatreManagement],
  templateUrl: './app.html',
  standalone:true,
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('movie-booking-ui');
}
