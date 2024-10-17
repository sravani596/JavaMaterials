import { Component } from '@angular/core';

@Component({
  selector: 'app-controlstructures',
  templateUrl: './controlstructures.component.html',
  styleUrls: ['./controlstructures.component.css']
})
export class ControlstructuresComponent {

    skill:string = "";

     bgcolor = "chocolate";
 
  
  employees = [

    {"id":101,"ename":"king","salary":50000} ,
    {"id":102,"ename":"tom","salary":40000} ,
    {"id":103,"ename":"smith","salary":20000} ,
    {"id":104,"ename":"ford","salary":10000}
  ];


}
