import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {FormsModule}  from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component'

@NgModule({
  declarations: [       // components
    AppComponent, HomeComponent, AboutusComponent, ContactusComponent
  ],
  imports: [          // modules
    BrowserModule,
    AppRoutingModule,
    FormsModule

  ],
  providers: [],   // service classes
  bootstrap: [AppComponent]
})
export class AppModule { }
