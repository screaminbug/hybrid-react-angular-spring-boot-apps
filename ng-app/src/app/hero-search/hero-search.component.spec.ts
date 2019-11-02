import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HeroSearchComponent } from './hero-search.component';
import {BrowserModule} from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import {AppRoutingModule} from '../app-routing.module';
import {HttpClientModule} from '@angular/common/http';
import {AppComponent} from '../app.component';
import {HeroesComponent} from '../heroes/heroes.component';
import {MessagesComponent} from '../messages/messages.component';
import {DashboardComponent} from '../dashboard/dashboard.component';
import {HeroDetailComponent} from '../hero-detail/hero-detail.component';

describe('HeroSearchComponent', () => {
  let component: HeroSearchComponent;
  let fixture: ComponentFixture<HeroSearchComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [
        HeroSearchComponent,
        AppComponent,
        HeroesComponent,
        MessagesComponent,
        DashboardComponent,
        HeroDetailComponent, ],
      imports: [
        BrowserModule,
        FormsModule,
        AppRoutingModule,
        HttpClientModule
      ],
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HeroSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
