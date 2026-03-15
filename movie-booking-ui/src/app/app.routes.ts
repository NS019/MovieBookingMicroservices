import { Routes } from '@angular/router';

export const routes: Routes = [

  {
    path: '',
    redirectTo: 'movies',
    pathMatch: 'full'
  },

  {
    path: 'movies',
    loadComponent: () =>
      import('./features/movies/pages/movie-list/movie-list')
        .then(m => m.MovieList)
  },

  {
    path: 'browse',
    loadComponent: () =>
      import('./features/browse/pages/browse-page/browse-page')
        .then(m => m.BrowsePage)
  },

  {
    path: 'booking/:showId',
    loadComponent: () =>
      import('./features/booking/pages/seat-selection/seat-selection')
        .then(m => m.SeatSelection)
  },


  {
    path: '**',
    redirectTo: 'movies'
  }

];
