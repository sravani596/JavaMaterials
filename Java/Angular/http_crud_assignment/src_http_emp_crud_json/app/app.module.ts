import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {FormsModule}  from '@angular/forms';
import { EmployeeComponent } from './employee/employee.component'
import {HttpClientModule} from '@angular/common/http'

@NgModule({
  declarations: [       // components
    AppComponent, EmployeeComponent
  ],
  imports: [          // modules
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule

  ],
  providers: [],   // service classes
  bootstrap: [AppComponent]
})
export class AppModule { }
