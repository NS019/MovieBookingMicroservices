import { Component, OnInit } from '@angular/core';
import { MatCard } from '@angular/material/card';
import { FormBuilder, FormGroup, NgForm, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatFormField, MatLabel } from '@angular/material/form-field';
import { MaterialModule } from "../../../../../shared/material.module";
import { MovieService } from '../../service/movie-service';
import { title } from 'process';
import { Movie } from '../../models/movie';
import { MatTableModule } from '@angular/material/table';
import { CommonModule } from '@angular/common';
import { Observable, shareReplay } from 'rxjs';

@Component({
  selector: 'app-add-movie',
  imports: [MatCard, ReactiveFormsModule, MatFormField, MatLabel,
    MaterialModule, MatTableModule, CommonModule],
  templateUrl: './add-movie.html',
  styleUrl: './add-movie.css',
})
export class AddMovie implements OnInit {
  movieForm!: FormGroup;
  loading = false;
  //movies: Movie[] = [];
  movies$!: Observable<Movie[]>;

  constructor(private fb: FormBuilder, private movieService: MovieService) {
    this.movieForm = this.fb.group({
      movieName: ['', [Validators.required]],
      duration: ['', Validators.required],
      language: ['', Validators.required],
      releaseDate: ['', Validators.required]
    })
  }

  ngOnInit(): void {
    this.loadMovies();
  }

  loadMovies() {
    this.movies$ = this.movieService.getAllMovies() .pipe(shareReplay(1));;
  }

  submitMovie() {
    if (this.movieForm.invalid) return;
    
    const formValue = this.movieForm.value;

    const payload = {
      ...formValue,
      releaseDate: new Date(formValue.releaseDate).toISOString()
    }

    this.loading = true;
    this.movieService.addMovie(payload)
      .subscribe({
        next: () => {
          alert('movie added successfully');
          this.movieForm.reset();

          // Important: Refresh List
          this.loadMovies();
          this.loading = false;
        },
        error: () => {
          alert('Error adding Movie');
          this.loading = false;
        }
      })
  }
}
