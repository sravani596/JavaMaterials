import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {FormsModule}  from '@angular/forms';
import { ControlstructuresComponent } from './controlstructures/controlstructures.component';
import { CardhoverDirective } from './cardhover.directive'

@NgModule({
  declarations: [       // components or custom-directives or custom-pipes will be declare here
    AppComponent, ControlstructuresComponent, CardhoverDirective
  ],
  imports: [          // all types of modules
    BrowserModule,
    AppRoutingModule,
    FormsModule


  ],
  providers: [],   //all user-defined service classes
  bootstrap: [AppComponent]
})
export class AppModule { }
