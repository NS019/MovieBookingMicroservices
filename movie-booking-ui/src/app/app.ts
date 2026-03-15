import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { AdminDashboard } from "./features/admin/pages/admin-dashboard/admin-dashboard";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, AdminDashboard],
  templateUrl: './app.html',
  standalone:true,
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('movie-booking-ui');
}
