import { Component, OnInit } from '@angular/core';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit  {

    constructor(){

        console.log("stduent constructor called obj created");

    }


    ngOnInit(): void {
    
      console.log("ngOnInit() called..");
    
    }

    sid:number = 111;
    sname:string = "king"

    list:number[] =   [1,2,3,4,5 ];

}
