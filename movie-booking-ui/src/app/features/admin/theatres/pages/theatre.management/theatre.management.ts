import { CommonModule } from '@angular/common';
import { Component, NgModule, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormsModule, NgModel, ReactiveFormsModule, Validators } from '@angular/forms';
import { City, Theatre } from '../../models/theatre';
import { TheatreService } from '../../service/theatre.service';
import { CityService } from '../../service/city.service';
import { MatCard } from '@angular/material/card';
import { MaterialModule } from "../../../../../shared/material.module";
import { MatSelectModule } from '@angular/material/select';


@Component({
  selector: 'app-theatre',
  imports: [CommonModule, MatCard, FormsModule, ReactiveFormsModule, MaterialModule,
    MatSelectModule
  ],
  templateUrl: './theatre.management.html',
  styleUrl: './theatre.management.css',
})
export class TheatreManagement implements OnInit {
  form!: FormGroup;
  theatres: Theatre[] = [];
  cities: City[] = [];

  constructor(private fb: FormBuilder,
    private theatreService: TheatreService,
    private cityService: CityService) {
    this.form = fb.group({
      theatreName: ['', Validators.required],
      address: ['', Validators.required],
      cityId: ['', Validators.required]
    }
    )
  }

  ngOnInit(): void {
    this.loadTheatres();
    this.loadCities();
  }

  // Load Theatres
  loadTheatres() {
    this.theatreService.getAll().subscribe((data: Theatre[]) => {
      this.theatres = data;
    });
  }

  // Load Cities
  loadCities() {
    this.cityService.getAllCities().subscribe((data: City[]) => {
      this.cities = data;
    })
  }

  submit() {
    alert('submit clicked');
  }
}
